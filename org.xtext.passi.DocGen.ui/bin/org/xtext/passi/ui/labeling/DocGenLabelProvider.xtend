/*
* generated by Xtext
*/
package org.xtext.passi.ui.labeling

import com.google.inject.Inject

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
class DocGenLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
//	def text(Greeting ele) {
//		'A greeting to ' + ele.name
//	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}