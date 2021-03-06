package edu.gemini.tac.persistence.restrictedbin;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("WaterVaporPercentageRestrictedBin")
public class WaterVaporPercentageRestrictedBin extends RestrictedBin {
    @Override
    public RestrictedBin copy(Integer value) {
        WaterVaporPercentageRestrictedBin  restriction = new WaterVaporPercentageRestrictedBin();
        restriction.setId(null);
        restriction.setValue(value);
        restriction.setDescription(this.getDescription());
        restriction.setUnits(this.getUnits());
        return restriction;
    }
}
