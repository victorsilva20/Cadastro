package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.exceptions.PessoaNaoEncontradaException;
import br.com.sisaca.model.Aluno;
import br.com.sisaca.model.Pessoa;

public interface AlunoService {

	public void addAluno(Aluno p);

	public void deleteAluno(Aluno p) throws PessoaNaoEncontradaException;

	public Pessoa consultarAluno(Aluno p) throws PessoaNaoEncontradaException;

	public ArrayList<Aluno> listar();

}
