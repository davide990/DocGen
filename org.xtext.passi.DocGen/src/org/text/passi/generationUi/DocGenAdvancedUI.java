package org.text.passi.generationUi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xtext.passi.docGen.element;
import org.xtext.passi.generator.DocumentationBuilder;
import org.xtext.passi.generator.DocumentationFileSaver;
import org.xtext.passi.generator.DocxBuilder;
import org.xtext.passi.generator.HtmlBuilder;
import org.xtext.passi.generator.PdfBuilder;
import org.xtext.passi.generator.TemplateLanguageGenerator;
import org.xtext.passi.metamodels.MetamodelsLoader;
import org.xtext.passi.template.TemplateParser;
import org.xtext.passi.ui.contentassist.TableData;
import org.xtext.passi.ui.contentassist.TemplateKeywords;

/**
 * The documentation generator launcher window. This window let the user
 * to choose which EClasses of feature include or exclude from the documentation, and
 * the diagram image to include in the documentation.
 * <br></br>
 * Made with SWT(http://www.eclipse.org/swt/) and WindowBuilder(http://www.eclipse.org/windowbuilder/) 
 * @author Davide Guastella(davide.guastella90@gmail.com)
 */
public class DocGenAdvancedUI 
{
	/**
	 * The values of this enumeration represents the style of the 
	 * output documentation.
	 * 
	 * @author davide
	 */
	public static enum DOCUMENTATION_STYLE
	{
		STYLE_FULL,
		STYLE_BY_ECLASS
	}
	
	Button IncludeDiagramImageCheckBox;
	
	Text diagramImagePathTextBox;
	
	/**
	 * The combo box control used to choose the type of the output documentation (PDF,HTML,...).
	 */
	Combo outputDocumentationTypeComboBox;
	
	/**
	 * The expand control is a container used to create drop down list for excluding 
	 * or including EClasses or EStructuralFeatures
	 */
	private ExpandBar expandBar;
	
	/**
	 * The button 
	 */
	private Button btnGenerate;
	
	/**
	 * This combo box control let the user select between Full documentation
	 * style or Ordered by EClass documentation style. 
	 */
	private Combo documentationStyleComboBox;
	
	
	/**
	 * This combo box is used to select the EClass for which set a custom
	 * presentation order in the final documentation.
	 */
	private Combo presentationOrderEClassComboBox;
	
	/**
	 * A check box for including or excluding the line separator at the 
	 * beginning of the documentation.
	 */
	private Button lineSeparatorCheckBox;
	
	/**
	 * A check box control for handling the adding of the border in the documentation tables.
	 */
	private Button putBorderInTablesCheckBox;
	
	/**
	 * The list of the excluded EClasses. These will not be included in the documentation.
	 */
	private java.util.List<String> excludedEClassesList;
	
	/**
	 * A data structure for handling the exclusion of the EClasses features. Every entry has
	 * the EClass name as <b>key</b>, while the <b>value</b> is a list of string representing the features 
	 * for the specified EClass that have to be excluded from the documentation.
	 */
	private HashMap<String, java.util.List<String>> excludedFeatures;
	
	private List featurePresentationOrderList;
	
	private Button btnLoadDiagramImage;
	
	/**
	 * A data structure that contains the order in which some features
	 * will be printed in the documentation tables. The key is the name
	 * of an EClass, while the value is a String that contains the name
	 * of the features, separated by a comma. For example:
	 * <br></br>
	 * <b>key</b>: "Actor", <b>value</b>: "Name,ActorCommunication"
	 * <br></br>
	 * <i>Note</i>: the value string doesn't have to include all the EClass features.
	 */
	private HashMap<String, String> featureOrder;
	
	
	private HashMap<String,String> templateData;
	
	/**
	 * This data structure is used to establish the header feature
	 * for the EClasses. The header field is a particular feature
	 * which value is printed before the table. The <b>key</b> is an 
	 * EClass name. The <b>value</b> is an EStructuralFeature name. 
	 */
	private HashMap<String, String> headerFeatures;
	
	/**
	 * This object handles the metamodel document related to
	 * the selected persistence model.
	 */
	private Document metamodelDoc;
	
	private Hashtable<String, String> persistenceModelHashTable;
	
	private EList<element> modelElements;
	
	
	//---------------
	
	/**
	 * The style of the output documentation. It can be:
	 * <br></br>
	 * <i>Full</i> - Produces a list of tables for each metamodel EClass<br></br>
	 * <i>By EClass</i> - User select one EClass and the output documentation is composed
	 * by many tables as the number of elements in the persistence model of the selected
	 * EClass type. 
	 */
	private DOCUMENTATION_STYLE documentationStyle = DOCUMENTATION_STYLE.STYLE_FULL;
	
	/**
	 * The absolute path to the diagram image file to include
	 * in the documentation 
	 */
	private String pathToDiagramImageFile;

	/**
	 * The combo box control used to choose the key EClass for
	 * by eclass documentation style.
	 */
	private Combo keyEClassComboBox;
	
	private final Shell shlDocgenAdvanced;
	
	private Display display;

	/**
	 * A radio button control to select Full documentation style
	 */
	private Button DocStyleFullRadioBtn;
	
	/**
	 * A radio button control to select by EClass documentation style
	 */
	private Button DocStyleByEClassRadioBtn;

	private Text supportedTemplateExtensionTextBox;
	private Text templateNameTextBox;
	private Text documentationTitleTextBox;
	private Text outputFileNameTextBox;
	private Text outputFolderTextBox;
	
	public DocGenAdvancedUI(Document metamodelDoc)
	{
		this.metamodelDoc = metamodelDoc;
		
		//Initialize the data structures
		excludedEClassesList 	= new ArrayList<String>();
		excludedFeatures 		= new HashMap<String, java.util.List<String>>();
		featureOrder 			= new HashMap<String, String>();
		headerFeatures 			= new HashMap<String, String>();
		
		//Initialize the shell object to display this window
		shlDocgenAdvanced = new Shell();
		
		//Initialize this window's UI controls.
		initializeUI();
		
		setEClassesInUIControls();
	}
	
	/**
	 * Initialize this window and all the controls
	 */
	private void initializeUI() 
	{
		display = Display.getDefault();
		shlDocgenAdvanced.setSize(560, 585);
		shlDocgenAdvanced.setText("Docgen - Advanced Configuration");
		
		btnGenerate = new Button(shlDocgenAdvanced, SWT.NONE);
		btnGenerate.setBounds(427, 512, 105, 25);
		btnGenerate.setText("Generate");
		btnGenerate.addSelectionListener(new SelectionListener() 
		{
			
			public void widgetSelected(SelectionEvent e) 
			{
				generateDocumentation();
			}
			
			public void widgetDefaultSelected(SelectionEvent e) 
			{}
		});
		
		Button btnCancel = new Button(shlDocgenAdvanced, SWT.NONE);
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				close();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBounds(316, 512, 105, 25);
		
		Button btnSaveAsTemplate = new Button(shlDocgenAdvanced, SWT.NONE);
		btnSaveAsTemplate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				saveTemplate();
			}
		});
		btnSaveAsTemplate.setText("Save Template File");
		btnSaveAsTemplate.setBounds(10, 512, 110, 25);
		
		TabFolder tabFolder = new TabFolder(shlDocgenAdvanced, SWT.NONE);
		tabFolder.setBounds(10, 10, 522, 496);
		
		TabItem tbtmTemplateInfo = new TabItem(tabFolder, SWT.NONE);
		tbtmTemplateInfo.setText("Template Info");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmTemplateInfo.setControl(composite);
		
		Label lblTemplateName = new Label(composite, SWT.NONE);
		lblTemplateName.setBounds(10, 10, 110, 15);
		lblTemplateName.setText("Template Name");
		
		templateNameTextBox = new Text(composite, SWT.BORDER);
		templateNameTextBox.setBounds(10, 31, 451, 21);
		
		documentationTitleTextBox = new Text(composite, SWT.BORDER);
		documentationTitleTextBox.setBounds(10, 79, 451, 21);
		
		Label lblDocumentationTile = new Label(composite, SWT.NONE);
		lblDocumentationTile.setBounds(10, 58, 140, 15);
		lblDocumentationTile.setText("Documentation Tile");
		
		lineSeparatorCheckBox = new Button(composite, SWT.CHECK);
		lineSeparatorCheckBox.setBounds(10, 156, 291, 16);
		lineSeparatorCheckBox.setText("Add a line separator after documentation title");
		
		documentationStyleComboBox = new Combo(composite, SWT.NONE);
		documentationStyleComboBox.setBounds(10, 127, 451, 23);
		documentationStyleComboBox.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				if(documentationStyleComboBox.getText().equals("Full Documentation"))
				{
					keyEClassComboBox.setEnabled(false);
					presentationOrderEClassComboBox.setEnabled(true);

					prepareExpandBar(DOCUMENTATION_STYLE.STYLE_FULL);
				}
				else
				{
					keyEClassComboBox.setEnabled(true);
					presentationOrderEClassComboBox.setEnabled(false);
					presentationOrderEClassComboBox.setText(keyEClassComboBox.getText());
					
					prepareExpandBar(DOCUMENTATION_STYLE.STYLE_BY_ECLASS);
				}
				
				setFeaturesOrderInListControl(presentationOrderEClassComboBox.getText());
				
			}
		});
		documentationStyleComboBox.setItems(new String[] {"Full Documentation", "Ordered by EClass"});
		documentationStyleComboBox.setText("Full Documentation");
		
		keyEClassComboBox = new Combo(composite, SWT.NONE);
		keyEClassComboBox.setEnabled(false);
		keyEClassComboBox.setBounds(10, 229, 451, 23);
		keyEClassComboBox.addSelectionListener(new SelectionListener() 
		{
			public void widgetSelected(SelectionEvent e) 
			{
				onKeyClassChanged();
			}
			
			public void widgetDefaultSelected(SelectionEvent e) 
			{}
		});
		
		Label lblCurrentEclass = new Label(composite, SWT.NONE);
		lblCurrentEclass.setBounds(10, 208, 122, 15);
		lblCurrentEclass.setText("Key EClass");
		
		Label lblDocumentationStyle = new Label(composite, SWT.NONE);
		lblDocumentationStyle.setBounds(10, 106, 140, 15);
		lblDocumentationStyle.setText("Documentation Style");
		
		outputDocumentationTypeComboBox = new Combo(composite, SWT.NONE);
		outputDocumentationTypeComboBox.setBounds(10, 279, 450, 23);
		outputDocumentationTypeComboBox.setItems(new String[] {"PDF", "HTML", "DOCX"});
		outputDocumentationTypeComboBox.setText("PDF");
		
		Label lblOutputDocumentationType = new Label(composite, SWT.NONE);
		lblOutputDocumentationType.setBounds(10, 258, 291, 15);
		lblOutputDocumentationType.setText("Output Documentation Type");
		
		supportedTemplateExtensionTextBox = new Text(composite, SWT.BORDER);
		supportedTemplateExtensionTextBox.setBounds(10, 329, 450, 21);
		
		Label lblSupportedPersistenceModel = new Label(composite, SWT.NONE);
		lblSupportedPersistenceModel.setToolTipText("The persistence model file extensione that this template supports");
		lblSupportedPersistenceModel.setBounds(10, 308, 248, 15);
		lblSupportedPersistenceModel.setText("Supported Persistence Model Extension");
		
		putBorderInTablesCheckBox = new Button(composite, SWT.CHECK);
		putBorderInTablesCheckBox.setBounds(10, 178, 129, 16);
		putBorderInTablesCheckBox.setText("Put borders in tables");
		
		Label lblOutputFileName = new Label(composite, SWT.NONE);
		lblOutputFileName.setBounds(10, 356, 95, 15);
		lblOutputFileName.setText("Output file name");
		
		outputFileNameTextBox = new Text(composite, SWT.BORDER);
		outputFileNameTextBox.setText("output.pdf");
		outputFileNameTextBox.setBounds(10, 379, 451, 21);
		
		Label lblOutputFolder = new Label(composite, SWT.NONE);
		lblOutputFolder.setBounds(10, 416, 100, 15);
		lblOutputFolder.setText("Output folder");
		
		outputFolderTextBox = new Text(composite, SWT.BORDER);
		outputFolderTextBox.setText("src-gen/");
		outputFolderTextBox.setBounds(10, 437, 451, 21);
		
		
		
		TabItem tbtmElementsToIncludeexclude = new TabItem(tabFolder, SWT.NONE);
		tbtmElementsToIncludeexclude.setText("Elements to include/exclude");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmElementsToIncludeexclude.setControl(composite_1);
		
		Label lblIncludeOrExclude = new Label(composite_1, SWT.NONE);
		lblIncludeOrExclude.setBounds(10, 10, 378, 15);
		lblIncludeOrExclude.setText("Include or exclude elements from documentation");
		
		expandBar = new ExpandBar(composite_1, SWT.V_SCROLL);
		expandBar.setBounds(10, 31, 494, 369);
		
		TabItem tbtmFeatureOrder = new TabItem(tabFolder, SWT.NONE);
		tbtmFeatureOrder.setText("Feature Order");
		
		Composite composite_5 = new Composite(tabFolder, SWT.NONE);
		tbtmFeatureOrder.setControl(composite_5);
		
		featurePresentationOrderList = new List(composite_5, SWT.BORDER);
		featurePresentationOrderList.setBounds(10, 60, 380, 340);
		
		Button btnMoveUp = new Button(composite_5, SWT.NONE);
		btnMoveUp.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				moveUpFeatureInOrderList(featurePresentationOrderList.getSelectionIndex());
			}
		});
		btnMoveUp.setBounds(396, 60, 108, 25);
		btnMoveUp.setText("Move up");
		
		Button btnMoveDown = new Button(composite_5, SWT.NONE);
		btnMoveDown.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				moveDownFeatureInOrderList(featurePresentationOrderList.getSelectionIndex());
			}
		});
		btnMoveDown.setBounds(396, 91, 108, 25);
		btnMoveDown.setText("Move down");
		
		Button btnSetAsHeader = new Button(composite_5, SWT.NONE);
		btnSetAsHeader.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				setSelectedFeatureAsHeaderField();
			}
		});
		btnSetAsHeader.setBounds(396, 142, 108, 25);
		btnSetAsHeader.setText("Set as Header Field");
		
		Label presentationOrderCurrentEClassLabel = new Label(composite_5, SWT.NONE);
		presentationOrderCurrentEClassLabel.setBounds(10, 10, 55, 15);
		presentationOrderCurrentEClassLabel.setText("EClass");
		
		presentationOrderEClassComboBox = new Combo(composite_5, SWT.NONE);
		presentationOrderEClassComboBox.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				setFeaturesOrderInListControl(presentationOrderEClassComboBox.getText());
			}
		});
		presentationOrderEClassComboBox.setBounds(10, 31, 380, 23);
		
		Button btnClearHeaderField = new Button(composite_5, SWT.NONE);
		btnClearHeaderField.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				unSetSelectedFeatureAsHeaderField();
			}
		});
		btnClearHeaderField.setBounds(396, 173, 108, 25);
		btnClearHeaderField.setText("Clear Header Field");
		
		TabItem tbtmDiagramImage = new TabItem(tabFolder, SWT.NONE);
		tbtmDiagramImage.setText("Diagram Image");
		
		Composite composite_6 = new Composite(tabFolder, SWT.NONE);
		tbtmDiagramImage.setControl(composite_6);
		
		IncludeDiagramImageCheckBox = new Button(composite_6, SWT.CHECK);
		IncludeDiagramImageCheckBox.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				if(IncludeDiagramImageCheckBox.getSelection())
				{
					diagramImagePathTextBox.setEnabled(true);
					btnLoadDiagramImage.setEnabled(true);
				}
				else
				{
					diagramImagePathTextBox.setEnabled(false);
					btnLoadDiagramImage.setEnabled(false);
				}
			}
		});
		IncludeDiagramImageCheckBox.setBounds(10, 10, 182, 16);
		IncludeDiagramImageCheckBox.setText("Include Diagram Image");
		
		Label lblDiagramImagePath = new Label(composite_6, SWT.NONE);
		lblDiagramImagePath.setBounds(10, 44, 165, 15);
		lblDiagramImagePath.setText("Diagram Image Path");
		
		diagramImagePathTextBox = new Text(composite_6, SWT.BORDER);
		diagramImagePathTextBox.setBounds(10, 65, 494, 21);
		diagramImagePathTextBox.setEnabled(false);
		
		btnLoadDiagramImage = new Button(composite_6, SWT.NONE);
		btnLoadDiagramImage.setBounds(429, 92, 75, 25);
		btnLoadDiagramImage.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				onLoadDiagramImageButtonSelected();
			}
		});
		btnLoadDiagramImage.setEnabled(false);
		btnLoadDiagramImage.setText("Load");
	}
	
	/**
	 * Generate the documentation
	 */
	private void generateDocumentation()
	{
		//Get the documentation type
		String documentationType = outputDocumentationTypeComboBox.getText();
		
		//Create a new documentation builder object
		DocumentationBuilder builder = null;
		
		if(documentationType.toLowerCase().equals("pdf"))
		{
			builder = new PdfBuilder(metamodelDoc, modelElements, persistenceModelHashTable, outputFileNameTextBox.getText());
		}
		else if(documentationType.toLowerCase().equals("html"))
		{
			builder = new HtmlBuilder(metamodelDoc, modelElements, persistenceModelHashTable, outputFileNameTextBox.getText());
		}
		else if(documentationType.toLowerCase().equals("docx"))
		{
			builder = new DocxBuilder(metamodelDoc, modelElements, persistenceModelHashTable, outputFileNameTextBox.getText());
		}
		else
		{
			MessageDialog.openError(null, "DocGen Error", "The specified output documentation file type is invalid!");
			return;
		}
		
		//Personalize the Look And Feel of the documentation 
		if(putBorderInTablesCheckBox.getSelection())
			builder.setTableBorder(true);
		
		builder.setKeyEClass(keyEClassComboBox.getText());
		
		if(IncludeDiagramImageCheckBox.getSelection())
			builder.setDiagramImageFile(diagramImagePathTextBox.getText());
		
		String docStyle = documentationStyleComboBox.getText();
		if(docStyle.equals("Full Documentation"))
			builder.setDocumentationStyle(DocGenAdvancedUI.DOCUMENTATION_STYLE.STYLE_FULL);
		else
			builder.setDocumentationStyle(DocGenAdvancedUI.DOCUMENTATION_STYLE.STYLE_BY_ECLASS);
		
		builder.setDocumentationTitle(documentationTitleTextBox.getText());
		builder.SetExcludedEClasses(excludedEClassesList);
		builder.setExcludedFeatures(excludedFeatures);
		builder.setFeaturesOrder(featureOrder);
		
		for(String s : headerFeatures.keySet())
			builder.setHeaderFieldForEClass(s, headerFeatures.get(s));
			
		//Builde the documentation
		builder.BuildDocumentation();
		
		StringConcatenation str = new StringConcatenation();
		str.append(DocumentationBuilder.getTempFilePath());
		str.append(File.separator);
		str.append("temp.");
		str.append(documentationType.toLowerCase());
		
		//Save the documentation file
		String tempFilePath = str.toString();
		
		String outFolder = outputFolderTextBox.getText();
		String outFileName = outputFileNameTextBox.getText();
		
		if(StringExtensions.isNullOrEmpty(outFolder))
			outFolder = "src-gen/";
		
		if(StringExtensions.isNullOrEmpty(outFileName))
		{
			MessageDialog.openError(null, "DocGen Error", "Please insert a name for the output documentation file.");
			return;
		}
		
		DocumentationFileSaver.save(tempFilePath, outFileName , outFolder);
		
		MessageDialog.openInformation(null, "DocGen", "Documentation generated!");
		
		//Close this window
		this.close();
	}
	
	
	public void setMetamodelDoc(Document m)
	{
		metamodelDoc = m;
	}
	
	public void setModelElements(EList<element> m)
	{
		modelElements = m;
	}
	
	public void setPersistenceModelHashTable(Hashtable<String, String> h)
	{
		persistenceModelHashTable = h;
	}
	
	/**
	 * Set the selected feature in the feature order list as the header feature.
	 * An header feature is a feature which value is printed before a table in the
	 * documentation.
	 */
	private void setSelectedFeatureAsHeaderField()
	{
		int selectedIdx = featurePresentationOrderList.getSelectionIndex();
		
		//If no item is selected, do nothing.
		if(selectedIdx == -1)
			return;
		
		//Get the selected feature name
		String selectedFeature = featurePresentationOrderList.getItem(selectedIdx);
		
		//Add "(H)" as prefix for the selected feature string in the feature order list box 
		if(selectedFeature.startsWith("(H)"))
			selectedFeature = selectedFeature.substring(3, selectedFeature.length());
		
		//Get the EClass related to the selected feature
		String EClass = presentationOrderEClassComboBox.getText();
		
		//If the EClass already has a header feature set, delete this.
		if(headerFeatures.containsKey(EClass))
			headerFeatures.remove(EClass);
		
		//Remove the prefix from the previous header feature
		for(int k=0;k<featurePresentationOrderList.getItemCount();k++)
		{
			String f = featurePresentationOrderList.getItem(k);
			if(f.startsWith("(H)"))
			{
				featurePresentationOrderList.remove(k);
				f = f.substring(3, f.length());
				
				featurePresentationOrderList.add(f, k);
			}
		}
		
		//Add the feature to the header feature structure
		headerFeatures.put(EClass, selectedFeature);
		
		//Add the new header feature with the prefix "(H)" into the order list 
		featurePresentationOrderList.remove(selectedIdx);
		featurePresentationOrderList.add("(H)" + selectedFeature, selectedIdx);
		featurePresentationOrderList.setSelection(selectedIdx);
	}
	
	/**
	 * Unset the header field for the selected EClass in the feature order list box control.
	 */
	private void unSetSelectedFeatureAsHeaderField()
	{
		int selectedIdx = featurePresentationOrderList.getSelectionIndex();
		
		//If no item is selected, do nothing.
		if(selectedIdx == -1)
			return;
		
		//Get the EClass related to the selected feature
		String EClass = presentationOrderEClassComboBox.getText();
		
		//If the EClass already has a header feature set, delete this.
		if(headerFeatures.containsKey(EClass))
			headerFeatures.remove(EClass);
		
		//Remove the prefix from the header feature string in the feature order list box control
		for(int k=0;k<featurePresentationOrderList.getItemCount();k++)
		{
			String f = featurePresentationOrderList.getItem(k);
			if(f.startsWith("(H)"))
			{
				featurePresentationOrderList.remove(k);
				f = f.substring(3, f.length());
				
				featurePresentationOrderList.add(f, k);
			}
		}
	}
	
	
	/**
	 * Save the documentation aspect's parameters as a template file.
	 */
	private void saveTemplate()
	{
		//Create a new template generator
		TemplateLanguageGenerator generator = new TemplateLanguageGenerator();
		
		//Set the template parameters
		generator.setExcludedEClasses(excludedEClassesList);
		generator.setExcludedFeatures(excludedFeatures);
		generator.setFeaturesOrder(featureOrder);
		generator.setTemplateTitle(templateNameTextBox.getText());
		generator.setSupportedExtension(supportedTemplateExtensionTextBox.getText());
		generator.setDocumentationTitle(documentationTitleTextBox.getText());
		generator.setTitleSeparator(lineSeparatorCheckBox.getSelection());
		generator.setIncludeDiagramImage(IncludeDiagramImageCheckBox.getSelection());
		generator.setDiagramImageFile(diagramImagePathTextBox.getText());
		generator.setHeaderFields(headerFeatures);
		generator.setKeyEClass(getKeyEClass());
		generator.setTableBorder(putBorderInTablesCheckBox.getSelection());
		
		if(documentationStyleComboBox.getText().equals("Full Documentation"))
			generator.setDocumentationStyle("full");
		else if(documentationStyleComboBox.getText().equals("Ordered by EClass"))
			generator.setDocumentationStyle("ordered");
		else
		{
			MessageDialog.openError(null, "Docgen Error", "The choosed documentation style is not valid.");
			return;
		}
		
		//Generate the template
		CharSequence template = generator.generateTemplate();
		
		//Save to disk
		FileDialog fd = new FileDialog(new Shell(), SWT.SAVE);
        fd.setText("Save Template");
        fd.setFilterPath("C:/");
        String[] filterExt = { "*.template" };
        fd.setFilterExtensions(filterExt);
        String selected = fd.open();
        
        File templateFile = new File(selected);
        
        //If the template file exists, ask user if he wants to overwrite it. 
        if(templateFile.exists())
        {
        	MessageBox messageBox = new MessageBox(this.shlDocgenAdvanced, SWT.ICON_QUESTION | SWT.YES | SWT.NO);
            
			messageBox.setText("Overwrite existing file");
			messageBox.setMessage("Overwrite file '" + templateFile.getAbsolutePath() + "' ?");
			int buttonID = messageBox.open();
			switch(buttonID) 
			{
			  case SWT.NO:
				  return;
			  case SWT.YES:
				  templateFile.delete();
				  try 
				  {
					templateFile.createNewFile();
				  } 
				  catch (IOException e) 
				  {
						e.printStackTrace();
				  }
				  break;
			}
			System.out.println(buttonID);
        }
        
        //write the template to file
        try {
			FileWriter writer = new FileWriter(templateFile);
			
			writer.append(template);
			writer.close();
			
			MessageDialog.openInformation(null, "DocGen", "Template saved");
		} 
        catch (IOException e) 
		
        {
			e.printStackTrace();
		}
	}
	
	/**
	 * Move up the selected feature in the feature order list control.This
	 * also affects the order in the feature order data structure.
	 * 
	 * @param selectionIndex the index of the selected feature in the list control
	 */
	private void moveUpFeatureInOrderList(int selectionIndex)
	{
		if(selectionIndex < 1)
			return;
		
		String selectedFeature = featurePresentationOrderList.getItem(selectionIndex);
		
		featurePresentationOrderList.remove(selectionIndex);
		featurePresentationOrderList.add(selectedFeature, selectionIndex-1);
		featurePresentationOrderList.setSelection(selectionIndex-1);
		
		saveFeaturesOrder();
	}
	
	/**
	 * Move down the selected feature in the feature order list control. This
	 * also affects the order in the feature order data structure.
	 * 
	 * @param selectionIndex the index of the selected feature in the list control
	 */
	private void moveDownFeatureInOrderList(int selectionIndex)
	{
		if(selectionIndex >= featurePresentationOrderList.getItemCount()-1)
			return;
		
		String selectedFeature = featurePresentationOrderList.getItem(selectionIndex);
		
		featurePresentationOrderList.remove(selectionIndex);
		featurePresentationOrderList.add(selectedFeature, selectionIndex+1);
		featurePresentationOrderList.setSelection(selectionIndex+1);
		
		saveFeaturesOrder();
	}
	
	/**
	 * Get the feature order in the order list control and save
	 * to the feature order data structure.
	 */
	private void saveFeaturesOrder()
	{
		String currentEclass = presentationOrderEClassComboBox.getText();
		
		featureOrder.remove(currentEclass);
		
		StringConcatenation s = new StringConcatenation();

		for(int i=0; i<featurePresentationOrderList.getItemCount()-1; i++)
		{
			String feature = featurePresentationOrderList.getItem(i);
			
			if(feature.startsWith("(H)"))
				feature = feature.substring(3, feature.length());
			
			s.append(feature);
			s.append(",");
		}
		
		s.append(featurePresentationOrderList.getItem(featurePresentationOrderList.getItemCount()-1));
		
		featureOrder.put(currentEclass, s.toString());
	}

	/**
	 * Get the features order for the specified EClass, and set the items of the
	 * order list control according to the feature order.
	 * @param selectedEClass
	 */
	private void setFeaturesOrderInListControl(String selectedEClass)
	{
		String[] order = null;
		
		String headerFeature = headerFeatures.get(selectedEClass);
		
		//Clear the order list
		featurePresentationOrderList.removeAll();
		featurePresentationOrderList.redraw();
		
		//Get the feature order specified in the template
		String orderString = featureOrder.get(selectedEClass);
		
		//Get the excluded feature list
		java.util.List<String> excludedFeatureList = excludedFeatures.get(selectedEClass);
		
		if(!StringExtensions.isNullOrEmpty(orderString))
		{
			order = orderString.split(",");
			
			for(String feature : order)
			{
				//Add the i-th feature to the list, only if it's
				//not an excluded feature
				if(excludedFeatureList != null && excludedFeatureList.contains(feature))
					continue;
				
				if(headerFeature != null && headerFeature.equals(feature))
					feature = "(H)" + feature;
					
				featurePresentationOrderList.add(feature);
			}
		}
		
		//Now add the remainings features to the list control.
		NodeList metamodel = metamodelDoc.getElementsByTagName("eClassifiers");
		
		for(int i=0; i<metamodel.getLength(); i++)
		{
			Element n = (Element)metamodel.item(i);
			
			if(!n.getAttribute("name").equals(selectedEClass))
				continue;
			
			NodeList features = n.getElementsByTagName("eStructuralFeatures");
			
			for (int k=0; k<features.getLength(); k++)
			{
				Element feature = (Element)features.item(k);
				String featureName = feature.getAttribute("name");
				
				if( containsString(order,featureName) ||
					(excludedFeatureList != null && excludedFeatureList.contains(featureName)))
					continue;
				
				if(headerFeature != null && headerFeature.equals(featureName))
					featureName = "(H)" + featureName;
				
				featurePresentationOrderList.add(featureName);
			}
		}
	}
	
	
	private boolean containsString(String[] source, String s)
	{
		if(source == null)
			return false;
		
		for(String str : source)
		{
			if(str.equals(str))
				return true;
		}
		
		return false;
	}
	
	/**
	 * Read the metamodel document and add the name of every EClass to
	 * the controls where it is needed (i.e. the key eclass combobox and the
	 * combo box control for selecting the EClass for which establish a
	 * presentation order for the table).
	 */
	private void setEClassesInUIControls()
	{
		NodeList eClassifiers = metamodelDoc.getElementsByTagName("eClassifiers");
		
		keyEClassComboBox.setText( ((Element)eClassifiers.item(0)).getAttribute("name") );
		
		for (int i=0;i < eClassifiers.getLength(); i++)
		{
			String eclassName = ((Element)eClassifiers.item(i)).getAttribute("name");
			
			keyEClassComboBox.add( eclassName );
			presentationOrderEClassComboBox.add( eclassName );
		}
	}
	
	//Sostanzialmente uguale al metodo che c'è nella classe
	//DocGenGenerator
	private void prepareExpandBar(DOCUMENTATION_STYLE style)
	{
		for(ExpandItem i : expandBar.getItems())
		{
			i.setExpanded(false);
			i.dispose();
		}
		expandBar.redraw();

		
		NodeList eClassifiers = metamodelDoc.getElementsByTagName("eClassifiers");
		
		//Loop every eClassifier
		for (int i=0; i < eClassifiers.getLength(); i++)
		{
			//get the i-th EClass
			Element currentEClassifier = (Element)eClassifiers.item(i);
			
			//get the EClass name
			String currentEClassName = currentEClassifier.getAttribute("name");
			
			if( style == DOCUMENTATION_STYLE.STYLE_BY_ECLASS && currentEClassName.equals(getKeyEClass()) || 
				style == DOCUMENTATION_STYLE.STYLE_FULL )
			{
				//Create a new ExpandItem
				ExpandItem xpndtmNewExpanditem = new ExpandItem(expandBar, SWT.NONE);
				xpndtmNewExpanditem.setExpanded(false);
				xpndtmNewExpanditem.setText(currentEClassName);
				
				//Create a new scrolled composite
				ScrolledComposite scrolledComposite = new ScrolledComposite(expandBar, SWT.V_SCROLL);
				xpndtmNewExpanditem.setControl(scrolledComposite);
				scrolledComposite.setExpandHorizontal(true);
				scrolledComposite.setExpandVertical(true);
	
				Composite composite = new Composite(scrolledComposite, SWT.NONE);
				composite.setLayout(new RowLayout(SWT.VERTICAL));
				
				//Checkbox for EClass/EStructuralFeature
				final ElementButton btnCheckButton = new ElementButton(composite);
				btnCheckButton.getButton().setText("Include/Exclude this element");
				btnCheckButton.setEClassifier(currentEClassName);
				
				if(excludedEClassesList.contains(currentEClassName))
					btnCheckButton.getButton().setSelection(false);
				else
					btnCheckButton.getButton().setSelection(true);
				
				btnCheckButton.getButton().addSelectionListener(new SelectionListener() 
				{
					public void widgetSelected(SelectionEvent e) 
					{
						onExpandBarItemSelectionChanged(btnCheckButton);
					}
					
					public void widgetDefaultSelected(SelectionEvent e) 
					{}
				});
				
				scrolledComposite.setContent(composite);
				
				
				//add a separator
				@SuppressWarnings("unused")
				Label label = new Label(composite, IntegerExtensions.bitwiseOr(SWT.SEPARATOR, SWT.HORIZONTAL));
				scrolledComposite.setContent(composite);
				scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
			
				//Now create the checkboxes for the eStructuralFeature
				NodeList eStructuralFeatureList = currentEClassifier.getElementsByTagName("eStructuralFeatures");
					
				//Convert NodeList to ArrayList
				java.util.List<Node> nodeList = new ArrayList<Node>();
			 	for(int k=0;k<eStructuralFeatureList.getLength();k++)
			 		nodeList.add(eStructuralFeatureList.item(k));
			 
			 	//TODO....
				//make a unique list of features (current and parent EClasses)
				//nodeList.addAll(getParentEClassFeatures(currentEClassifier))
				
				//Set the expand item height
				xpndtmNewExpanditem.setHeight(xpndtmNewExpanditem.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y + 20+10*nodeList.size());
				
				//Add the checkboxes for the EStructuralFeature
				for(int k=0; k<nodeList.size(); k++)
				{
					Element currentEStructuralFeature = (Element)nodeList.get(k);
					String featureName = currentEStructuralFeature.getAttribute("name");
				
					final ElementButton featureBtn = new ElementButton(composite);
					featureBtn.getButton().setText(featureName);
					featureBtn.setEClassifier(currentEClassName);
					featureBtn.setEStructuralFeature(featureName);
					
					if(isFeatureExcluded(currentEClassName, featureName))
						featureBtn.getButton().setSelection(false);
					else
						featureBtn.getButton().setSelection(true);
					
					if(excludedEClassesList.contains(currentEClassName))
						featureBtn.getButton().setEnabled(false);
					
					featureBtn.getButton().addSelectionListener(new SelectionListener() 
					{
						public void widgetSelected(SelectionEvent e) 
						{	
							onExpandBarItemSelectionChanged(featureBtn);
						}
						
						public void widgetDefaultSelected(SelectionEvent e) 
						{}
					});
					
					scrolledComposite.setContent(composite);
					scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
				}
			}
		}
	}
	
	/**
	 * Called when the selection of a check box inside an expandItem container
	 * is changed.
	 * @param btn
	 */
	private void onExpandBarItemSelectionChanged(ElementButton btn)
	{
		if(btn.getEStructuralFeature().isEmpty())
		{
			//EClass checkBox selection is changed
			if(btn.getButton().getSelection())
			{
				//CheckBox has been checked, so the referencing EClass must be included in documentation
				btn.setFeatureButtonsState(true);
				excludedEClassesList.remove(btn.getEClassifier());
				
				//Enable all the EStructuralFeature check boxes
				for(Control c : btn.getParent().getChildren())
				{
					if(c instanceof ElementButton)
					{
						if(((ElementButton) c).getEClassifier().isEmpty())
							c.setEnabled(true);
					}
				}
			}
			else
			{
				btn.setFeatureButtonsState(false);
				excludedEClassesList.add(btn.getEClassifier());
				
				//Disable all the EStructuralFeature check boxes
				for(Control c : btn.getParent().getChildren())
				{
					if(c instanceof ElementButton)
					{
						if(((ElementButton) c).getEClassifier().isEmpty())
							c.setEnabled(false);
					}
				}
			}
		}
		else
		{
			//EClass checkBox selection is changed
			if(btn.getButton().getSelection())
			{
				//CheckBox has been checked, so the referencing EClass must be included in documentation
				includeFeature(btn.getEClassifier(), btn.getEStructuralFeature());
			}
			else
				excludeFeature(btn.getEClassifier(), btn.getEStructuralFeature());
		}
	}
	
	/**
	 * Exclude a EStructuralFeature from the final documentation.
	 * @param EClassName
	 * @param featureName
	 */
	private void excludeFeature(String EClassName, String featureName)
	{
		java.util.List<String> excluded = excludedFeatures.get(EClassName);
		
		if(excluded == null)
			excluded = new ArrayList<String>();
		
		excludedFeatures.remove(EClassName);
		excluded.add(featureName);
		excludedFeatures.put(EClassName, excluded);
		
		removeFeatureFromOrderList(EClassName, featureName);
		setFeaturesOrderInListControl(EClassName);
	}
	
	
	/**
	 * Include a feature in the documentation. This methods also add the 
	 * specified feature to the feature order list
	 * 
	 * @param EClassName
	 * @param featureName
	 */
	private void includeFeature(String EClassName, String featureName)
	{
		java.util.List<String> excluded = excludedFeatures.get(EClassName);
		
		if(excluded == null)
			excluded = new ArrayList<String>();
		
		excludedFeatures.remove(EClassName);
		excluded.remove(featureName);
		excludedFeatures.put(EClassName, excluded);
		
		includeFeatureInOrderList(EClassName, featureName);
		setFeaturesOrderInListControl(EClassName);
	}
	
	/**
	 * Remove a feature from the order list box control.
	 * @param EClass
	 * @param featureName
	 */
	private void removeFeatureFromOrderList(String EClass, String featureName)
	{
		String order = featureOrder.get(EClass); 
		
		if(StringExtensions.isNullOrEmpty(order))
			return;
		
		String[] featuresInOrder = featureOrder.get(EClass).split(","); 
		StringBuilder sb = new StringBuilder();
		
		for(int k=0; k<featuresInOrder.length; k++)
		{
			if(!featuresInOrder[k].equals(featureName))
			{	sb.append(featuresInOrder[k]);
			
				if(k < featuresInOrder.length-1)
					sb.append(",");
			}
		}
		
		featureOrder.remove(EClass);
		featureOrder.put(EClass, sb.toString());
		
		setFeaturesOrderInListControl(EClass);
	}
	
	/**
	 * Add a feature into the order list box control.
	 * @param EClass
	 * @param featureName
	 */
	private void includeFeatureInOrderList(String EClass, String featureName)
	{
		String order = featureOrder.get(EClass); 
		
		if(StringExtensions.isNullOrEmpty(order))
		{
			featureOrder.put(EClass, featureName);
			return;
		}
		
		order = order + ',' + featureName;
		
		featureOrder.remove(EClass);
		featureOrder.put(EClass, order);
		
		setFeaturesOrderInListControl(EClass);
	}
	
	/**
	 * Called when the selection of the key EClass (from the 
	 * combo box control in this window) changes.
	 */
	private void onKeyClassChanged()
	{
		//Delete the existings expand items
		for(ExpandItem i : expandBar.getItems())
		{
			i.setExpanded(false);
			i.dispose();
		}
		
		//redraw the control
		expandBar.redraw();
		
		prepareExpandBar(DOCUMENTATION_STYLE.STYLE_BY_ECLASS);
		
		presentationOrderEClassComboBox.setText(keyEClassComboBox.getText());
		setFeaturesOrderInListControl(keyEClassComboBox.getText());
	}
	
	/**
	 * Get the template data and set the controls value
	 * in this window according to the template attribute values.
	 * 
	 * @param templatePath The complete path to a template file.
	 */
	public void loadTemplateConfiguration(String templatePath)
	{
		//when templatePath is null, user probably cleared the template combo box
		//in the launcher window, or a wrong template title has been written.
		//If is not null but the file doesn't exist, show an error.
		if(StringExtensions.isNullOrEmpty(templatePath))
			return;
		else if(!new File(templatePath).exists())
		{
			MessageDialog.openError(new Shell(), "Error", "Error loading template file '" + templatePath + "'.");
			return;
		}
		
		//Create a new TemplateParser
		TemplateParser templateParser = new TemplateParser(templatePath);
		
		//Parse the template
		templateParser.parseTemplate();
		
		//Get the template data
		templateData = templateParser.getTemplateData();
		
		//Set the template title
		templateNameTextBox.setText(templateParser.getTemplateName());
		
		//Set the controls in this window according to the template attribute values
		setUIControls();
		
		prepareExpandBar(documentationStyle);
		setFeaturesOrderInListControl(getKeyEClass());
	}
	
	/**
	 * Set the UI controls values according to the template 
	 * that the user chooses.
	 */
	private void setUIControls()
	{
		for(String key : templateData.keySet())
		{
			//TODO dovrei differenziare meglio gli attributi di template dagli attributi relativi alle Eclass...
			//If a key contains colons, so the current key represents a table data attribute.
			if(key.contains(":"))
			{
				String EClass 		= key.substring(0,key.indexOf(":"));
				String FeatureName 	= key.substring(key.indexOf(":")+1,key.length());
				String value 		= templateData.get(key);
				
				setTableDataAttribute(EClass, FeatureName, value);
				continue;
			}
			
			//Otherwise, it is a template attribute
			setTemplateAttribute(key, templateData.get(key));
		}
	}
	
	/**
	 * Set the values of the controls in this window according to the attribute/attribute value specified.
	 * @param AttributeName	The name of an attribute 
	 * @param attributeValue The value of the attribute
	 */
	private void setTemplateAttribute(String AttributeName, String attributeValue)
	{
		//If attributeValue is null or empty, there's nothing to do...
		if(StringExtensions.isNullOrEmpty(attributeValue))
			return;
		
		if(AttributeName.equals(TemplateKeywords.SUPPORTED_MODEL_EXTENSION))
		{
			supportedTemplateExtensionTextBox.setText(attributeValue);
		}
		else if(AttributeName.equals(TemplateKeywords.DOCUMENTATION_STYLE))
		{
			if(attributeValue.equals(TemplateKeywords.FULL_DOCUMENTATION))
			{
				documentationStyleComboBox.setText("Full Documentation");
				documentationStyle = DOCUMENTATION_STYLE.STYLE_FULL;
				
				keyEClassComboBox.setEnabled(false);
				
				presentationOrderEClassComboBox.setEnabled(true);
			}
			else
			{
				documentationStyleComboBox.setText("Ordered by EClass");
				documentationStyle = DOCUMENTATION_STYLE.STYLE_BY_ECLASS;
				keyEClassComboBox.setEnabled(true);
				
				presentationOrderEClassComboBox.setEnabled(false);
			}
		}
		else if(AttributeName.equals(TemplateKeywords.KEY_ECLASS))
		{
			keyEClassComboBox.setText(attributeValue);
			presentationOrderEClassComboBox.setText(attributeValue);
		}
		else if(AttributeName.equals(TemplateKeywords.DOCUMENTATION_TITLE))
		{
			documentationTitleTextBox.setText(attributeValue);
		}
		else if(AttributeName.equals(TemplateKeywords.TITLE_SEPARATOR))
		{
			lineSeparatorCheckBox.setSelection(attributeValue.equals("true") ? true : false);
		}
		else if(AttributeName.equals(TemplateKeywords.INCLUDE_DIAGRAM_IMAGE))
		{
			boolean val = attributeValue.equals("true") ? true : false;
			IncludeDiagramImageCheckBox.setSelection(val);
			
			diagramImagePathTextBox.setEnabled(val);
		}
		else if(AttributeName.equals(TemplateKeywords.DIAGRAM_IMAGE_FILE))
		{
			diagramImagePathTextBox.setText(attributeValue);
		}
		else if(AttributeName.equals(TemplateKeywords.EXCLUDED_ECLASS))
		{
			String[] val = attributeValue.split(",");
			
			for (String s : val)
				excludedEClassesList.add(s);
			
			//excludedEClassesList.add(attributeValue);
		}
		else if(AttributeName.equals(TemplateKeywords.TABLE_BORDER))
		{
			putBorderInTablesCheckBox.setSelection(attributeValue.equals("true") ? true : false);
		}
		
	}
	
	/**
	 * Set the values of the controls in this window according to the attribute/attribute value specified.
	 * @param AttributeName	The name of an attribute 
	 * @param attributeValue The value of the attribute
	 */
	private void setTableDataAttribute(String EClass, String AttributeName, String attributeValue)
	{		
		if(AttributeName.equals(TableData.EXCLUDED_FEATURE))
		{
			java.util.List<String> excludedFeatureList = excludedFeatures.get(EClass);
			
			if(excludedFeatureList == null)
			{
				java.util.List<String> l = new ArrayList<String>();
				l.add(TemplateParser.getAttributeValueWithoutQuotes(attributeValue));
				excludedFeatures.put(EClass, l);
			}
			else
			{
				excludedFeatureList.add(TemplateParser.getAttributeValueWithoutQuotes(attributeValue));
				excludedFeatures.remove(EClass);
				excludedFeatures.put(EClass, excludedFeatureList);
			}
		}
		else if(AttributeName.equals(TableData.FEATURE_ORDER))
		{
			 featureOrder.put(EClass, attributeValue);
		}
		else if(AttributeName.equals(TableData.HEADER_FIELD))
		{
			 headerFeatures.put(EClass, attributeValue);
		}
		
		//mancano i parametri dei font
		
		
	}
	
	/**
	 * Return true if user choosed to include a diagram image file into
	 * the documentation.
	 */
	public boolean IsDiagramImageIncluded()
	{
		return IncludeDiagramImageCheckBox.getSelection();
	}
	
	/**
	 * Called when "Load" button is selected. This button opens a file
	 * dialog used to choose a diagram image file to include into the
	 * documentation
	 */
	private void onLoadDiagramImageButtonSelected()
	{
		//Get the handle to the runtime eclipse workspace
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(MetamodelsLoader.ProjectName);
		
		//Get the complete path to the destination output folder
		String path = root.getLocation().toFile().toString() + 
					  File.separator +
					  project.getName() + 
					  File.separator;
		
		//Create and open a new file dialog
		FileDialog fd = new FileDialog(shlDocgenAdvanced, SWT.OPEN);
        fd.setText("Select a Diagram Image File");
        fd.setFilterPath(path);
        String[] filterExt = { "*.png", "*.jpeg", ".bmp", "*.*" }; //TODO usare le stesse estensioni usate da graphiti
        fd.setFilterExtensions(filterExt);
        
        //Set the absolute path to the selected image file
        if((pathToDiagramImageFile = fd.open()) != null)
        	diagramImagePathTextBox.setText(pathToDiagramImageFile);
	}
	
	/**
	 * Return the absolute path to the diagram image file to include
	 * in the documentation. 
	 */
	public String getPathToSelectedDiagramImageFile()
	{
		return diagramImagePathTextBox.getText();
	}
	
	/**
	 * Return the selected style for the output documentation 
	 */
	public DOCUMENTATION_STYLE getDocumentationStyle()
	{
		return documentationStyle;
	}
	
	
	private boolean isFeatureExcluded(String EClassName, String featureName)
	{
		java.util.List<String> excludedFeature = excludedFeatures.get(EClassName);
		
		if(excludedFeature == null)
			return false;
		
		if(excludedFeature.contains(featureName))
			return true;
		
		return false;
	}

	/**
	 * this method returns the selected key EClass from the
	 * combo box control in this window. This is used only when
	 * user select by EClass documentation style
	 */
	public String getKeyEClass()
	{
		return keyEClassComboBox.getText();
	}
	
	/**
	 * Return the radio button control in this window for
	 * full documentation style.
	 */
	public Button getFullDocStyleRadioButtonControl()
	{
		return DocStyleFullRadioBtn;
	}
	
	/**
	 * Return the radio button control in this window for
	 * by EClass documentation style.
	 */
	public Button getByEClassStyleRadioButtonControl()
	{
		return DocStyleByEClassRadioBtn;
	}
	
	/**
	 * Add an EClass to the Key EClass combo box control.
	 */
	public void addKeyEClass(String EClassName)
	{ 
		keyEClassComboBox.add(EClassName);
	}

	/**
	 * Set the key EClass combo box text to the specified EClass name. 
	 */
	public void setKeyEClass(String EClassName)
	{ 
		keyEClassComboBox.setText(EClassName);
	}
	
	/**
	 * Return the combo box control in this window, used
	 * to select the key EClass when the by EClass documentation
	 * style is selected.
	 */
	public Combo getKeyEClassComboBoxControl()
	{
		return keyEClassComboBox;
	}
	
	public Combo getOutputDocTypeComboBoxControl()
	{
		return outputDocumentationTypeComboBox;
	}
	
	/**
	 * Return the output documentation type string specified in the ui comboBox control.
	 * @return
	 */
	public String getOutputDocumentationType()
	{
		return outputDocumentationTypeComboBox.getText();
	}
	
	/**
	 * Return the ExpandBar control.
	 * @return 
	 */
	public ExpandBar getExpandBar()
	{
		return expandBar;
	}

	public Button getGenerateButton()
	{
		return btnGenerate;
	}
	
	/**
	 * Show this window.
	 */
	public void show()
	{
		shlDocgenAdvanced.open();
		shlDocgenAdvanced.layout();
		
		while (!shlDocgenAdvanced.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	/**
	 * Close this window.
	 */
	public void close()
	{
		try
		{
			shlDocgenAdvanced.close();
		}
		catch(SWTException e)
		{}
	}
}
