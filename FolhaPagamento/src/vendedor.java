
public class vendedor extends funcionario{
	public vendedor(Integer codigo, String nome) {
		super(codigo, nome);
	}
	
	public double getSalario() {
		return super.getSalario() + (super.getSalario() * 0.25);
	}
	
	public String imprimirFolhaPagamento() {
		return "Vendedor (Bonificação de 25%)\n"+super.imprimirFolhaPagamento();
	
}
}
