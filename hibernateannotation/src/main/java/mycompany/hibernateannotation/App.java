package mycompany.hibernateannotation;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App 
{
	private static PersonService service;
	static {
		service=new PersonServiceImpl();
	}
    public static void main( String[] args )throws IOException
    {
    	Person p=service.createPerson(new Person("U102","john",LocalDate.now()));
    			
		  System.out.println(p);
    }
    }

