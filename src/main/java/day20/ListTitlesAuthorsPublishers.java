package day20;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTitlesAuthorsPublishers {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from day20.Publisher", Publisher.class).getResultList();
//		for (var p : query) {
////			for(var a : p.getAuthors()) {
////				System.out.printf("%-65s %-10s \n", p.getTitle(), a.getName());
////			}
////			System.out.printf("%-65s   %-10s",);
//
//			for (var t : p.getTitle()) {
//				System.out.printf("%-30s  %-30s\n", p.getName(), t.getPublisher().getPub_name());
//			}
//		}
		
		for( var p: query) {
			for(var s: p.getTitles()) {
				System.out.println(p.getPub_name() + s.getAuthors().toString());
			}
		}
		em.close();
		emf.close();

	}

}
