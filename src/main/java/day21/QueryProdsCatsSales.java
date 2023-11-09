package day21;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class QueryProdsCatsSales {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		
		Scanner s = new Scanner(System.in);
		String query;
		while(true) {
			System.out.println("Enter Query [press enter to stop] : ");
			query=s.nextLine();
			if(query.length()==0) {
				break;
			}
			
			try {
			var result= em.createQuery(query).getResultList();

			System.out.println("Query Result");
			for(var obj : result) {
				if(obj instanceof 	Object[]) {
					for(var o : (Object[]) obj) {
						System.out.println(o==null ? " " : o.toString() + " " );
					}
				}else {
					System.out.println(obj.toString());
				}
			}
			}
			catch (Exception ex) {
				System.out.println("Error-->" + ex.getMessage());
			}
			
		}
		em.close();
		emf.close();
	}

}
