package br.com.sisaca.service;

import java.util.ArrayList;

import br.com.sisaca.exceptions.TituloNaoEncontradoException;
import br.com.sisaca.model.Titulo;

public interface TituloService {

	public void addTitulo(Titulo titulo);

	public void deleteTitulo(Titulo titulo) throws TituloNaoEncontradoException;

	public Titulo consultarTitulo(Titulo titulo) throws TituloNaoEncontradoException;

	public ArrayList<Titulo> listar();
}
