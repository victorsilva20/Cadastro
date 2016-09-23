package br.com.sisaca.dao;

import java.util.ArrayList;

import br.com.sisaca.exceptions.CampoNaoPreenchidoException;
import br.com.sisaca.exceptions.PessoaNaoEncontradaException;
import br.com.sisaca.model.Pessoa;
import br.com.sisaca.model.Telefone;

public interface TelefoneDAO {
	
	public void addTelefone(Telefone fone) throws CampoNaoPreenchidoException;
	public void deleteTelefone(Telefone fone) throws TelefoneNaoEncontradaException;
	public Telefone consultarTelefone(Telefone fone) throws TelefoneNaoEncontradaException;
	public ArrayList<Telefone> listar();

}
