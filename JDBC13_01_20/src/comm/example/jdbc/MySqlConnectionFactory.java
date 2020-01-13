package comm.example.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class MySqlConnectionFactory {
	private Connection connection;
	static MySqlConnectionFactory myConnection;

	private MySqlConnectionFactory() {
		// super();
		// this.connection = connection;
	}
	public static Properties getConnectionProperties() throws IOException{
		InputStream in = new FileInputStream("mysql.properties");
		Properties prop = new Properties();
		prop.load(in);
		return prop;
	}

	/* public Connection getMyConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "welcome");
		return connection;

	}*/

	public static MySqlConnectionFactory getMyConnectionObject() {
		if (myConnection == null) {
			return new MySqlConnectionFactory();
		} else {
			return myConnection;
		}
	}
	public  Connection getMyConnection() throws SQLException, IOException
	{
		Properties prop=getConnectionProperties();
		String url=prop.getProperty("jdbc.connection.url");
		String user=prop.getProperty("jdbc.connection.user");
		String password=prop.getProperty("jdbc.connection.password");
		//DriverManager.registerDriver(new org.h2.Driver());
		connection=DriverManager.getConnection(url,user,password);
		return connection;
	}
}
