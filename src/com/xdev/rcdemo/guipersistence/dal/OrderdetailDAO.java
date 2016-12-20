
package com.xdev.rcdemo.guipersistence.dal;

import com.xdev.rcdemo.guipersistence.entities.Orderdetail;
import com.xdev.dal.JPADAO;
import com.xdev.rcdemo.guipersistence.entities.OrderdetailId;

/**
 * Home object for domain model class Orderdetail.
 * 
 * @see Orderdetail
 */
public class OrderdetailDAO extends JPADAO<Orderdetail, OrderdetailId> {
	public OrderdetailDAO() {
		super(Orderdetail.class);
	}
}