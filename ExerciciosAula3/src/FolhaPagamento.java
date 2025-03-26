
public class FolhaPagamento {

	public static void main(String[] args) {
		Gerente gerente = new Gerente(14, "Juca");
		System.out.println(gerente.imprimirFolhaPagamento());
		
		Vendedor vendedor = new Vendedor(2, "Paulo");
		System.out.println(vendedor.imprimirFolhaPagamento());
		
		Telefonista telefonista = new Telefonista(3, "Ana");
		System.out.println(telefonista.imprimirFolhaPagamento());
	}
}
