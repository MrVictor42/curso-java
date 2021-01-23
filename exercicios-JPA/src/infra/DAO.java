package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO <Entidade> {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<Entidade> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<Entidade> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<Entidade> abrirTransacao() {
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<Entidade> fecharTransacao() {
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<Entidade> incluir(Entidade entidade) {
		em.persist(entidade);
		return this;
	}
	
	public DAO<Entidade> incluirAtomico(Entidade entidade) {
		return this.abrirTransacao().incluir(entidade).fecharTransacao();
	}
	
	public List<Entidade> obterTodos() {
		return this.obterTodos(10, 0);		
	}
	
	public List<Entidade> obterTodos(int quantidadeRegistros, int deslocamento) {
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}
		
		String jpql = "SELECT e from " + classe.getName() + " e";
		TypedQuery<Entidade> query = em.createQuery(jpql, classe);
		query.setMaxResults(quantidadeRegistros);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}
}