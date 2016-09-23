package br.com.sisaca.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.sisaca.exceptions.CampoNaoPreenchidoException;
import br.com.sisaca.exceptions.PessoaNaoEncontradaException;
import br.com.sisaca.exceptions.PublicacaoNaoEncontradaException;
import br.com.sisaca.model.Pessoa;
import br.com.sisaca.model.Publicacao;

public class PublicacaoDAOImpl implements PublicacaoDAO {

	private static final Logger logger = LoggerFactory.getLogger(PessoaDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addPublicacao(Publicacao publ) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(publ);
		logger.info("Publicacao saved succesfully, Publicacao Details= " + publ);

	}

	@Override
	public void deletePublicacao(Publicacao publ) throws PublicacaoNaoEncontradaException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Publicacao> publList = (ArrayList<Publicacao>) session.createQuery("from publicacao").list();
		for (Publicacao publicacao : publList) {
			if (publicacao.getId() == publ.getId()) {
				session.delete(publ);
				logger.info("Publicacao successfully deleted" + publ);
				return;
			}
		}
		throw new PublicacaoNaoEncontradaException(publ);
	}

	@Override
	public Publicacao consultarPublicacao(Publicacao publ) throws PublicacaoNaoEncontradaException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Publicacao> publList = (ArrayList<Publicacao>) session.createQuery("from publicacao").list();
		for (Publicacao publicacao : publList) {
			if (publicacao.getId() == publ.getId()) {
				logger.info("Publicacao List::" + publ);
				return publicacao;
			}
		}
		throw new PublicacaoNaoEncontradaException(publ);

	}

	@Override
	public ArrayList<Publicacao> listar() {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Publicacao> publList = (ArrayList<Publicacao>) session.createQuery("from publicacao").list();
		for (Publicacao publicacao : publList) {
			logger.info("Publicacao List::" + publicacao);
		}

		return publList;
	}
}
