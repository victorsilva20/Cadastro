package br.com.sisaca.dao;

import java.util.ArrayList;

import br.com.sisaca.exceptions.CampoNaoPreenchidoException;
import br.com.sisaca.exceptions.ProfessorNaoEncontradoException;
import br.com.sisaca.model.Pessoa;
import br.com.sisaca.model.Professor;

public interface ProfessorDAO {

	public void addProfessor(Professor prof) throws CampoNaoPreenchidoException;

	public void deleteProfessor(Professor prof) throws ProfessorNaoEncontradoException;

	public Pessoa consultarProf(Professor prof) throws ProfessorNaoEncontradoException;

	public ArrayList<Professor> listar();
}
