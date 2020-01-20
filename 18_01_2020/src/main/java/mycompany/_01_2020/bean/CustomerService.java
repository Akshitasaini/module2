package mycompany._01_2020.bean;

import java.sql.SQLException;

public interface CustomerService {
    public Customer updateCustomer(Customer customer) throws SQLException;
	public Customer createCustomer(String fName, String lName, String email);
}
