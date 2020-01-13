package comm.example.jdbc;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImp1 implements EmployeeService {
	private EmployeeDao dao;
	{
		dao = new EmployeeDaoImpl();
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

}
