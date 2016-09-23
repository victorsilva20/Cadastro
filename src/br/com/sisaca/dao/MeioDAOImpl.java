package br.com.sisaca.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.sisaca.exceptions.CampoNaoPreenchidoException;
import br.com.sisaca.exceptions.MeioNaoEncontradoException;
import br.com.sisaca.exceptions.PessoaNaoEncontradaException;
import br.com.sisaca.model.Meio;
import br.com.sisaca.model.Pessoa;

public class MeioDAOImpl implements MeioDAO {

	private static final Logger logger = LoggerFactory.getLogger(PessoaDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	
	@Override
	public void addMeio(Meio meio) throws CampoNaoPreenchidoException {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(meio);
		logger.info("Professor saved succesfully, Pessoa Details= " + meio);
		throw new  CampoNaoPreenchidoException(meio);
		
	}

	@Override
	public void deleteMeio(Meio meio) throws MeioNaoEncontradoException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Meio> meioList = (ArrayList<Meio>) session.createQuery("from Meio").list();
		for (Meio me : meioList) {
			if (meio.getId() == me.getId()) {
				logger.info("Pessoa successfully deleted" + meio);

			}
		}
		throw new MeioNaoEncontradoException(meio);

	}

	@Override
	public Meio consultarMeio(Meio meio) throws MeioNaoEncontradoException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Meio > meioList = (ArrayList<Meio >) session.createQuery("from Meio ").list();
		for (Meio  me : meioList ) {
			if (meio.getId() == me.getId()) {
				logger.info("Pessoa List::" + meio);
				return me;
			}
		}
		throw new MeioNaoEncontradoException(meio);
	}

	@Override
	public ArrayList<Meio> listar() {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Meio> meioList = (ArrayList<Meio>) session.createQuery("from Meio").list();
		for (Meio meio : meioList) {
			logger.info("Pessoa List::" + meio);
		}

		return meioList;
	}

	

}
