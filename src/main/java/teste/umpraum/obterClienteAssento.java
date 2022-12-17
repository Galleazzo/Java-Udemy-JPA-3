package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class obterClienteAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		Cliente cliente = dao.ObterPorID(3);
		System.out.println(cliente.getAssento().getNome());
		
		dao.fechar();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.ObterPorID(3);
		
		System.out.println(assento.getCliente().getNome());
		daoAssento.fechar();
	}
	
}
