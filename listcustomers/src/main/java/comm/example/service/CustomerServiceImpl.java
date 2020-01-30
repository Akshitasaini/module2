package comm.example.service;

import java.util.List;

import comm.example.dao.CustomerDao;
import comm.example.dao.CustomerDaoImpl;
import comm.example.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;
	{
		dao = new CustomerDaoImpl();
	}
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}
	@Override
	public Customer findBuyId(int id) {
		// TODO Auto-generated method stub
		return dao.findBuyId(id);
	}
	@Override
	public void update(Customer customer) {
		dao.update(customer);
		
	}
	@Override
	public void delete(Customer customer) {
		dao.delete(customer);
		
	}
	
}
