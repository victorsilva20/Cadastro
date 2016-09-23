package br.com.sisaca.dao;

import java.util.ArrayList;

import br.com.sisaca.exceptions.TelefoneNaoEncontradoException;
import br.com.sisaca.model.Telefone;

public interface TelefoneDAO {

	public void addTelefone(Telefone fone);

	public void deleteTelefone(Telefone fone) throws TelefoneNaoEncontradoException;

	public Telefone consultarTelefone(Telefone fone) throws TelefoneNaoEncontradoException;

	public ArrayList<Telefone> listar();

}
