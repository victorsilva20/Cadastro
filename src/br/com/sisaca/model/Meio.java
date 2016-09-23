package br.com.sisaca.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "meio")
@ManagedBean(name = "meio")
public class Meio {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "meio_comunicao")
	private String meio_comunicacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMeio_comunicacao() {
		return meio_comunicacao;
	}

	public void setMeio_comunicacao(String meio_comunicacao) {
		this.meio_comunicacao = meio_comunicacao;
	}

}
