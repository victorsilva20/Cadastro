package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.dao.EnderecoDAO;
import br.com.sisaca.exceptions.EnderecoNaoEncontradoException;
import br.com.sisaca.model.Endereco;

public class EnderecoServiceImpl implements EnderecoService {

	private EnderecoDAO enderecoDAO;

	public void setEnderecoDAO(EnderecoDAO enderecoDAO) {
		this.enderecoDAO = enderecoDAO;
	}

	@Override
	public void addEndereco(Endereco end) {
		enderecoDAO.addEndereco(end);

	}

	@Override
	public void deleteEndereco(Endereco end) throws EnderecoNaoEncontradoException {
		enderecoDAO.deleteEndereco(end);

	}

	@Override
	public Endereco consultarEndereco(Endereco end) throws EnderecoNaoEncontradoException {

		return enderecoDAO.consultarEndereco(end);
	}

	@Override
	public ArrayList<Endereco> listar() {

		return enderecoDAO.listar();
	}

}
