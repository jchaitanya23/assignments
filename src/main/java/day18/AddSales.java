package day18;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddSales {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		SalesEntity s = new SalesEntity();
		s.setProduct_id(103);
		s.setDate("2022-08-23");
		s.setQuantity(4);
		s.setAmount(12000);

//		Transient state 

		em.getTransaction().begin();
		em.persist(s); // persist state
		em.getTransaction().commit();

		em.close(); // Detached state
		emf.close();

	}

}
