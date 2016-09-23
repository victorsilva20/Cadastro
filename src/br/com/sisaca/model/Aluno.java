package br.com.sisaca.model;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
@ManagedBean(name = "aluno")
@PrimaryKeyJoinColumn(name = "idPessoa")
public class Aluno extends Pessoa {

	@Column(name = "matricula")
	private int matricula;

	@Column(name = "publicacao")
	private ArrayList<Publicacao> publicacao;
	

	public ArrayList<Publicacao> getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(ArrayList<Publicacao> publicacao) {
		this.publicacao = publicacao;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
