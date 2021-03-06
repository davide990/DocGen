/*
 * generated by Xtext
 */
package org.xtext.passi.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator

import com.google.inject.Inject
import com.google.inject.Provider

class Main {
	
	def static main(String[] args) 
	{
		if (args.empty) {
			System::err.println('Aborting: no path to EMF resource provided!')
			return
		}
		val injector = new org.xtext.passi.DocGenStandaloneSetupGenerated().createInjectorAndDoEMFRegistration
		val main = injector.getInstance(typeof(Main))
		main.runGenerator(args.get(0))
	}
	
	@Inject Provider<ResourceSet> resourceSetProvider
	
	@Inject IResourceValidator validator
	
	@Inject IGenerator generator
	
	@Inject JavaIoFileSystemAccess fileAccess

	def protected runGenerator(String string) {
		// load the resource
		val set = resourceSetProvider.get
		val resource = set.getResource(URI::createURI(string), true)
		
		// validate the resource
		val issues = validator.validate(resource, CheckMode::ALL, CancelIndicator::NullImpl)
		if (!issues.isEmpty()) {
			for (issue : issues) {
				System::err.println(issue)
			}
			return
		}
		
		// configure and start the generator
		//fileAccess.setOutputPath('src-gen/')
		generator.doGenerate(resource, fileAccess)
		System::out.println('Code generation finished.')
	}
}
