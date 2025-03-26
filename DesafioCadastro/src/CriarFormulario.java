import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class CriarFormulario {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:\\Users\\jvbri\\OneDrive\\Área de Trabalho\\Dev\\estudos-java\\DesafioCadastro\\formulario.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter criarForm = new BufferedWriter(osw);
			
			criarForm.write("1 - Qual o nome e sobrenome do pet?\n");
			criarForm.write("2 - Qual o tipo do pet (Cachorro/Gato)?\n");
			criarForm.write("3 - Qual o sexo do animal?\n");
			criarForm.write("4 - Qual endereço e bairro que ele foi encontrado?\n");
			criarForm.write("5 - Qual a idade aproximada do pet?\n");
			criarForm.write("6 - Qual o peso aproximado do pet?\n");
			criarForm.write("7 - Qual a raça do pet?\n");
			
			criarForm.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
