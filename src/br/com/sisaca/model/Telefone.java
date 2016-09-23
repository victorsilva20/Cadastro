package br.com.sisaca.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telefone")
@ManagedBean(name = "telefone")
public class Telefone {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "ddd")
	private String ddd;
	@Column(name = "numero")
	private String numero;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
