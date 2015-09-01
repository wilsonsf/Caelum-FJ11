import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EntradaDeUMarquivo {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(
//								System.in
								is
								);
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		System.out.println("Digite sua mensagem:");
		Integer contador = 0;
		while(entrada.hasNextLine()){
			String linha = ++contador + " : " + entrada.nextLine();
			bw.write(linha);
			bw.newLine();
		}
		entrada.close();
		bw.close();
	}
}
