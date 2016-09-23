package br.com.sisaca.dao;

import br.com.sisaca.model.Telefone;

public class TelefoneNaoEncontradaException extends Exception {

	public TelefoneNaoEncontradaException(Telefone fone) {
		super("Telefone nao encontrado");
	}
}
