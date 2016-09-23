package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.dao.AlunoDAO;
import br.com.sisaca.exceptions.PessoaNaoEncontradaException;
import br.com.sisaca.model.Aluno;
import br.com.sisaca.model.Pessoa;

public class AlunoServiceImpl implements AlunoService{

	private AlunoDAO alunoDAO;
	
	public void setAlunoDAO(AlunoDAO alunoDAO){
		this.alunoDAO = alunoDAO;
	}
	
	
	@Override
	public void addAluno(Aluno p) {
	alunoDAO.addAluno(p);
		
	}

	@Override
	public void deleteAluno(Aluno p) throws PessoaNaoEncontradaException {
		alunoDAO.deleteAluno(p);
		
	}

	@Override
	public Pessoa consultarAluno(Aluno p) throws PessoaNaoEncontradaException {
		
		return alunoDAO.consultarAluno(p);
	}

	@Override
	public ArrayList<Aluno> listar() {
		
		return alunoDAO.listar();
	}

}
