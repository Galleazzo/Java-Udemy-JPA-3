package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	
	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-udemy2");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u";
		
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		
		List<Usuario> users = query.getResultList();
		
		users.forEach(u ->{
			System.out.println("ID: "+u.getId()+"	 Nome: "+u.getNome()+"	 Email: "+u.getEmail());
		});
		
		em.close();
		emf.close();

		
	}
	
		
}
