package br.com.sisaca.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.sisaca.exceptions.PessoaNaoEncontradaException;
import br.com.sisaca.model.Pessoa;

@Repository
public class PessoaDAOImpl implements PessoaDAO {

	private static final Logger logger = LoggerFactory.getLogger(PessoaDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addPessoa(Pessoa p)  {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Pessoa saved succesfully, Pessoa Details= " + p);
		

	}

	@Override
	public void deletePessoa(Pessoa p) throws PessoaNaoEncontradaException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Pessoa> personsList = (ArrayList<Pessoa>) session.createQuery("from pessoa").list();
		for (Pessoa pe : personsList) {
			if (pe.getCpf().equals(p.getCpf())) {
				session.delete(p);
				logger.info("Pessoa successfully deleted" + p);
				return;

			}
		}
		throw new PessoaNaoEncontradaException(p);

	}

	@Override
	public Pessoa consultarPessoa(Pessoa p) throws PessoaNaoEncontradaException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Pessoa> personsList = (ArrayList<Pessoa>) session.createQuery("from pessoa").list();
		for (Pessoa pe : personsList) {
			if (pe.getCpf().equals(p.getCpf())) {
				logger.info("Pessoa List::" + p);
				return pe;
			}
		}
		throw new PessoaNaoEncontradaException(p);

	}

	@Override
	public ArrayList<Pessoa> listar() {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Pessoa> personsList = (ArrayList<Pessoa>) session.createQuery("from pessoa").list();
		for (Pessoa p : personsList) {
			logger.info("Pessoa List::" + p);
		}

		return personsList;
	}

}
