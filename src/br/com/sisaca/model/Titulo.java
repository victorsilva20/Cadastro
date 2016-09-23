package br.com.sisaca.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "titulo")
@ManagedBean(name = "titulo")
public class Titulo {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nome_titulo")
	private String nome_titulo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_titulo() {
		return nome_titulo;
	}

	public void setNome_titulo(String nome_titulo) {
		this.nome_titulo = nome_titulo;
	}
}
