
public class telefonista extends funcionario{

	public telefonista(Integer codigo, String nome) {
		super(codigo, nome);
	}
	
	public double getSalario() {
		return super.getSalario() + (super.getSalario() * 0.1);
	}
	
	public String imprimirFolhaPagamento() {
		return "Telefonista (Bonificação de 10%)\n"+super.imprimirFolhaPagamento();
	}
}
