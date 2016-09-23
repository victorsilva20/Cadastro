package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.exceptions.PublicacaoNaoEncontradaException;
import br.com.sisaca.model.Publicacao;

public interface PublicacaoService {

	public void addPublicacao(Publicacao publ);

	public void deletePublicacao(Publicacao publ) throws PublicacaoNaoEncontradaException;

	public Publicacao consultarPublicacao(Publicacao publ) throws PublicacaoNaoEncontradaException;

	public ArrayList<Publicacao> listar();
}
