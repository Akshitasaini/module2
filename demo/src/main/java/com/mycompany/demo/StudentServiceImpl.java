package com.mycompany.demo;



	import java.sql.SQLException;
	import java.util.List;
	public class StudentServiceImpl implements StudentService {

		private StudentDAO dao;
		
		{
			dao=new StudentDaoImpl();
		}

		@Override
		public List<Student> getAllStudent() throws SQLException {
			// TODO Auto-generated method stub
			return dao.getAllStudent();
		}

	}

