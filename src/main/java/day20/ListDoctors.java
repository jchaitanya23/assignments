package day20;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListDoctors {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		var doctors = em.createQuery("from day20.ResidentDoctorInh", DoctorInh.class).getResultList();
		for (var d : doctors) {
			System.out.printf("%s\n",d.toString());
		}
		
		em.close();
		emf.close();

	}

}
