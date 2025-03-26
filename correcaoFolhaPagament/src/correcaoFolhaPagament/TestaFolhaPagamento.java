package correcaoFolhaPagament;

public class TestaFolhaPagamento {

	public static void main(String[] args) {
		Gerente gerente = new Gerente(1, "Matheus");
		System.out.println(gerente.imprimirFolhaPagamento());
		
		Telefonista telefonista = new Telefonista(2, "Micheli");
		System.out.println(telefonista.imprimirFolhaPagamento());
		
		Vendedor vendedor = new Vendedor(3, "Lucas");
		System.out.println(vendedor.imprimirFolhaPagamento());
				
	}

}
