package comm.example.h2.connection.data;

import java.sql.SQLException;

import comm.example.h2.connection.data.Customer;
import comm.example.h2.connection.data.CustomerDao;
import comm.example.h2.connection.data.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;
	{
		dao=new CustomerDaoImpl();
	}

	@Override
	public Customer createCuastomer(String firstName, String lastName, String email) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCuastomer(firstName, lastName, email);
	}

}
