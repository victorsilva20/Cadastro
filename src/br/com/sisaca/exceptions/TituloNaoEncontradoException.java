package br.com.sisaca.exceptions;

import br.com.sisaca.model.Titulo;

public class TituloNaoEncontradoException extends Exception {

	public TituloNaoEncontradoException(Titulo titulo) {
		super("Titulo nao encontrado");
	}
}
