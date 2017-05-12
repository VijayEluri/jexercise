package no.hal.learning.exercise.pydev.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.pydev.PydevLaunchAnswer;
import no.hal.learning.exercise.pydev.PydevLaunchProposal;
import no.hal.learning.exercise.pydev.PydevSourceEditAnswer;
import no.hal.learning.exercise.pydev.PydevSourceEditProposal;

public class PydevUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class.equals(type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof PydevSourceEditProposal) {
			return new PydevSourceEditTaskProposalAdapter((TaskProposal<PydevSourceEditAnswer>) target);
		} else if (target instanceof PydevLaunchProposal) {
			return new PydevLaunchTaskProposalAdapter((TaskProposal<PydevLaunchAnswer>) target);
		}
		return null;
	}
}
