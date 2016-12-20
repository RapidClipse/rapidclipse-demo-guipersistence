
package com.xdev.rcdemo.guipersistence.dal;

import com.xdev.dal.JPADAO;
import java.lang.Integer;
import com.xdev.rcdemo.guipersistence.entities.Shipper;

/**
 * Home object for domain model class Shipper.
 * 
 * @see Shipper
 */
public class ShipperDAO extends JPADAO<Shipper, Integer> {
	public ShipperDAO() {
		super(Shipper.class);
	}
}