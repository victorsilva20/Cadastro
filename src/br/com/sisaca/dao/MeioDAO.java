package br.com.sisaca.dao;

import java.util.ArrayList;

import br.com.sisaca.exceptions.CampoNaoPreenchidoException;
import br.com.sisaca.exceptions.MeioNaoEncontradoException;
import br.com.sisaca.model.Meio;
import br.com.sisaca.model.Pessoa;

public interface MeioDAO {

	public void addMeio(Meio meio) throws CampoNaoPreenchidoException; 

	public void deleteMeio(Meio meio) throws MeioNaoEncontradoException;

	public Meio consultarMeio(Meio meio) throws MeioNaoEncontradoException;

	public ArrayList<Meio> listar();

	
}
