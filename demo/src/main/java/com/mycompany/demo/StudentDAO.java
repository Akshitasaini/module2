package com.mycompany.demo;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
	public List<Student> getAllStudent() throws SQLException;

}
