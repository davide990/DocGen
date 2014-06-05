/*
 * generated by Xtext
 */
package org.xtext.passi.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.passi.ui.internal.DocGenActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DocGenExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DocGenActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DocGenActivator.getInstance().getInjector(DocGenActivator.ORG_XTEXT_PASSI_DOCGEN);
	}
	
}