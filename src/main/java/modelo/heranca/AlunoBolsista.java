package modelo.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.DiscriminatorFormula;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {

	private Double bolsa;
	
	public AlunoBolsista() {
		
	}

	public AlunoBolsista(Integer matricula,String nome, Double bolsa) {
		super(matricula, nome);
		this.bolsa = bolsa;
	}

	public Double getBolsa() {
		return bolsa;
	}

	public void setBolsa(Double bolsa) {
		this.bolsa = bolsa;
	}
	
	
	
}
