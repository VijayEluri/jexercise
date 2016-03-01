/*
 * generated by Xtext 2.9.1
 */
package no.hal.learning.exercise.xtext

import org.eclipse.xtext.resource.IFragmentProvider
import org.eclipse.xtext.conversion.IValueConverterService

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class XerciseRuntimeModule extends AbstractXerciseRuntimeModule {

	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return no.hal.learning.exercise.xtext.formatting.XerciseValueConverter;
	}

	override Class<? extends IFragmentProvider> bindIFragmentProvider() {
		return no.hal.learning.exercise.xtext.scoping.XerciseFragmentProvider;
	}
}