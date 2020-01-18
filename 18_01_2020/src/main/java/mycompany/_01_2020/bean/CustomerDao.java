package mycompany._01_2020.bean;

import java.sql.SQLException;

public interface CustomerDao {

	public Customer createCustomer(Customer customer) throws SQLException;

}
