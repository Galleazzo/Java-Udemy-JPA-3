package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.Pedido;
import modelo.umpramuitos.itemPedido;

public class NovoPedido {
	
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Produto produto = new Produto("Geladeira", 2799.99);
		Pedido pedido = new Pedido();
		itemPedido item = new itemPedido(pedido, produto, 10);
		
		dao.abrirT().incluir(produto).incluir(pedido).incluir(item).fecharT().fechar();;
		
		
	}
}
