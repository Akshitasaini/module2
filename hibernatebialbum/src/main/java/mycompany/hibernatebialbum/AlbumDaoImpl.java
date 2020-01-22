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

public class AlbumDaoImpl implements AlbumDao{
	private Session session;
	private SessionFactory factory;
	private Transaction transaction;
	private BufferedReader br;
	{
		session = factory.getCurrentSession();
		transaction = session.getTransaction();
		br = new BufferedReader(new InputStreamReader(System.in));
	}
		@Override
    	
		public Album createAlbum(Album album) throws SQLException {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class)
					.addAnnotatedClass(MyImage.class).buildSessionFactory();

			try {

				Album tempAlbum = new Album("Madhubala", LocalDate.now());
				MyImage tempMyImage = new MyImage("http://www.youtube.com");
				tempAlbum.setMyImage(tempMyImage);
			session.beginTransaction();
				System.out.println("Saving Album: " + tempAlbum);
				session.save(tempAlbum);
				session.getTransaction().commit();
				System.out.println("Done!");
			} finally {
				factory.close();
			}
			return null;
		}
		@Override
		public Album getMyImage(int id) throws SQLException {
			SessionFactory factory = new Configuration().
					configure("hibernate.cfg.xml")
					.addAnnotatedClass(Album.class)
					.addAnnotatedClass(MyImage.class)
					.buildSessionFactory();
			Session session = factory.getCurrentSession();
			try {
				int theId = 1;
				session.getTransaction().begin();
				MyImage tempMyImage = session.get(MyImage.class, theId);
				session.getTransaction().commit();
				System.out.println("tempMyImage: " + tempMyImage);
				System.out.println("the associated instructor: " + tempMyImage.getAlbum());
				System.out.println("Done!");
			} catch (Exception exc) {
				exc.printStackTrace();
			} finally {
				factory.close();
			}
			return null;
		}
		
		@Override
		public Album deleteMyImage(int id) throws SQLException {
			try {			
				session.beginTransaction();
				int theId = 1;
				MyImage tempMyImage = 
						session.get(MyImage.class, theId);
				System.out.println("tempMyImage: " + tempMyImage);
												System.out.println("the associated Album: " + 
									tempMyImage.getAlbum());
												System.out.println("Deleting tempMyImage: " 
												+ tempMyImage);
				session.delete(tempMyImage);
									session.getTransaction().commit();
								System.out.println("Done!");
			}
			catch (Exception exc) {
				exc.printStackTrace();
			}
			finally {
				
			factory.close();
			}
		return null;
		}
	
		@Override
		public int deleteAlbum(int id) throws SQLException {
			try {
				session.beginTransaction();
				int theId = 1;
				Album tempAlbum = session.get(Album.class, theId);
				System.out.println("Found Album: " + tempAlbum);
				if (tempAlbum != null) {
					System.out.println("Deleting: " + tempAlbum);
				session.delete(tempAlbum);
				}
				session.getTransaction().commit();
				System.out.println("Done!");
			} finally {
				factory.close();
			}
					
		
	return 0;
}

}	
