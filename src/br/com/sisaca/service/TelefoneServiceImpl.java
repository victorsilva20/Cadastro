package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.dao.TelefoneDAO;
import br.com.sisaca.exceptions.TelefoneNaoEncontradoException;
import br.com.sisaca.model.Telefone;

public class TelefoneServiceImpl implements TelefoneService {

	TelefoneDAO telefoneDAO;

	public void setTelefoneDAO(TelefoneDAO telefoneDAO) {
		this.telefoneDAO = telefoneDAO;
	}

	@Override
	public void addTelefone(Telefone fone) {
		telefoneDAO.addTelefone(fone);

	}

	@Override
	public void deleteTelefone(Telefone fone) {
		telefoneDAO.addTelefone(fone);

	}

	@Override
	public Telefone consultarTelefone(Telefone fone) throws TelefoneNaoEncontradoException {

		return telefoneDAO.consultarTelefone(fone);
	}

	@Override
	public ArrayList<Telefone> listar() {

		return telefoneDAO.listar();
	}

}
