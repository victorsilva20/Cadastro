package br.com.sisaca.exceptions;

import br.com.sisaca.model.Pessoa;

public class PessoaNaoEncontradaException extends Exception {

	public PessoaNaoEncontradaException(Pessoa p) {
		super("Pessona nao encontrada" + p.getNome());
	}
}
