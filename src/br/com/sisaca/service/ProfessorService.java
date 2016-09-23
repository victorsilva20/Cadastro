package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.exceptions.ProfessorNaoEncontradoException;
import br.com.sisaca.model.Professor;

public interface ProfessorService {

	public void addProfessor(Professor prof);

	public void deleteProfessor(Professor prof) throws ProfessorNaoEncontradoException;

	public Professor consultarProf(Professor prof) throws ProfessorNaoEncontradoException;

	public ArrayList<Professor> listar();
}
