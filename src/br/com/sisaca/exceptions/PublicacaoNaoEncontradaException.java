package br.com.sisaca.exceptions;

import br.com.sisaca.model.Publicacao;

public class PublicacaoNaoEncontradaException extends Exception {

	public PublicacaoNaoEncontradaException(Publicacao publ) {
		super("Publicação não encontrada" + publ.getId());
	}
}
