package mycompany.springjdbc;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
public Customer createCustomer(Customer customer) throws SQLException;
public List<Customer> getAllCustomer() throws SQLException;
public List<Customer> getCustomerById(String uId) throws SQLException;
public Customer updateCustomerById(Customer customer)throws SQLException;
public int deleteCustomer(String uId) throws SQLException;
}
