package com.mycompany.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaolmpl implements StudentDAO {
	private MyConnection = null;
	private Connection connection = null;
	private Statement statement = null;
	List<Student> list = null;

	{
		facctory = MyConnection.getMyConnectionObject();
		try {
			connection = connection.getMyConnection();
			list = new ArrayList<Student>();
		} catch (SQLException e) {

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> getAllStudent() throws SQLException {

		statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select id,name,subjects,marks from student");
		while (resultSet.next()) {

			list.add(new Student(resultSet.getInt("id"),
					resultSet.getString("name"),
					resultSet.getString("subjects"),
					resultSet.getInt("marks")));

		}

		return list;
	}

}