package br.com.sisaca.exceptions;

import br.com.sisaca.model.Aluno;
import br.com.sisaca.model.Endereco;
import br.com.sisaca.model.Meio;
import br.com.sisaca.model.Pessoa;
import br.com.sisaca.model.Professor;
import br.com.sisaca.model.Telefone;

public class CampoNaoPreenchidoException extends Exception {

	public CampoNaoPreenchidoException(Pessoa p) {
		super("Preencha todos os campos do cadastro");
	}
	public CampoNaoPreenchidoException(Endereco end) {
		super("Preencha todos os campos do cadastro");
	}
	public CampoNaoPreenchidoException(Professor prof) {
		super("Preencha todos os campos do cadastro");
	}
	public CampoNaoPreenchidoException(Aluno al) {
		super("Preencha todos os campos do cadastro");
	}
	public CampoNaoPreenchidoException(Meio meio) {
		super("Preencha todos os campos do cadastro");
	}
	public CampoNaoPreenchidoException(Telefone fone) {
		super("Preencha todos os campos do cadastro");
	}
}
