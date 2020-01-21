package mycompany.config;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("service")
public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;
@Autowired
	public CustomerServiceImpl(CustomerDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		
		return dao.getAllCustomers();
	}

	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
	
		return dao.getCustomerById(uId);
	}

	@Override
	public Customer updateCustomerById(String uId) throws SQLException {
	
		return dao.updateCustomerById( uId);
	}

	@Override
	public int deleteCustomer(String uId) throws SQLException {
		
		return 0;
	}
	
}
