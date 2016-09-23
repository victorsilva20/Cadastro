package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.dao.PublicacaoDAO;
import br.com.sisaca.exceptions.PublicacaoNaoEncontradaException;
import br.com.sisaca.model.Publicacao;

public class PublicacaoServiceImpl implements PublicacaoService {

	private PublicacaoDAO publicacaoDAO;

	public void setPublicacaoDAO(PublicacaoDAO publicacaoDAO) {
		this.publicacaoDAO = publicacaoDAO;
	}

	@Override
	public void addPublicacao(Publicacao publ) {
		publicacaoDAO.addPublicacao(publ);

	}

	@Override
	public void deletePublicacao(Publicacao publ) throws PublicacaoNaoEncontradaException {
		publicacaoDAO.deletePublicacao(publ);

	}

	@Override
	public Publicacao consultarPublicacao(Publicacao publ) throws PublicacaoNaoEncontradaException {

		return publicacaoDAO.consultarPublicacao(publ);
	}

	@Override
	public ArrayList<Publicacao> listar() {

		return publicacaoDAO.listar();
	}

}
