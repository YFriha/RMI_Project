package entities;

import entities.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.lang.String;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Student extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String telephone;
	
	@ManyToOne
	private Filiere filiere; 
	public Student() {
		super();
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Student(String login, String password,String firstName, String lastName, String telephone) {
		
		super(login,password);
//		Filiere fr=new Filiere();
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
//		this.filiere = filiere;
	}
   
}
