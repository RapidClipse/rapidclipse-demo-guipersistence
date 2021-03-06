
package com.xdev.rcdemo.guipersistence.dal;

import com.xdev.rcdemo.guipersistence.entities.Order;
import com.xdev.dal.JPADAO;
import java.lang.Integer;

/**
 * Home object for domain model class Order.
 * 
 * @see Order
 */
public class OrderDAO extends JPADAO<Order, Integer> {
	public OrderDAO() {
		super(Order.class);
	}
}