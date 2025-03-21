
public class Teste {

	public static void main(String[] args) {
		
		/* Modificadores
		 * public  --> usar em qualquer arquivo
		 * private --> so funciona dentro das chaves onde foram criadas
		 * protected --> so funciona no mesmo pacote
		 * default  --> igual o protected
		*/
		
		String nomePessoa = "Joao Vitor Brighente de Souza";
		
		String[] pedacos = nomePessoa.split(" ");
		
		int idade = 18;
		Integer idadeObj = null; // Objeto
		
		double altura = 1.79;
		Double alturaonj = null; // Objeto
		
		char genero = 'M'; //Para guardar um char é aspas simples
		Character generoObj = null; // Obejto
		
		System.out.println("O nome é: "+nomePessoa+". A idade é: "+idade);
		
		if (altura>1.85 && idade>18) {
			System.out.println("O "+nomePessoa+" pode entrar no time de basquete.");
		} else {
			System.out.println("O "+nomePessoa+" não pode entrar no time de basquete");
		}
		
		/*			
		 		Diferença entre .equals e ==
			
			Para comparar texto usar .equals
		 	Para comparar numeros usar ==
		 
		 	.equalsIgnoreCase ---> Compara sem ser case sensitive;
		 
		 */
	}

}
