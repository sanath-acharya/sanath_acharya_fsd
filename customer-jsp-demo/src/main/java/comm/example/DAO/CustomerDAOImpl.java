package comm.example.DAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import comm.example.factory.HibernateUtilFactory;
import comm.example.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	private static Session session;

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		session = HibernateUtilFactory.getMySession();
		session.getTransaction().begin();
		Query query = session.createQuery("from Customer");
		session.getTransaction().commit();
		@SuppressWarnings("unchecked")
		List<Customer> lst = query.getResultList();
		return lst;
	}

	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		session = HibernateUtilFactory.getMySession();
		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
	}

}
