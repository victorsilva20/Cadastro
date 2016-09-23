package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.exceptions.PessoaNaoEncontradaException;
import br.com.sisaca.model.Pessoa;

public interface PessoaService {

	public void addPessoa(Pessoa p);

	public void deletePessoa(Pessoa p) throws PessoaNaoEncontradaException;

	public Pessoa consultarPessoa(Pessoa p) throws PessoaNaoEncontradaException;

	public ArrayList<Pessoa> listar();
}
