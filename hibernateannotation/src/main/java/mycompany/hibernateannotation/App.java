package mycompany.hibernateannotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
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
    	 /*Person p=service.createPerson(new Person("U102","john",LocalDate.now()));
    			
		  System.out.println(p);*/
       BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));

    	int choice=-1;
    	String uId,firstName,lastName,email=null;
    	do {
    		System.out.println("1. create person.");
    		System.out.println("2. display all person.");
    		System.out.println("3. update person.");
    		System.out.println("4. delete person.");
    		System.out.print("enter your choice>> ");
    		choice=Integer.parseInt(br.readLine());
    		Interger id;
			switch (choice) {
 			case 1:
 				System.out.print("first name>> ");
 				firstName=br.readLine();
 				String[] arr=UUID.randomUUID().toString().split("-");
 				uId=arr[0]+arr[1];
 				service.createPerson(new Person(uId, firstName,LocalDate.now()));
 				break; 	
 			case 2:
 				List<Person> l=service.getAllPersons();
 				System.out.format("%-20s%-20s%-20s\n", "ID","name",LocalDate.now());
 				l.forEach(p->{
 					System.out.println(p);
 				});
 				break;
 			case 3:
 				System.out.print("id>> ");
 				uId=br.readLine();
 				l=service.getPersonByid(id);
 				if(l.isEmpty())
 				{
 					System.out.println("Person not found");
 				}
 				else
 				{
 					Person p =l.get(0);
 					System.out.print(" Name: ");
 					name=br.readLine().toString();
 					
 					p.setName(name);
 					
 					person=service.updatePerson(uId);
 					System.out.println("person updated:" +person);
 				}
 				break;
 			
 			case 4:
 				System.out.println("id>>");
 				id=br.readLine();
 				service.deletePerson(id);
 			default:
 	 				break;
 	 			}
 	 			
 	 		} while (choice !=0);
 	    	 
 	    }
    }
    

