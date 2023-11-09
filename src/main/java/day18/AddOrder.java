package day18;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddOrder {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		OrdersCollection oc = new OrdersCollection();

		OrdersDetails od1 = new OrdersDetails();
		OrdersDetails od2 = new OrdersDetails();
		oc.setCust_name("Chaitanya");

		od1.setPid(909);
		od1.setDate("23-09-2001");
		od1.setQoh(2);
		od2.setPid(908);
		od2.setDate("08-05-2021");
		od2.setQoh(5);

		oc.getQuantities().add(od1);
		oc.getQuantities().add(od2);

		em.getTransaction().begin();
		em.persist(oc);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
