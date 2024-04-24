package logintestproject.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import logintestproject.dao.CustomerDAO;
import logintestproject.exceptions.CustomerNotFoundException;
import logintestproject.model.Customer;


public class CustomerServiceImplTest {
	
	
	private CustomerService service;
	private Customer customer;
	@Mock
	private CustomerDAO dao;
	
	@BeforeEach
	void init() {
		MockitoAnnotations.openMocks(this);
		customer = new Customer();
		service = new CustomerServiceImpl(); 
	}
	
	@Test
	void testGetCustomerByIdSuccess() {
		    assertNotNull(dao);
		    customer.setCustId(15);
		    customer.setCustName("Nithin");
		    
	        try {
				when(dao.getCustomerById(15)).thenReturn(customer);
				Customer cust =service.getCustomerById(15);
		        assertNull(null,cust.getCustName());                
		        assertEquals(customer.getCustName(), cust.getCustName());
			} catch (CustomerNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	                          
	    
	}
	
	@Test
	void testGetCustomerByIdFailure() {
		assertNotNull(dao);
	    customer.setCustId(16);
	    customer.setCustName("Nithin");
	    try {
			doThrow(new CustomerNotFoundException("Customer not found"))
			.when(dao).getCustomerById(15);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
        
        assertThrows(CustomerNotFoundException.class, ()->service.getCustomerById(16));
        //assertEquals(customer.getCustName(), cust.getCustName());
	}
	
	
	@AfterEach
	void tearDown() {
		
	}

}



