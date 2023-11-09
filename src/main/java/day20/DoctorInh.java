package day20;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name ="day20.DoctorInheritance")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="doctor_type",discriminatorType=DiscriminatorType.INTEGER)
@Table(name="inh_doctors")
public class DoctorInh {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
	
		@Column(name ="Name",length=30)
		private String name;
		
		@Column(name ="Number", length=10)
		private String ph_no;
		
		@Column(name="Dept",length=30)
		private String dept;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPh_no() {
			return ph_no;
		}

		public void setPh_no(String ph_no) {
			this.ph_no = ph_no;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}
		
		
		
		
}
