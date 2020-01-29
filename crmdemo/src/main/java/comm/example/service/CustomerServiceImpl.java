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

		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

}
