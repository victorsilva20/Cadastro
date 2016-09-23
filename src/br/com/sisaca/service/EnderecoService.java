package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.exceptions.EnderecoNaoEncontradoException;
import br.com.sisaca.model.Endereco;

public interface EnderecoService {

	public void addEndereco(Endereco end);

	public void deleteEndereco(Endereco end) throws EnderecoNaoEncontradoException;

	public Endereco consultarEndereco(Endereco end) throws EnderecoNaoEncontradoException;

	public ArrayList<Endereco> listar();
}
