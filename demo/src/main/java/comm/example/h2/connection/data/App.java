package comm.example.h2.connection.data;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Logger;

public class App {
	static Logger logger = Logger.getLogger("comm.example.h2.connection.data.App");

	public static void main(String[] args) throws SQLException {
		Properties properties = new Properties();
		properties.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/service");
		properties.setProperty("jdbc.user", "");
		properties.setProperty("jdbc.password", "");
		logger.info("started.");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/service", "root", "");
		logger.info("sucess");
		DatabaseMetaData mData=connection.getMetaData();
		ResultSet rs=mData.getTables(null, null, "CUSTOMER", null);
		if(rs.next())
		{
			System.out.println("table exists");
		}
		else
		{
			System.out.println("not exists");
		}
		StringBuffer buffer=new StringBuffer();
		buffer.append(mData.getDatabaseProductName());
		buffer.append(mData.getDatabaseProductVersion());
		buffer.append(mData.getDriverName());
		buffer.append(mData.getURL());
		buffer.append(mData.getUserName());
		System.out.println(buffer.toString());
		Statement statement=connection.createStatement();
		rs=statement.executeQuery("select * from customer");
		ResultSetMetaData rmData=rs.getMetaData();
		System.out.println(rmData.getColumnCount());
		System.out.println(rmData.getColumnName(3));
		System.out.println(rmData.isAutoIncrement(1));;
	}
}
