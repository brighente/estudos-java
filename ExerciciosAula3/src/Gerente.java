
public class Gerente extends Funcionario {

	public Gerente(Integer codigo, String nome) {
		super(codigo, nome);
	}
	

	public double getSalario() {
		return super.getSalario() + (super.getSalario() * 0.45);
 	}
	

	public String imprimirFolhaPagamento() {
		return "Gerente (Bonificação de 45%)\n" + super.imprimirFolhaPagamento();
	}
}
