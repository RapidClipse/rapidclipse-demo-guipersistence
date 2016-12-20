
package com.xdev.rcdemo.guipersistence.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rcdemo.guipersistence.entities.Region;

/**
 * Home object for domain model class Region.
 * 
 * @see Region
 */
public class RegionDAO extends JPADAO<Region, Integer> {
	public RegionDAO() {
		super(Region.class);
	}
}