package day18;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		Employee e1 = new Employee();
		e1.setName("Justin Chaitanya");

		Salary s = new Salary();
		s.setSal(100000);
		e1.setSal(s);

		em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}