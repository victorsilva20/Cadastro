package br.com.sisaca.model;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publicacao")
@ManagedBean(name = "publicacao")
public class Publicacao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(name = "titulo")
	private String titulo;

	@Column(name = "meio")
	private ArrayList<Meio> meio;

	public ArrayList<Meio> getMeio() {
		return meio;
	}

	public void setMeio(ArrayList<Meio> meio) {
		this.meio = meio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
