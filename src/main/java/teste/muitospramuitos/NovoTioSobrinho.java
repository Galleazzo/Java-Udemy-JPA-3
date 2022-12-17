package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tia1 = new Tio("Maria");
		Tio tia2 = new Tio("Rodrigo");
		Sobrinho sobrinho1 = new Sobrinho("Junior");
		Sobrinho sobrinho2 = new Sobrinho("Neusa");
		
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		
		tia1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tia1);
		
		tia2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia2);
		
		tia2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tia2);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirT().incluir(tia1).incluir(tia2).incluir(sobrinho1).incluir(sobrinho2).fecharT().fechar();;
		
	}
}
