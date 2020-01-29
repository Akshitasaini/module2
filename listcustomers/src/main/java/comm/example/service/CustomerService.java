package comm.example.service;

import java.util.List;

import comm.example.model.Customer;



public interface CustomerService {
	public Customer createCustomer(Customer customer);
    public List<Customer> getAllCustomer();
    public Customer findBuyId(int id);
    public void update(Customer customer);
}
