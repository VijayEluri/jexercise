package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.events.ModifyListener;

import no.hal.learning.quiz.SimpleProposal;
import no.hal.learning.quiz.StringAnswer;

public class StringProposalAdapter extends TextProposalUIAdapter<SimpleProposal<StringAnswer>> implements ModifyListener {

	public StringProposalAdapter(SimpleProposal<StringAnswer> proposal) {
		super(proposal);
		format = proposal.getAnswer().getFormat();
	}

	@Override
	protected void setModel(Object o) {
		getProposal().setProposal(String.valueOf(o));
	}
}
