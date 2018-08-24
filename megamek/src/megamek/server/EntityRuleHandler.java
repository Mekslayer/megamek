/*
 * MegaMek -
 * Copyright (C) 2018 - The MegaMek Team
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

package megamek.server;

import megamek.common.Entity;

/**
 * Base class for {@link RuleHandler RuleHandler}s involving a particular {@link Entity Entity}.
 * 
 * @author Neoancient
 *
 */
public abstract class EntityRuleHandler {
    
    protected final Entity entity;
    
    protected EntityRuleHandler(Entity entity) {
        this.entity = entity;
    }

}
