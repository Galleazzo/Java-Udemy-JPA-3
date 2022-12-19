package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		Filme filme1 = new Filme("Procura da felicidae", 10.00);
		Filme filme2 = new Filme("Carros", 7.9); 
		
		Ator ator1 = new Ator("Paulo");
		Ator ator2 = new Ator("Daniel");
		
		filme1.adicionarAtor(ator1);
		filme1.adicionarAtor(ator2);
		
		filme2.adicionarAtor(ator2);
		
		DAO<Ator> dao = new DAO<Ator>();
		
		dao.incluirAtomico(ator2);
	}
}
