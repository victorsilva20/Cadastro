package br.com.sisaca.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.sisaca.exceptions.CampoNaoPreenchidoException;
import br.com.sisaca.exceptions.ProfessorNaoEncontradoException;
import br.com.sisaca.model.Pessoa;
import br.com.sisaca.model.Professor;

public class ProfessorDAOImpl implements ProfessorDAO {

	private static final Logger logger = LoggerFactory.getLogger(PessoaDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addProfessor(Professor prof) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(prof);
		logger.info("Professor saved succesfully, Professor Details= " + prof);
		

	}

	@Override
	public void deleteProfessor(Professor prof) throws ProfessorNaoEncontradoException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Professor> profList = (ArrayList<Professor>) session.createQuery("from professor").list();
		for (Pessoa professor : profList) {
			if (professor.getId() == prof.getId()) {
				logger.info("Professor successfully deleted" + prof);
				return;

			}
		}
		throw new ProfessorNaoEncontradoException(prof);

	}

	@Override
	public Professor consultarProf(Professor prof) throws ProfessorNaoEncontradoException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Professor> profList = (ArrayList<Professor>) session.createQuery("from professor").list();
		for (Professor professor : profList) {
			if (professor.getId() == prof.getId()) {
				logger.info("Professor List::" + prof);
				return prof;
			}
		}
		throw new ProfessorNaoEncontradoException(prof);
	}

	@Override
	public ArrayList<Professor> listar() {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Professor> profList = (ArrayList<Professor>) session.createQuery("from professor").list();
		for (Professor professor : profList) {
			logger.info("Professor List::" + professor);
		}

		return profList;
	}

}
