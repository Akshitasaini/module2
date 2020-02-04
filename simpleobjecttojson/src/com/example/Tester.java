package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Tester {
	public static void main( String[] args ) {
		try {
			ObjectMapper mapper = new ObjectMapper();
		      mapper.enable(SerializationFeature.INDENT_OUTPUT);
			Student stu = new Student();
			stu.setId(101);
			stu.setFirstName("john");
			stu.setLastName("bacardi");
			String json = mapper.writeValueAsString(stu);
		      System.out.println(json);
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
 