package day18;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateSales {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		var sales = em.find(SalesEntity.class, 6);
		if (sales != null) {
			em.getTransaction().begin();
			sales.setAmount(11111); // updated
			em.remove(sales); // removed
			em.getTransaction().commit();
		} else {
			System.out.println("Invno not foundd");
		}
		em.close();
		emf.close();

	}

}
