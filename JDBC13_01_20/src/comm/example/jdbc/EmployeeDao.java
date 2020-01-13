package comm.example.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
	public List<Employee> getAllEmployees() throws SQLException;

}
