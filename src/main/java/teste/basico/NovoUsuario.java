package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-udemy2");
		EntityManager em = emf.createEntityManager();
		
		Usuario user = new Usuario("Sandra", "sandra@gmail.com");
		
		em.getTransaction().begin();
		
		em.persist(user);
		
		em.getTransaction().commit();
				
		em.close();
		emf.close();
		
	}

}
