package mycompany._01_2020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.UUID;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import mycompany._01_2020.bean.Customer;
import mycompany._01_2020.bean.CustomerDao;
import mycompany._01_2020.bean.CustomerService;
import mycompany._01_2020.bean.CustomerServiceImpl;

@Component
public class App 
{

	private static CustomerService service;
	static {
		service = new CustomerServiceImpl();
	}
	public static void main (String[] args) throws SQLException {
	
	int choice = 0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	do {
		System.out.println("1. create customer");
		System.out.println("2. update customers");
		choice = Integer.parseInt(br.readLine().toString());
		switch (choice) {
		case 1:
			System.out.print(" First Name: ");
			String fName=br.readLine().toString();
			System.out.print(" Last Name: ");
			String lName=br.readLine().toString();
			System.out.print(" Email: ");
			String email=br.readLine().toString();
			Customer customer=service.createCustomer(fName, lName, email);
			System.out.println("Create Customer Sucess "+customer);
			break;
		case 2 :
			System.out.print(" UID : ");
			uId=br.readLine().toString();
			list=service.findByUId(uId);
			if(list.isEmpty())
			{
				System.out.println("no such uid found");
			}
			else {
				Customer c=list.get(0);
				System.out.print(" First Name: ");
				fName=br.readLine().toString();
				System.out.print(" Last Name: ");
				lName=br.readLine().toString();
				System.out.print(" Email: ");
				email=br.readLine().toString();
				c.setEmail(email);
				c.setFirstName(fName);
				c.setLastName(lName);
				customer=service.updateCustomer(c,c.getUId());
				System.out.println("customer updated: "+customer);
			}
		case 0:
			System.exit(0);
		
		default:
			System.out.println("invalid choice");
			break;
		}

	} while (choice != 0);

}
   
}
