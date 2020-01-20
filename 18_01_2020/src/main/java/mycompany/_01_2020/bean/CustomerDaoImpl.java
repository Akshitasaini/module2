package mycompany._01_2020.bean;

import java.util.List;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("dao")
public class CustomerDaoImpl implements CustomerDao {
	private DataSource dataSource;
	private Connection connection;
	private PreparedStatement pStatement;
	private static Logger logger=Logger.getLogger("mycompany._01_2020.bean.CustomerDaoImpl");
	@Autowired
	public CustomerDaoImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
	@PostConstruct
	public void init() {
		
		try {
			logger.info("creating connection");
		connection=dataSource.getConnection();
		logger.info("connection established.");
	}
     catch (SQLException e) {
		
		e.printStackTrace();
		logger.info("connection unsuccesfull.");
	}
}
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		pStatement=connection.prepareStatement("insert into customer(uid,first_name,last_name,email) values(?,?,?,?)");
		pStatement.setString(1, customer.getUId());
		pStatement.setString(2, customer.getFirstName());
		pStatement.setString(3, customer.getLastName());
		pStatement.setString(4, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}
	
	@Override
	public Customer updateCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		pStatement=connection.prepareStatement("update customer "
				+ "set first_name=? , "
				+ "last_name=?, "
				+ "email=?"
				+ " where uid=?");
		pStatement.setString(2, customer.getFirstName());
		pStatement.setString(3, customer.getLastName());
		pStatement.setString(4, customer.getEmail());
		pStatement.setString(1,customer.getUId());
		pStatement.executeUpdate();
		return customer;
		
	}
	}

