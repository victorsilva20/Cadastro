package br.com.sisaca.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.sisaca.exceptions.CampoNaoPreenchidoException;
import br.com.sisaca.exceptions.EnderecoNaoEncontradoException;
import br.com.sisaca.model.Endereco;

public class EnderecoDAOImpl implements EnderecoDAO {

	private static final Logger logger = LoggerFactory.getLogger(PessoaDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addEndereco(Endereco end)  {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(end);
		logger.info("Endereco saved succesfully, Endereco Details= " + end);
		
		

	}

	@Override
	public void deleteEndereco(Endereco end) throws EnderecoNaoEncontradoException {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Endereco> endList = (ArrayList<Endereco>) session.createQuery("from endereco").list();
		for (Endereco endereco : endList) {
			if (endereco.getId() == end.getId()) {
				session.delete(end);
				logger.info("Endereco successfully deleted" + end);
				return;

			}
		}
		throw new EnderecoNaoEncontradoException(end);

	}

	@Override
	public Endereco consultarEndereco(Endereco end) throws EnderecoNaoEncontradoException {

		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Endereco> endList = (ArrayList<Endereco>) session.createQuery("from endereco").list();
		for (Endereco endereco : endList) {
			if (endereco.getId() == end.getId()) {
				logger.info("Endereco List::" + end);
				return endereco;
			}
		}
		throw new EnderecoNaoEncontradoException(end);

	}

	@Override
	public ArrayList<Endereco> listar() {
		Session session = this.sessionFactory.getCurrentSession();
		ArrayList<Endereco> endList = (ArrayList<Endereco>) session.createQuery("from endereco").list();
		for (Endereco endereco : endList) {
			logger.info("Endereco List::" + endereco);
		}

		return endList;
	}
}
