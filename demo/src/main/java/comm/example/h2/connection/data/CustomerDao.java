package comm.example.h2.connection.data;


import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
	
	public Customer createCuastomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers() throws SQLException;
	public List<Customer> findById(String uId) throws SQLException;
    public Customer updateCustomer(Customer customer,String uId) throws SQLException;
	void deleteCustomer(String uId) throws SQLException; 
}
