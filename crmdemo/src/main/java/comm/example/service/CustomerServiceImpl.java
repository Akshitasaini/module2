package comm.example.service;

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
}
