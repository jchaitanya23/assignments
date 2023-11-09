package ass1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		var query = em.createQuery("from ass1.Products",Products.class);
		var products= query.getResultList();
		for (var pro : products ) {
			System.out.printf("%-10d - %s  - 10f  - %10f  -%s  - %s",pro.getProdId(),pro.getProductName(),pro.getPrice(),pro.getQoh(),pro.getRemarks(),pro.getCatcode());
			System.out.println();
		}
		emf.close();
		em.close();
	}

}
