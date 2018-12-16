/**
 * 
 */
package com.ca.dao;

import java.util.List;

import com.ca.model.Customer;

/**
 * @author admin
 *
 */
public class CustomerDaoImpl implements CustomerDao{

	/* (non-Javadoc)
	 * @see com.ca.dao.CustomerDao#SaveCustomer(com.ca.model.Customer)
	 */
	@Override
	public void SaveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getName());
	}

	

}
