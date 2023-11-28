package c2tc_project.certificatemodule;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class certificate {
	//the data which is get from the user 
		private long id;
		private int year;
		private String clg;
		
		public certificate() {
			super();
		}

	     public certificate(long id, int year, String clg) {
			super();
			this.id = id;
			this.year = year;
			this.clg = clg;
		}
 @Id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "certificate [id=" + id + ", year=" + year + ", clg=" + clg + ", getId()=" + getId() + ", getYear()="
				+ getYear() + ", getClg()=" + getClg() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

 
 
}
