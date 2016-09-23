package br.com.sisaca.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.sisaca.exceptions.TelefoneNaoEncontradoException;
import br.com.sisaca.model.Telefone;

public class TelefoneDAOImpl implements TelefoneDAO {

	private static final Logger logger = LoggerFactory.getLogger(PessoaDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addTelefone(Telefone fone) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(fone);
		logger.info("Telefone saved succesfully, Telefone Details= " + fone);

	}

	@Override
	public void deleteTelefone(Telefone fone) throws TelefoneNaoEncontradoException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Telefone> telefoneList = (ArrayList<Telefone>) session.createQuery("from telefone").list();
		for (Telefone tel : telefoneList) {
			if (tel.getId() == fone.getId()) {
				logger.info("Telefone successfully deleted" + fone);
				return;

			}
		}
		throw new TelefoneNaoEncontradoException(fone);

	}

	@Override
	public Telefone consultarTelefone(Telefone fone) throws TelefoneNaoEncontradoException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Telefone> telefonesList = (ArrayList<Telefone>) session.createQuery("from telefone").list();
		for (Telefone tel : telefonesList) {
			if (tel.getId() == fone.getId()) {
				logger.info("Telefone List::" + fone);
				return fone;
			}
		}
		throw new TelefoneNaoEncontradoException(fone);
	}

	@Override
	public ArrayList<Telefone> listar() {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Telefone> telefonesList = (ArrayList<Telefone>) session.createQuery("from telefone").list();
		for (Telefone tel : telefonesList) {
			logger.info("Telefone List::" + tel);
		}

		return telefonesList;
	}

}
