package br.com.sisaca.dao;

import java.util.ArrayList;

import br.com.sisaca.exceptions.CampoNaoPreenchidoException;
import br.com.sisaca.exceptions.PessoaNaoEncontradaException;
import br.com.sisaca.model.Pessoa;

public interface PessoaDAO {
	
public void addPessoa(Pessoa p) throws CampoNaoPreenchidoException;
public void deletePessoa(Pessoa p) throws PessoaNaoEncontradaException;
public Pessoa consultarPessoa(Pessoa p) throws PessoaNaoEncontradaException;
public ArrayList<Pessoa> listar();
}
