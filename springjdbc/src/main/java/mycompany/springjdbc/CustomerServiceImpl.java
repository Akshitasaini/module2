package mycompany.springjdbc;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("service")
public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao1;
@Autowired
     public CustomerServiceImpl(CustomerDao dao1) {
		super();
		this.dao1 = dao1;
	}
@Override
public Customer createCustomer(Customer customer) throws SQLException {
	
	return dao1.createCustomer(customer);
}
@Override
public List<Customer> getAllCustomer() throws SQLException {
	return dao1.getAllCustomers();
}
	
@Override
public List<Customer> getCustomerById(String uId) throws SQLException {
	
	return dao1.getCustomerById(uId);
}


@Override
public int updateCustomerById(Customer customer) throws SQLException {
	
	return 0;
}


@Override
public int deleteCustomer(String uId) throws SQLException {
	
	return 0;
}

}
