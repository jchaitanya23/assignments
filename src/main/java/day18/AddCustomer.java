package day18;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddCustomer {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		Customer c = new Customer();
		c.setName("Chaitanya");

		Address a = new Address();
		a.setAddress("SheelaNagar");
		a.setCity("Vizag");
		OfficeAdd oa = new OfficeAdd();
		oa.setOff_address("Near Rk Beach");
		oa.setOff_city("Pandurangapuram Vizag");
		
		AddCustContact acc= new AddCustContact();
		acc.setEmail("justinchaithanya@gmail.com");
		acc.setMobile_No("6303208097");

		c.setHome(a);
		c.setOff(oa);
		c.setCon(acc);
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		

	}

}
