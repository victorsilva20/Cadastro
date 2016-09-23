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
@Table(name = "pessoa")
@ManagedBean(name = "pessoa")
public abstract class Pessoa {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "nome")
	private String nome;

	@Column(name = "sexo")
	private String sexo;

	@Column(name = "endereco")
	private ArrayList<Endereco> endereco;

	@Column(name = "telefone")
	private ArrayList<Telefone> telefone;

	public ArrayList<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(ArrayList<Endereco> endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(ArrayList<Telefone> telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}
//
	public void setSexo(String sexo) {
		this.sexo = sexo;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
