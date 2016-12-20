
package com.xdev.rcdemo.guipersistence.dal;

import com.xdev.rcdemo.guipersistence.entities.Supplier;
import com.xdev.dal.JPADAO;
import java.lang.Integer;

/**
 * Home object for domain model class Supplier.
 * 
 * @see Supplier
 */
public class SupplierDAO extends JPADAO<Supplier, Integer> {
	public SupplierDAO() {
		super(Supplier.class);
	}
}