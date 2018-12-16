/**
 * 
 */
package com.ca.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ca.dao.CustomerDao;
import com.ca.dao.CustomerDaoImpl;
import com.ca.model.Customer;

/**
 * @author admin
 *
 */
public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see com.ca.service.CustomerService#saveCustomer(com.ca.model.Customer)
	 */
	
	
	@Override
	public void saveCustomer(Customer customer) {
		CustomerDao custdao=new CustomerDaoImpl();
		custdao.SaveCustomer(customer);
	}

}
