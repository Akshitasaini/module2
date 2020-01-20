package mycompany._01_2020.bean;

import java.sql.SQLException;
import java.util.logging.Logger;



public class CustomerServiceImpl implements CustomerService {
	static Logger logger=Logger.getLogger("mycompany._01_2020.bean.CustomerServiceImpl");
	private CustomerDao dao;
	{
		dao=new CustomerDaoImpl(null);
		logger.info("get Dao");
	}
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer);
	}


}
