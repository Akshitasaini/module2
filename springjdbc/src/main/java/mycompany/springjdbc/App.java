package mycompany.springjdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class App 
{
	CustomerService service;
    public static void main( String[] args )throws NumberFormatException, IOException, SQLException
    {
ClassPathXmlApplicationContext context=null;
BufferedReader br=null;

    	CustomerService service = null;	
    
    try {
    	/*context=new ClassPathXmlApplicationContext("applicationContext.xml");
	service=context.getBean("service",CustomerService.class);
    	
	List<Customer> l=service.getAllCustomer();
	l.forEach(c->{
		System.out.println(c);
	});
}*/
    	br=new BufferedReader(new InputStreamReader(System.in));
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		service=context.getBean("service",CustomerService.class);
    }
    	catch (Exception e) {
	e.printStackTrace();
}
finally {
	context.close();
}
    int choice=-1;
	String uId,firstName,lastName,email=null;
	do {
		System.out.println("1. create customer.");
		System.out.println("2. display all customer.");
		System.out.println("3. find customer by uid.");
		System.out.println("4. update customer.");
		System.out.println("5. delete customer.");
		System.out.print("enter your choice>> ");
		choice=Integer.parseInt(br.readLine());
		switch (choice) {
		case 1:
			System.out.print("first name>> ");
			firstName=br.readLine();
			System.out.print("last name>> ");
			lastName=br.readLine();
			System.out.print("email>> ");
			email=br.readLine();
			String[] arr=UUID.randomUUID().toString().split("-");
			uId=arr[0]+arr[1];
			service.createCustomer(new Customer(uId, firstName, lastName, email));
			break;
		case 2:
			List<Customer> l=service.getAllCustomer();
			System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
			l.forEach(c->{
				System.out.println(c);
			});
			break;
		case 3:
			System.out.print("uid>> ");
			uId=br.readLine();
			l=service.getCustomerById(uId);
			if(l.isEmpty())
			{
				System.out.println("customer not found");
			}
			else
			{
				System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
				l.forEach(c->{
					System.out.println(c);
				});
			}
			break;
	/*	case 4:
			System.out.print(" UID : ");
			uId=br.readLine().toString();
			l=service.getCustomerById(uId);
			if(l.isEmpty())
			{
				System.out.println("no such uid found");
			}
			else {
				Customer c=l.get(0);
				System.out.print(" First Name: ");
				firstName=br.readLine().toString();
				System.out.print(" Last Name: ");
				lastName=br.readLine().toString();
				System.out.print(" Email: ");
				email=br.readLine().toString();
				c.setEmail(email);
				c.setFirstName(firstName);
				c.setLastName(lastName);
				customer=service.updateCustomerById(c);
				System.out.println("customer updated:" +customer);
			}
*/
			
		default:
			break;
		}
		
	} while (choice !=0);

	
}
    }
