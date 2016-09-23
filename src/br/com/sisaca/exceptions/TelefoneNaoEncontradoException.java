package br.com.sisaca.exceptions;

import br.com.sisaca.model.Telefone;

public class TelefoneNaoEncontradoException extends Exception {

	public TelefoneNaoEncontradoException(Telefone fone) {
		super("Telefone nao encontrado");
	}
}
