package mycompany.hibernateannotation;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.logging.Level;

public final class HibernateUtil {
private static SessionFactory factory;

static {
	Logger logger = Logger.getLogger("org.hibernate");
	logger.setLevel(Level.OFF);
	factory=new Configuration().configure().
			addAnnotatedClass(Person.class).
			buildSessionFactory();
}
private HibernateUtil() {
	
}

public static Session getSession() {
	// TODO Auto-generated method stub
	return factory.openSession();
}

}
