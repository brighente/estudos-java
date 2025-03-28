import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class CadastroPet {

	public static void cadastrarPet() {
		
		try {

			InputStream is = new FileInputStream(new File("C:\\Users\\jvbri\\OneDrive\\Área de Trabalho\\Dev\\estudos-java\\DesafioCadastro\\formulario.txt"));
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			
			String caminhoArquivoRespostas = "C:\\Users\\jvbri\\OneDrive\\Área de Trabalho\\Dev\\estudos-java\\DesafioCadastro\\respostas.txt";
			BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivoRespostas));
			
			pet pet = new pet();
			
			
			String linha = null;
			while((linha = leitor.readLine()) != null) {
				String resposta = JOptionPane.showInputDialog(linha);
				
				if(linha.startsWith("1 -")) {
					pet.setNome(resposta);
					escritor.write("Nome: " + resposta + "\n");
				}
				if(linha.startsWith("2 -")) {
					pet.setTipo(resposta);
					escritor.write("Tipo: " + resposta + "\n");
				}
				if(linha.startsWith("3 -")) {
					pet.setSexo(resposta);
					escritor.write("Sexo: " + resposta + "\n");
				}
				if(linha.startsWith("4 -")) {
					pet.setEndereco(resposta);
					escritor.write("Endereço: " + resposta + "\n");
				}
				if(linha.startsWith("5 -")) {
					while(Integer.parseInt(resposta) < 0 || Integer.parseInt(resposta) > 20){
						JOptionPane.showMessageDialog(null, "Idade inválida, informe novamente!");
						
						resposta = JOptionPane.showInputDialog(linha);
					}  
						pet.setIdade(Integer.parseInt(resposta));
						escritor.write("Idade: " + resposta + "\n");
	
				}
				if(linha.startsWith("6 -")) {
					while(Double.parseDouble(resposta) > 60 || Double.parseDouble(resposta) < 0.5) {
						JOptionPane.showMessageDialog(null, "Peso inválido, informe novamente!");
						resposta = JOptionPane.showInputDialog(linha);
					}
					pet.setPeso(Double.parseDouble(resposta));
					escritor.write("Peso: " + resposta + "\n");
				}
				if(linha.startsWith("7 -")) {
					pet.setRaca(resposta);
					escritor.write("Raça: " + resposta + "\n");
				}
			
		} 
		leitor.close();
		escritor.close();
		
		LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd'T'HH,mm");
        String dataHoraFormatada = agora.format(formatter);
        
        String nomeArquivo = dataHoraFormatada + "-" + pet.nome.toUpperCase().replaceAll(" ", "_");
        
        String caminhoNovoArquivo = "C:\\Users\\jvbri\\OneDrive\\Área de Trabalho\\Dev\\estudos-java\\DesafioCadastro\\respostasForm\\" + nomeArquivo + ".txt";
		
        File arquivoOriginal = new File(caminhoArquivoRespostas);
        File novoArquivo = new File(caminhoNovoArquivo);
        
        arquivoOriginal.renameTo(novoArquivo);
		
		} catch (Exception e) {
			e.printStackTrace();

			
		
		}
	}
}

