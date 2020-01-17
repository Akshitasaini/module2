package com.mycompany.demo;

import java.io.IOException;
import java.sql.Connection;

public class MyConnection {
private static MyConnection myConnection;
private static Connection connection;
public MyConnection() {
	super();
}
public static  MyConnection getAllObjects()throws IOException {
	if(myConnection== null)

	return new MyConnection();
	
	else
	{
		return connection;
	}

}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}
