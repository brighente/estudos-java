
public class exercicio3 {

	public static void main(String[] args) {
		
		double mediaFinal = 9.7;
		
		if(mediaFinal <= 7) {
			System.out.println("Você precisa estudar mais");
		} else if (mediaFinal == 7) {
			System.out.println("Você foi aprovado");
		} else if (mediaFinal > 7 && mediaFinal < 8) {
			System.out.println("Parabéns, suas notas ficaram acima da média");
		} else if (mediaFinal >=8 && mediaFinal < 9) {
			System.out.println("Parabéns, sua média ficou próxima da nota máxima");
		} else if (mediaFinal >=9) {
			System.out.println("Parabéns, você é um excelente aluno");
		}
		

	}

}
