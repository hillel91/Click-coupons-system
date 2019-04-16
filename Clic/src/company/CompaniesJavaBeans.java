package company;

import java.io.Serializable;
import java.util.ArrayList;

import coupones.CouponesJavaBeans;

public class CompaniesJavaBeans implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String email;
	private String password;
	private ArrayList<CouponesJavaBeans> coupensList;
	
	public CompaniesJavaBeans() {
	}

	public CompaniesJavaBeans(int id) {
		super();
		this.id = id;
	}

	public CompaniesJavaBeans(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<CouponesJavaBeans> getCoupensList() {
		return coupensList;
	}

	public void setCoupensList(ArrayList<CouponesJavaBeans> coupensList) {
		this.coupensList = coupensList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CompaniesJavaBeans [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", coupensList=" + coupensList + "]";
	}
	
	
	
	
}
