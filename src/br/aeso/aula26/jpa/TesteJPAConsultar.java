package br.aeso.aula26.jpa;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.aeso.aula26.jpa.modelo.Conta;
public class TesteJPAConsultar {
	public static void main(String[] args) {
		Conta conta = null;
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("contas-mysql");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		// Consulta com Select 
		Query query = em.createQuery("select c from Conta c");
		//Query query = em.createQuery("select c from Conta c where c.titular = :pTitular");
		//query.setParameter("pTitular", "Maria dos Santos");
		//conta = (Conta) query.getSingleResult();
		List<Conta> lista = query.getResultList();
		
		// Consulta via Hibernate
		//conta = em.find(Conta.class, 1);
		
		//conta.setTitular("Mauricio");
		
		System.out.println(lista);
		//conta.setTitular("Mauricio");
		// Removendo 
		//em.remove(conta);
		
		// Confirmando alterações
		em.getTransaction().commit();
	}
}
