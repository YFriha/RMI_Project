package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Filiere
 *
 */
@Entity

public class Filiere implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String code;
	private String name;
	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<Student> student;
	public Filiere() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Filiere(int id, String code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
//		this.student = student;
	}
	
   
}
