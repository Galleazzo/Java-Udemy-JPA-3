package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class DeletarUsuario {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-udemy2");
		EntityManager em = emf.createEntityManager();
		
		Integer id = 3;
		Usuario user = em.find(Usuario.class, id);
		
		if(user.getId() == id) {
			em.getTransaction().begin();
			
			em.remove(user);
			System.out.println("Usuario removido com o id "+id+" foi removido com sucesso");
			em.getTransaction().commit();
		}else {
			System.out.println("Nao foi possivel encontrar");
		}
		
		em.close();
		emf.close();
	}
	
}
