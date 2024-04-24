package logintestproject.service;

import logintestproject.dao.CustomerDAO;
import logintestproject.dao.CustomerDAOImpl;
import logintestproject.exceptions.CustomerNotFoundException;
import logintestproject.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public String addCustomer(Customer customer) {
		CustomerDAO dao = new CustomerDAOImpl();
		return dao.addCustomer(customer);
	}

	@Override
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException{
		CustomerDAO dao = new CustomerDAOImpl();
		return dao.getCustomerById(custId);
	}

}
