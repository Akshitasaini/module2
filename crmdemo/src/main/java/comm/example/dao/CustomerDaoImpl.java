package comm.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;



import comm.example.model.Customer;
import comm.example.util.CustomerUtil;

public class CustomerDaoImpl implements CustomerDao {
	private Session session;
	private EntityManager entityManager;
	{
		session = CustomerUtil.getMySessionFactory().openSession();
		session.getTransaction().begin();
		entityManager = session.getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
	}
	@Override
	public Customer createCustomer(Customer customer) {
		
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;
	}
	@Override
	public List<Customer> getAllCustomer() {
		Query query = entityManager.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}


}
