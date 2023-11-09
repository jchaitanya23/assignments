package day18;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddHouse {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		House h = new House();
		h.setName("Chaitanya");
		h.setType("2bhk");

		Parking p = new Parking();
		p.setCode(3);
		p.setLength(20);
		p.setWidth(30);
		h.setParking(p);

		em.getTransaction().begin();
		em.persist(h);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
