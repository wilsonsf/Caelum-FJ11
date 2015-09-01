import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaDeUMarquivo {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(
//								System.in
								new FileInputStream("arquivo.txt")
								);
		
		PrintStream ps = new PrintStream("saida.txt");
		
//		System.out.println("Digite sua mensagem:");
		Integer contador = 0;
		while(entrada.hasNextLine()){
			String linha = ++contador + " => " + entrada.nextLine();
			ps.println(linha);
		}
		entrada.close();
		ps.close();
	}
}
