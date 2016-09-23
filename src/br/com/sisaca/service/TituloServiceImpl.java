package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.dao.TituloDAO;
import br.com.sisaca.exceptions.TituloNaoEncontradoException;
import br.com.sisaca.model.Titulo;

public class TituloServiceImpl implements TituloService {

	TituloDAO tituloDAO;

	public void setTituloDAO(TituloDAO tituloDAO) {
		this.tituloDAO = tituloDAO;
	}

	@Override
	public void addTitulo(Titulo titulo) {
		tituloDAO.addTitulo(titulo);

	}

	@Override
	public void deleteTitulo(Titulo titulo) throws TituloNaoEncontradoException {
		tituloDAO.deleteTitulo(titulo);

	}

	@Override
	public Titulo consultarTitulo(Titulo titulo) throws TituloNaoEncontradoException {

		return tituloDAO.consultarTitulo(titulo);
	}

	@Override
	public ArrayList<Titulo> listar() {

		return tituloDAO.listar();
	}

}
