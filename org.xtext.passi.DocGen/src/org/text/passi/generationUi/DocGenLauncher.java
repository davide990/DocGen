package org.text.passi.generationUi;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.w3c.dom.Document;
import org.xtext.passi.TemplateLanguageStandaloneSetup;
import org.xtext.passi.docGen.element;
import org.xtext.passi.generator.DocumentationBuilder;
import org.xtext.passi.generator.DocumentationFileSaver;
import org.xtext.passi.generator.DocxBuilder;
import org.xtext.passi.generator.HtmlBuilder;
import org.xtext.passi.generator.PdfBuilder;
import org.xtext.passi.template.TemplateParser;
import org.xtext.passi.templateLanguage.Feature;
import org.xtext.passi.templateLanguage.Template;
import org.xtext.passi.ui.contentassist.TableData;
import org.xtext.passi.ui.contentassist.TemplateKeywords;

import com.google.inject.Injector;

/**
 * The main launcher for the documentation generation. It consists of a window where
 * the user can select the a documentation template for specified persistence model,
 * the output documentation file name and a button that opens the template configuration. 
 * 
 * @author Davide Guastella(davide.guastella90@gmail.com)
 *
 */
public class DocGenLauncher 
{
	private static String SUPPORTED_EXTENSION_KEYWORD_NOT_FOUND = "--"; 
	private static String GENERAL_TEMPLATE_MARKER = " (General Template)";
	
	
	private Combo templateComboBox;
	
	private Combo documentationTypeComboBox;
	
	/**
	 * This hash table is needed to keep a correspondence between
	 * the template name and the path to the related file. The key is
	 * a template name, while the value is the complete path to the
	 * corresponding template file.
	 */
	private HashMap<String, String> templatePath;
	
	/**
	 * The button that opens the advanced template configuration.
	 */
	private Button advancedBtn;
	
	/**
	 * The button that executes the documentation generation.
	 */
	private Button generateBtn;
	
	private Label lblOutputFolder;
	
	/**
	 * The text box control where the user inserts the output
	 * folder(inside the project) where the documentation will
	 * be generated.
	 */
	private Text outputFolderTextBox;
	
	/**
	 * The text box control where the user inserts the output
	 * documentation file name.
	 */
	private Text outputFileNameTextBox;
	
	/**
	 * The extension of the selected persistence model.
	 */
	private String selectedDiagramExtension;
	
	private Shell shlDocgen;
	
	private Injector injector;
	
	private DocGenAdvancedUI advancedUi;
	
	private Document metamodelDoc;
	
	private Hashtable<String, String> persistenceModelHashTable;
	
	private EList<element> modelElements;
	
	
	public DocGenLauncher(String diagramExtension, Hashtable<String,String> persistenceModelHashTable) 
	{		
		selectedDiagramExtension = diagramExtension;
		this.persistenceModelHashTable = persistenceModelHashTable;
		
		templatePath = new HashMap<String, String>();
	}
	
	/**
	 * Set the metamodel doc for the selected file to compile. This is used
	 * in case the user opens the advanced configuration UI.
	 */
	public void setMetamodelDoc(Document md)
	{
		metamodelDoc = md;
	}
	
	/**
	 * Get the project property that holds the path to the folder that
	 * contains the templates, then search for the files with extension
	 * *.template and add their name to the combo box control.
	 */
	private void setTemplateComboBoxValue()
	{
		IWorkbench wb = PlatformUI.getWorkbench();
		
		// get workbench window
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		
		// set selection service
		ISelectionService service = window.getSelectionService();
		
		// set structured selection
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
			
		//If the current element in the package explore is a project
		if (structured.getFirstElement() instanceof IFile)
		{
			//get the selected project name
			IProject pro = ((IFile) structured.getFirstElement()).getProject();
			String ProjectName = pro.getName();

			try 
			{
				//Get the project property that holds the path to the folder that
				//contains the templates.
				String templatePath = pro.getPersistentProperty(new QualifiedName(ProjectName, "TEMPLATE_PATH"));
				
				if(StringExtensions.isNullOrEmpty(templatePath))
					return;
				
				File folder = new File(templatePath);
				File[] listOfFiles = folder.listFiles();
				
				//Loop every file in the template folder
				for (File file : listOfFiles) 
				{
				    if (!file.isFile())
				    	continue;
				    
				    String currentFileName = file.getName();
				    String fileExtension = FilenameUtils.getExtension(currentFileName);
				    
				    //Proceed only if files have "*.template" extension
				    if(!fileExtension.equals("template"))
				    	continue;
				    
				    //Get the name of the current template and the supported extension
				    //List<String> templateNameAndExtension = getTemplateNameAndSupportedExtension(templatePath + File.separator + currentFileName);
				    
				    if(StringExtensions.isNullOrEmpty(templatePath))
				    	return;
				    
				    String[] templateNameAndExtension = getTemplateNameAndSupportedExtension(templatePath + File.separator + currentFileName);
				    
				    if(StringExtensions.isNullOrEmpty(templateNameAndExtension[0]))
				    	continue;
				    
				    StringConcatenation comboboxEntry = new StringConcatenation();
				    comboboxEntry.append(templateNameAndExtension[0]);
				    
				    //If the template is a general template (no supported extension specified into the template)
				    if(templateNameAndExtension[1].equals(SUPPORTED_EXTENSION_KEYWORD_NOT_FOUND))
				    	comboboxEntry.append(GENERAL_TEMPLATE_MARKER);
				    
				    //Add the entry to the template combobox control
				    templateComboBox.add(comboboxEntry.toString());
				    
				    //Add a new entry to the templates hash table
				    this.templatePath.put(templateNameAndExtension[0], templatePath + File.separator + currentFileName);
				    
				    //If the current template's supported model extension is equal to the selected persistence 
				    //model's file extension, then set the combobox text to the current template name
				    if(templateNameAndExtension[1].equals(selectedDiagramExtension.toLowerCase()))
				    	templateComboBox.setText(comboboxEntry.toString());
				    
				}
				
			} 
			catch (CoreException e) 
			{
				e.printStackTrace();
			}
		
		}
	}
	
	/**
	 * Parse a template file, and return a list of two strings. The
	 * first string in the list is the name of the template, the second
	 * is the extension supported by the template (the value of the
	 * attribute outputFileNameExtension in the template.
	 * 
	 * @param TemplateFileName the full path to a template file.
	 * @return a list of two string ([template name, supported extension])
	 * @see <a href="http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F">Loading Model in a Standalone Application</a> for more informations
	 */
	private String[] getTemplateNameAndSupportedExtension(String TemplateFileName)
	{
		String[] returnValues = new String[2];
		
		if(injector == null)
			injector = new TemplateLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
			
		ResourceSet resourceSet 	= injector.getInstance(XtextResourceSet.class);
		((XtextResourceSet) resourceSet).addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		Resource res = resourceSet.getResource(URI.createFileURI(TemplateFileName),true);
		
		Template templateToCompile = null;
		EObject eobj = res.getContents().get(0);
		
		try
		{
			templateToCompile = (Template)eobj;
		}
		catch(ClassCastException e)
		{
			System.out.println("ClassCastException");
		}
		
		returnValues[0] = templateToCompile.getName();
		
		boolean supportedExtensionKeywordFound = false;
		
		//Loop on the template attributes
		for(int i=0;i< templateToCompile.getFeatures().size(); i++)
		{
			Feature currentFeature = templateToCompile.getFeatures().get(i);
			
			//If the i-th feature is the "outputFileNameExtension" attribute
			if(currentFeature.getName().equals("outputFileNameExtension"))
			{
				supportedExtensionKeywordFound = true;
				
				String v = currentFeature.getValue().toLowerCase();
				v = v.substring(1, v.length()-1);
				
				returnValues[1] = v;
			}
		}
		
		//If the current template file doesn't contains the attribute that specifies
		//the supported template's persistence model extension, set the second string
		//value of the returned array to a special marker string ("--").
		if(!supportedExtensionKeywordFound)
			returnValues[1] = SUPPORTED_EXTENSION_KEYWORD_NOT_FOUND;
		
		return returnValues;
	}
	
	
	
	/**
	 * Open this window.
	 */
	public void open() 
	{
		Display display = Display.getDefault();
		createContents();
		
		//After initializing all GUI controls, set up the
		//template list.
		setTemplateComboBoxValue();
		
		shlDocgen.open();
		shlDocgen.layout();
		while (!shlDocgen.isDisposed()) 
		{
			if (!display.readAndDispatch()) 
				display.sleep();
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() 
	{
		shlDocgen = new Shell();
		shlDocgen.setSize(390, 317);
		shlDocgen.setText("DocGen");
		
		Label lblTemplate = new Label(shlDocgen, SWT.NONE);
		lblTemplate.setBounds(10, 10, 55, 15);
		lblTemplate.setText("Template");
		
		templateComboBox = new Combo(shlDocgen, SWT.NONE);
		templateComboBox.setBounds(10, 31, 352, 23);
		
		advancedBtn = new Button(shlDocgen, SWT.NONE);
		advancedBtn.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				//Create a new Advanced Template Configuration Window.
				advancedUi = new DocGenAdvancedUI(metamodelDoc);
				
				String selectedTemplateName = templateComboBox.getText();
				
				if(!StringExtensions.isNullOrEmpty(selectedTemplateName))
				{
					if(selectedTemplateName.endsWith(GENERAL_TEMPLATE_MARKER))
						selectedTemplateName = selectedTemplateName.substring(0, selectedTemplateName.indexOf('(')-1);
				}
				
				advancedUi.loadTemplateConfiguration(templatePath.get(selectedTemplateName));				
				advancedUi.setMetamodelDoc(metamodelDoc);
				advancedUi.setPersistenceModelHashTable(persistenceModelHashTable);
				advancedUi.setModelElements(modelElements);
				
				close();
				advancedUi.show();
			}
		});
		advancedBtn.setBounds(10, 243, 75, 25);
		advancedBtn.setText("Advanced");
		
		Button cancelBtn = new Button(shlDocgen, SWT.NONE);
		cancelBtn.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				close();
			}
		});
		cancelBtn.setBounds(206, 243, 75, 25);
		cancelBtn.setText("Cancel");
		
		generateBtn = new Button(shlDocgen, SWT.NONE);
		generateBtn.setBounds(287, 243, 75, 25);
		generateBtn.setText("Generate");
		generateBtn.addSelectionListener(new SelectionListener() 
		{
			public void widgetSelected(SelectionEvent e) 
			{
				generateDocumentation();
			}
			
			public void widgetDefaultSelected(SelectionEvent e) 
			{}
		});
		
		lblOutputFolder = new Label(shlDocgen, SWT.NONE);
		lblOutputFolder.setBounds(10, 62, 97, 15);
		lblOutputFolder.setText("Output folder");
		
		outputFolderTextBox = new Text(shlDocgen, SWT.BORDER);
		outputFolderTextBox.setText("src-gen/");
		outputFolderTextBox.setBounds(9, 83, 353, 21);
		
		Label lblOutputFileName = new Label(shlDocgen, SWT.NONE);
		lblOutputFileName.setBounds(10, 185, 97, 15);
		lblOutputFileName.setText("Output file name");
		
		outputFileNameTextBox = new Text(shlDocgen, SWT.BORDER);
		outputFileNameTextBox.setText("output.pdf");
		outputFileNameTextBox.setBounds(10, 206, 352, 21);
		
		Label lblDocumentationType = new Label(shlDocgen, SWT.NONE);
		lblDocumentationType.setBounds(10, 121, 152, 15);
		lblDocumentationType.setText("Documentation Type");
		
		documentationTypeComboBox = new Combo(shlDocgen, SWT.NONE);
		documentationTypeComboBox.setItems(new String[] {"PDF", "HTML", "DOCX"});
		documentationTypeComboBox.setBounds(10, 142, 354, 23);
		documentationTypeComboBox.setText("PDF");
		documentationTypeComboBox.addSelectionListener(new SelectionListener() 
		{
			public void widgetSelected(SelectionEvent e) 
			{
				setDocumentationType(documentationTypeComboBox.getText());
			}
			
			public void widgetDefaultSelected(SelectionEvent e) 
			{}
		});
	}
	
	/**
	 * Generate the documentation. This method is called when the user
	 * select the "Generate" button control in this window.
	 */
	private void generateDocumentation()
	{
		String selectedTemplateName = templateComboBox.getText();
		
		if(!StringExtensions.isNullOrEmpty(selectedTemplateName))
		{
			if(selectedTemplateName.endsWith(GENERAL_TEMPLATE_MARKER))
				selectedTemplateName = selectedTemplateName.substring(0, selectedTemplateName.indexOf('(')-1);
		}
		
		//TODO da sistemare, in quanto la classe dovrebbe essere usata SOLO se è stato effettivamente selezionato un template
		String selectedTemplatePath = templatePath.get(templateComboBox.getText());
		TemplateParser tp = new TemplateParser(selectedTemplatePath);
		tp.parseTemplate();
		
		HashMap<String, String> templateData = tp.getTemplateData();
		
		String documentationType = documentationTypeComboBox.getText();
		
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
		
		if(!templateData.isEmpty())
			setDocumentationBuilderParameters(builder, templateData);
		
		//Build the documentation
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
		
		DocumentationFileSaver.save(tempFilePath, outFileName, outFolder);
		
		MessageDialog.openInformation(null, "DocGen", "Documentation generated!");
		close();
	}
	
	
	/**
	 * Given the hash table containings the data from a template, set a DocumentationBuilder object according to
	 * these values.
	 * @param builder the DocumentationBuilder object that will be used to produce the documentation.
	 * @param templateData the data structure containings the data from a template.
	 */
	private void setDocumentationBuilderParameters(DocumentationBuilder builder, HashMap<String, String> templateData )
	{
		String tableBorder 				= templateData.get(TemplateKeywords.TABLE_BORDER);
		String keyEClass 				= templateData.get(TemplateKeywords.KEY_ECLASS);
		String includeDiagramImage 		= templateData.get(TemplateKeywords.INCLUDE_DIAGRAM_IMAGE);
		String diagramImageFile			= templateData.get(TemplateKeywords.DIAGRAM_IMAGE_FILE);
		String docStyle 				= templateData.get(TemplateKeywords.DOCUMENTATION_STYLE);
		String docTitle 				= templateData.get(TemplateKeywords.DOCUMENTATION_TITLE);
		String excludedEclassStr 		= templateData.get(TemplateKeywords.EXCLUDED_ECLASS);
		
		if(!StringExtensions.isNullOrEmpty(tableBorder))
		{
			if(tableBorder.equals("true"))
				builder.setTableBorder(true);
		}
		
		if(!StringExtensions.isNullOrEmpty(keyEClass))
			builder.setKeyEClass(keyEClass);
		
		if(!StringExtensions.isNullOrEmpty(includeDiagramImage) &&
		   !StringExtensions.isNullOrEmpty(diagramImageFile))
		{
			if(includeDiagramImage.equals("true"))
				builder.setDiagramImageFile(diagramImageFile);
		}
		
		if(!StringExtensions.isNullOrEmpty(docStyle))
		{
			if(docStyle.equals(TemplateKeywords.FULL_DOCUMENTATION))
				builder.setDocumentationStyle(DocGenAdvancedUI.DOCUMENTATION_STYLE.STYLE_FULL);
			else
				builder.setDocumentationStyle(DocGenAdvancedUI.DOCUMENTATION_STYLE.STYLE_BY_ECLASS);
		}
		
		if(!StringExtensions.isNullOrEmpty(docTitle))
			builder.setDocumentationTitle(templateData.get(TemplateKeywords.DOCUMENTATION_TITLE));
		
		if(StringExtensions.isNullOrEmpty(excludedEclassStr))
			return;
		
		List<String> excludedEClasses = new ArrayList<String>();
		
		for(String s : excludedEclassStr.split(","))
			excludedEClasses.add(s);
		
		//Set the excluded eclasses into the documentation builder
		builder.SetExcludedEClasses(excludedEClasses);
		
		//Get the excluded EStructuralFeature from the template 
		for(String key : templateData.keySet())
		{
			if(key.contains(":"))
			{
				String EClassName 	=  key.substring(0, key.indexOf(":"));
				String FeatureName 	=  key.substring(key.indexOf(":")+1, key.length());
				String value 		=  templateData.get(key); 
				
				if(FeatureName.equals(TableData.EXCLUDED_FEATURE))
				{
					builder.AddExcludedFeatureForEClass(EClassName, value);
				}
				else if(FeatureName.equals(TableData.FEATURE_ORDER))
				{
					builder.AddFeatureOrderForEClass(EClassName, value);
				}
				else if(FeatureName.equals(TableData.HEADER_FIELD))
				{
					builder.setHeaderFieldForEClass(EClassName, value);
				}
			}
		}
	}
	
	/**
	 * Change automatically the file extension on the output file name text box
	 * according to the selected documentation type.
	 * @param dt The selected documentation type.
	 */
	private void setDocumentationType(String dt)
	{
		String outputFileName = outputFileNameTextBox.getText();
		
		outputFileName = outputFileName.substring(0, outputFileName.lastIndexOf("."));
		
		outputFileNameTextBox.setText(outputFileName + "." + documentationTypeComboBox.getText().toLowerCase());
	}
	
	/**
	 * Add a template name to the combo box control
	 * @param text
	 */
	public void addTemplate(String s)
	{
		templateComboBox.add(s);
	}
	
	/**
	 * Set the template combo box text
	 */
	public void setDefaultTemplateSelection(String s)
	{
		templateComboBox.setText(s);
	}
	
	/**
	 * Close this window.
	 */
	public void close()
	{
		try
		{
			shlDocgen.close();
		}
		catch(SWTException e)
		{}
	}

	public void setModelElements(EList<element> list) 
	{
		modelElements = list;
	}
}

