package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.exceptions.TelefoneNaoEncontradoException;
import br.com.sisaca.model.Telefone;

public interface TelefoneService {

	public void addTelefone(Telefone fone);

	public void deleteTelefone(Telefone fone);

	public Telefone consultarTelefone(Telefone fone) throws TelefoneNaoEncontradoException;

	public ArrayList<Telefone> listar();
}
