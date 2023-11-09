package day19;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListProducts {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from day19.ProductsOneToMany", ProductsOneToMany.class);
		var prods = query.getResultList();

		for (var v : prods) {
			System.out.printf("%d \t %-30s %-8.2f \t %d \t %-20s \t %s\n", v.getProdid(), v.getProdname(), v.getPrice(),
					v.getQoh(), v.getRemarks(), v.getCatcode());
		}

		em.close();
		emf.close();
	}

}
