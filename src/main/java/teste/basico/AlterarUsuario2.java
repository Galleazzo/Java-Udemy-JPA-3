package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-udemy2");
		EntityManager em = emf.createEntityManager();
		
		Usuario user = em.find(Usuario.class, 3);
		user.setEmail("danielzinho@hotmail.com@hotmail.com");
		
		em.getTransaction().begin();
		
		em.persist(user);
		
		System.out.println("Usuario alterado");
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
}
