package edu.gemini.tac.persistence.queues.partnerCharges;

import edu.gemini.tac.persistence.Partner;
import edu.gemini.tac.persistence.phase1.TimeAmount;
import edu.gemini.tac.persistence.queues.Queue;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * This class connects the charges incurred by partners for participating in the exchange 
 * program.
 * 
 * @author ddawson
 *
 */
@Entity
@DiscriminatorValue("Classical")
public class ClassicalPartnerCharge extends PartnerCharge {

	protected ClassicalPartnerCharge() {};

	public ClassicalPartnerCharge(final Queue queue, final Partner partner, final TimeAmount charge) {
        super(queue, partner, charge);
	}
}
