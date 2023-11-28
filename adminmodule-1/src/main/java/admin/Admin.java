package admin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	
	private long id;
	private String name;
	private String passwrd;
	
	
	
	public Admin() {
		super();
	}



	public Admin(long id, String name, String passwrd) {
		super();
		this.id = id;
		this.name = name;
		this.passwrd = passwrd;
	}


 @Id
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPasswrd() {
		return passwrd;
	}



	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}



	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", passwrd=" + passwrd + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getPasswrd()=" + getPasswrd() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}


