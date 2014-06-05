package org.xtext.passi.validation

import org.eclipse.xtext.validation.Check
import org.xtext.passi.templateLanguage.Feature
import org.xtext.passi.templateLanguage.Template
import org.xtext.passi.templateLanguage.TemplateLanguagePackage
import org.xtext.passi.templateLanguage.TableDataAttribute
import org.xtext.passi.templateLanguage.TableData

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class TemplateLanguageValidator extends AbstractTemplateLanguageValidator 
{

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def checkDuplicateFeature(Feature f)
	{
		if( f.name.equals("excludedEClass") || 
			f.name.equals("excludedEStructuralFeature"))
			return;
			
		if( f.name.equals("keyEClass") )
		{
			//controlla se la proprietà documentationStyle esiste
		}
		
		if( f.name.equals("documentationStyle") )
		{
			//controlla se la proprietà keyEClass esiste

		}
		
		
		//Get the complete feature list
		val fList = Template.cast(f.eContainer).features;
		
		//Initialize the occurrences counter
		var counter = 0;
		
		var tableDataCounter = 0;
		
		//Loop the template file feature list		
		for (Feature feature : fList)
		{
			if(feature instanceof TableData)
				tableDataCounter = tableDataCounter + 1;
				
			if(feature.name.equals(f.name))	
				counter = counter + 1;
		}
		
		if(tableDataCounter>1)
		{
			//Se il tipo di documentazione è full allora mostra un avviso di warning (o un errore?!?)
		}

		if(counter>1)
			warning('Warning: template feature "' + f.name + '" already defined.',null,TemplateLanguagePackage.FEATURE__NAME);
	}
	
	@Check
	def checkDiagramImageIncluded()
	{
		//controlla se c'è la feature diagramimagefile
		//se c'è, cerca la feature diagramimageincluded
		//se non c'è o c'è ma il suo valore è falso, allora mostra un warning
	}
	
	@Check
	def checkTableAttributeQualifiedName(TableDataAttribute a)
	{
		val attrValue = a.name;
		println("attribute value: " + attrValue) 
		
		val attrValueSplitted = attrValue.split("\\.");
		println(attrValueSplitted.length+ " strings.")
		for(String s : attrValueSplitted) 
			println("-> "+s)
		println("-------------")
		
	}
	
}
