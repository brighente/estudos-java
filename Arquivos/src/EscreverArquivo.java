import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreverArquivo {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream(new File("C:\\Temp\\Teste.txt"));
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter escrevedor = new BufferedWriter(osw);
			
			escrevedor.write("TESTE ABC");
			escrevedor.write("\r\n");
			escrevedor.write("CACHORRO");
			escrevedor.write("\r\n");
			escrevedor.write("ABACATE");
			escrevedor.write("\r\n");
			escrevedor.write("CARAMELO");
			escrevedor.write("\r\n");
			escrevedor.write("BAZUCA");
			escrevedor.write("\r\n");
			escrevedor.close();

		} catch (Exception e) {
			e.printStackTrace();

	}
	}
}
