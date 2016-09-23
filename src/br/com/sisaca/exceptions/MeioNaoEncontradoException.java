package br.com.sisaca.exceptions;

import br.com.sisaca.model.Meio;

public class MeioNaoEncontradoException extends Exception{

	public MeioNaoEncontradoException(Meio meio) {
		super("Meio não encontrado"+meio.getId());
	}
}
