package logintestproject.dao;

import logintestproject.exceptions.CustomerNotFoundException;
import logintestproject.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public String addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return "Customer added successfully";
	}

	@Override
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException{
		Customer cust = new Customer(15,"Nithin");
		if(custId == cust.getCustId()) {
			return cust;
		}else {
			throw new CustomerNotFoundException("Customer not found");
		}
		
		//return null;
	}

}
