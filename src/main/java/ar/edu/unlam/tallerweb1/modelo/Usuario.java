package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private Long id;
	@Column(unique=true)
	private String username;
	private String password;
	@Column(unique=true)
	private String email;
	private Boolean esAdmin;
	
	public Usuario(){
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getEsAdmin() {
		return esAdmin;
	}
	public void setEsAdmin(Boolean esAdmin) {
		this.esAdmin = esAdmin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
