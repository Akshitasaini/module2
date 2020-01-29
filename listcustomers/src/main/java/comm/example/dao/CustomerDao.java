package comm.example.dao;

import java.util.List;

import comm.example.model.Customer;

public interface CustomerDao {
	public Customer createCustomer(Customer customer);
    public List<Customer> getAllCustomer();
    public Customer findBuyId(int id);
    public void update(Customer customer);
}
