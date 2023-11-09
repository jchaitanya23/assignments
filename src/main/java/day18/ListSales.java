package day18;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListSales {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		var query = em.createQuery("from day18.SalesEntity", SalesEntity.class);
		var sales = query.getResultList();
		for (var p : sales) {
			System.out.printf("%10d   -  %-10d - %s  - %10d  - %10f  ", p.getId(), p.getProduct_id(), p.getDate(),
					p.getQuantity(), p.getAmount());
			System.out.println();
		}
		em.close();
		emf.close();

	}

}
