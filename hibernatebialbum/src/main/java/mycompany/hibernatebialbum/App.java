package mycompany.hibernatebialbum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
            { 
	  private Session session;
	  private SessionFactory factory;
      private Transaction transaction;
      private BufferedReader br;
      private static AlbumDao dao;
      static{
    	dao = new AlbumDaoImpl();  
      }
      
{
	session = factory.getCurrentSession();
	transaction = session.getTransaction();
	br = new BufferedReader(new InputStreamReader(System.in));
}
    public static void main( String[] args ) {
	
    	
}
}