package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.exceptions.MeioNaoEncontradoException;
import br.com.sisaca.model.Meio;

public interface MeioService {

	public void addMeio(Meio meio);

	public void deleteMeio(Meio meio) throws MeioNaoEncontradoException;

	public Meio consultarMeio(Meio meio) throws MeioNaoEncontradoException;

	public ArrayList<Meio> listar();

}
