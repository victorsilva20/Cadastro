package br.com.sisaca.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.sisaca.exceptions.PessoaNaoEncontradaException;
import br.com.sisaca.model.Aluno;

@Repository
public class AlunoDAOImpl implements AlunoDAO {

	private static final Logger logger = LoggerFactory.getLogger(PessoaDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addAluno(Aluno a) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Aluno saved succesfully, Aluno Details= " + a);
	}

	@Override
	public void deleteAluno(Aluno a) throws PessoaNaoEncontradaException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Aluno> alunoList = (ArrayList<Aluno>) session.createQuery("from aluno").list();
		for (Aluno al : alunoList) {
			if (al.getMatricula() == a.getMatricula()) {
				session.delete(a);
				logger.info("Aluno successfully deleted" + a);
				return;

			}
		}
		throw new PessoaNaoEncontradaException(a);

	}

	@Override
	public Aluno consultarAluno(Aluno a) throws PessoaNaoEncontradaException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Aluno> alunoList = (ArrayList<Aluno>) session.createQuery("from aluno").list();
		for (Aluno al : alunoList) {
			if (al.getMatricula() == a.getMatricula()) {
				logger.info("Aluno List::" + a);
				return al;
			}
		}
		throw new PessoaNaoEncontradaException(a);

	}

	@Override
	public ArrayList<Aluno> listar() {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Aluno> alunoList = (ArrayList<Aluno>) session.createQuery("from aluno").list();
		for (Aluno al : alunoList) {
			logger.info("Aluno List::" + al);
		}

		return alunoList;
	}

}
