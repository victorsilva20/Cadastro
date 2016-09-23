package br.com.sisaca.exceptions;

import br.com.sisaca.model.Publicacao;

public class PublicacaoNaoEncontradaException extends Exception {

	public PublicacaoNaoEncontradaException(Publicacao publ) {
		super("Publica��o n�o encontrada" + publ.getId());
	}
}
