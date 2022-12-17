package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		Assento assento = new Assento("4C");
		Cliente cliente = new Cliente("Rodrigo", assento);
		
		DAO<Object> dao = new DAO<>();
		dao.incluirAtomico(cliente);
		
	}
	
}
