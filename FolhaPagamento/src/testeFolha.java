
public class testeFolha {

	public static void main(String[] args) {
		gerente Gerente = new gerente(1, "Juca");
		System.out.println(Gerente.imprimirFolhaPagamento());
		
		telefonista Telefonista = new telefonista(2,"Ana");
		System.out.println(Telefonista.imprimirFolhaPagamento());
		
		vendedor Vendedor = new vendedor(3, "Zapa");
		System.out.println(Vendedor.imprimirFolhaPagamento());
		

	}

}
