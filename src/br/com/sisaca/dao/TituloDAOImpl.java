package br.com.sisaca.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.sisaca.exceptions.TituloNaoEncontradoException;
import br.com.sisaca.model.Titulo;

public class TituloDAOImpl implements TituloDAO {

	private static final Logger logger = LoggerFactory.getLogger(PessoaDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addTitulo(Titulo titulo) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(titulo);
		logger.info("Titulo saved succesfully, Titulo Details= " + titulo);

	}

	@Override
	public void deleteTitulo(Titulo titulo) throws TituloNaoEncontradoException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Titulo> tituloList = (ArrayList<Titulo>) session.createQuery("from titulo").list();
		for (Titulo tit : tituloList) {
			if (tit.getId() == titulo.getId()) {
				logger.info("Titulo successfully deleted" + titulo);
				return;

			}
		}
		throw new TituloNaoEncontradoException(titulo);

	}

	@Override
	public Titulo consultarTitulo(Titulo titulo) throws TituloNaoEncontradoException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Titulo> tituloList = (ArrayList<Titulo>) session.createQuery("from titulo").list();
		for (Titulo tit : tituloList) {
			if (tit.getId() == titulo.getId()) {
				logger.info("Titulo List::" + titulo);
				return titulo;
			}
		}
		throw new TituloNaoEncontradoException(titulo);
	}

	@Override
	public ArrayList<Titulo> listar() {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Titulo> tituloList = (ArrayList<Titulo>) session.createQuery("from titulo").list();
		for (Titulo tit : tituloList) {
			logger.info("Titulo List::" + tit);
		}

		return tituloList;
	}
}
