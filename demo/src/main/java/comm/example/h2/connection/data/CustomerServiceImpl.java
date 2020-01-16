package comm.example.h2.connection.data;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import comm.example.h2.connection.data.Customer;
import comm.example.h2.connection.data.CustomerDao;
import comm.example.h2.connection.data.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {

	static Logger logger=Logger.getLogger("com.mycompany.jdbcmaven.CustomerServiceImpl");
	private CustomerDao dao;
	{
		dao=new CustomerDaoImpl();
		logger.info("get Dao");
	}

	@Override
	public Customer createCuastomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCuastomer(customer);
	}

	@Override
	public List<Customer> findById(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findById(uId);
	}
	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	@Override
	public Customer updateCustomer(Customer customer,String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer,uId);
	}

}
