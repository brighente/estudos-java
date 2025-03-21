import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivo {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream(new File("C:\\Temp\\Teste.txt"));
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			
			String linha = null;
			while((linha = leitor.readLine()) != null) {
				System.out.println(linha);
			}
			leitor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
