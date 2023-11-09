package day20;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddDoctors {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		ResidentDoctorInh r = new ResidentDoctorInh();
		r.setName("justin");
		r.setSalary(112345);

		ConsultantInh c = new ConsultantInh();
		c.setCharge(10000);
		c.setVisits(12);
		c.setName("Chaitanya");
		c.setPh_no("9494190197");
		c.setDept("cardio");

		em.getTransaction().begin();
		em.persist(r);
		em.persist(c);
		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
