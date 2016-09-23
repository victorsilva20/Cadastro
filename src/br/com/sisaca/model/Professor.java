package br.com.sisaca.model;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
@ManagedBean(name = "professor")
@PrimaryKeyJoinColumn(name = "idPessoa")
public class Professor extends Pessoa {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "admissao")
	private String admissao;

	@Column(name = "departamento")
	private String departamento;

	@Column(name = "inst_ensino")
	private String inst_ensino;

	private ArrayList<Titulo> titulo;

	public ArrayList<Titulo> getTitulo() {
		return titulo;
	}

	public void setTitulo(ArrayList<Titulo> titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdmissao() {
		return admissao;
	}

	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getInst_ensino() {
		return inst_ensino;
	}

	public void setInst(String inst_ensino) {
		this.inst_ensino = inst_ensino;
	}

}
