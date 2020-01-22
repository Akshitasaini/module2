package mycompany.hibernatetodo;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	SessionFactory factory = new Configuration().configure().addAnnotatedClass(Task.class)
        			.addAnnotatedClass(Todo.class).buildSessionFactory();
        	Session session = factory.openSession();
        	Task task = new Task("java");
			task.setTodo(new Todo("hibernate"));
			session.getTransaction().begin();
			session.save(task);
			session.getTransaction().commit();
        }
        catch(Exception e){
			e.printStackTrace();
        }
    }
}
