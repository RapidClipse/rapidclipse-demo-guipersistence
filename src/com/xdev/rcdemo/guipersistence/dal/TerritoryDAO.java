
package com.xdev.rcdemo.guipersistence.dal;

import com.xdev.rcdemo.guipersistence.entities.Territory;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Territory.
 * 
 * @see Territory
 */
public class TerritoryDAO extends JPADAO<Territory, String> {
	public TerritoryDAO() {
		super(Territory.class);
	}
}