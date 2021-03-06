import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaEntrada {
	public static void main(String[] args) throws IOException {
//		InputStream is = System.in; // Leitura do teclado do sistema
//		InputStream is = new FileInputStream("arquivo.txt");
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(
									new FileInputStream("arquivo.txt")));
		

		System.out.println("Digite sua mensagem:");
		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}
}
