package br.com.sisaca.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.sisaca.exceptions.CampoNaoPreenchidoException;
import br.com.sisaca.exceptions.PessoaNaoEncontradaException;
import br.com.sisaca.model.Pessoa;
import br.com.sisaca.model.Telefone;

public class TelefoneDAOImpl implements TelefoneDAO{

	
	private static final Logger logger = LoggerFactory.getLogger(PessoaDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addTelefone(Telefone fone) throws CampoNaoPreenchidoException {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(fone);
		logger.info("Pessoa saved succesfully, Pessoa Details= " +fone);
		throw new CampoNaoPreenchidoException(fone);
		
	}

	@Override
	public void deleteTelefone(Telefone fone) throws TelefoneNaoEncontradaException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Telefone> telefoneList = (ArrayList<Telefone>) session.createQuery("from Telefone").list();
		for (Telefone tel : telefoneList) {
			if (tel.getId() == fone.getId()) {
				logger.info("Pessoa successfully deleted" + fone);

			}
		}
		throw new TelefoneNaoEncontradaException(fone);
		
	}

	@Override
	public Telefone consultarTelefone(Telefone fone) throws TelefoneNaoEncontradaException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Telefone> telefonesList = (ArrayList<Telefone>) session.createQuery("from Telefone").list();
		for (Telefone tel: telefonesList ) {
			if (tel.getId() == fone.getId()) {
				logger.info("Pessoa List::" + fone);
				return fone;
			}
		}
		throw new TelefoneNaoEncontradaException(fone);
	}

	@Override
	public ArrayList<Telefone> listar() {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Telefone> telefonesList = (ArrayList<Telefone>) session.createQuery("from Telefone").list();
		for (Telefone tel: telefonesList ) {
			logger.info("Pessoa List::" + tel);
		}

		return telefonesList;
	}

}
