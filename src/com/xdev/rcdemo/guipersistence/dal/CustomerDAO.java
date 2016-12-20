
package com.xdev.rcdemo.guipersistence.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rcdemo.guipersistence.entities.Customer;

/**
 * Home object for domain model class Customer.
 * 
 * @see Customer
 */
public class CustomerDAO extends JPADAO<Customer, String> {
	public CustomerDAO() {
		super(Customer.class);
	}
}