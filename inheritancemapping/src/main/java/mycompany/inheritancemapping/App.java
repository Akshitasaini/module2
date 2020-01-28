package mycompany.inheritancemapping;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Session session = null;
      try {
    	  
    	  session=new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Employee.class)
					.addAnnotatedClass(ContractEmployee.class)
					.addAnnotatedClass(PermanentEmployee.class).buildSessionFactory()
					.getCurrentSession();
    	  Employee Employee1 = new Employee("Sarah","Antony",50000);
    	  Employee Employee2 = new ContractEmployee("akshita","saini",34450,1440,1.3);
    	  Employee Employee3 = new PermanentEmployee("Shharukh","khan",282880,10);
          session.getTransaction().begin();
          session.save(Employee1);
          session.save(Employee2);
          session.save(Employee3);
          session.getTransaction().commit();
          System.out.println("done");
      }
      finally {
    	  
      }

      }
    }

