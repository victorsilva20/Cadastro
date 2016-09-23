package br.com.sisaca.exceptions;

import br.com.sisaca.model.Endereco;

public class EnderecoNaoEncontradoException extends Exception {
	
	public EnderecoNaoEncontradoException(Endereco end) {
		super("Endereco não encontrado"+ end.getId());
	}
	

}
