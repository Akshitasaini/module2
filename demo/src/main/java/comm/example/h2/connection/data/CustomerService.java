package comm.example.h2.connection.data;

import java.sql.SQLException;
import java.util.List;

import comm.example.h2.connection.data.Customer;

public interface CustomerService {
	public Customer createCuastomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers() throws SQLException;
    public Customer updateCustomer(Customer customer,String uId) throws SQLException;
	public List<Customer> findById(String uId) throws SQLException;
}
