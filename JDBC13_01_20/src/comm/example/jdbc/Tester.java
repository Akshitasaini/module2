package comm.example.jdbc;

import java.sql.SQLException;
import java.util.List;

public class Tester {
	private EmployeeService service;

	public static void main(String[] args) throws SQLException {

		Tester tester = new Tester();
		tester.service = new EmployeeServiceImp1();
		List<Employee> list = tester.service.getAllEmployees();
		System.out.println("ID  FIRST_NAME  LAST_NAME  SALARY");
		list.forEach(e -> {
			System.out.println(
					e.getEmployeeId() + "  " + e.getFristName() + "  " + e.getLastName() + "  " + e.getSalary());
		});

	}

}
