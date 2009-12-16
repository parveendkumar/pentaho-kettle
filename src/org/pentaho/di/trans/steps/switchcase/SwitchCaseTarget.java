package org.pentaho.di.trans.steps.switchcase;

import org.pentaho.di.trans.step.StepMeta;

public class SwitchCaseTarget {
	/** The value to switch over */
	public String caseValue;
	
	/** The case target step name (only used during serialization) */
	public String caseTargetStepname;
	
	/** The case target step */
	public StepMeta caseTargetStep;

	public SwitchCaseTarget() {
	}
}