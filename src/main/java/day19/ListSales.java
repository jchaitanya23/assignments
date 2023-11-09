package day19;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListSales {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from day19.SalesManyToOne", SalesManyToOne.class);
		var sales = query.getResultList();

//		for (var s : sales) {
//			System.out.printf("%d \\t %d \\t %s \\t %d \\t %f\\n",s.getInvno(),s.getProducts(),s.getTransdate(),s.getQty(),s.getAmount());
//		}
//		
//		for(var ss : sales) {
//			System.out.println(ss.getProducts().toString());
//		}
		
		for( var s : sales) {
			System.out.println( s.getQty());
		}
		em.close();
		emf.close();

	}

}
