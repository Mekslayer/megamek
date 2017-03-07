/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons.battlearmor;

import megamek.common.TechAdvancement;
import megamek.common.weapons.LRMWeapon;


/**
 * @author Sebastian Brocks
 */
public class ISBALRM5OS extends LRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 3915337270241715850L;

    /**
     *
     */
    public ISBALRM5OS() {
        super();
        name = "LRM 5 (OS)";
        setInternalName("ISBALRM5OS");
        addLookupName("IS BA OS LRM-5");
        addLookupName("ISBALRM5 (OS)");
        addLookupName("IS BALRM 5 (OS)");
        heat = 2;
        rackSize = 5;
        minimumRange = 6;
        tonnage = 2.5;
        criticals = 1;
        bv = 9;
        cost = 18000;
        tonnage = .3;
        criticals = 5;
        flags = flags.or(F_NO_FIRES).or(F_BA_WEAPON).or(F_ONESHOT).andNot(F_MECH_WEAPON).andNot(F_TANK_WEAPON).andNot(F_AERO_WEAPON).andNot(F_PROTO_WEAPON);
        rulesRefs = "261, TM";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(3050, 3057, 3060);
        techAdvancement.setIntroLevel(true);
        techAdvancement.setTechRating(RATING_E);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_E, RATING_D });
    }
}



