import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaDeUMarquivo {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		
		PrintStream ps = new PrintStream("saida.txt");
		
		Integer contador = 0;
		System.out.println("Digite sua mensagem: ");
		while(entrada.hasNextLine()){
			String linha = ++contador + " => " + entrada.nextLine();
			ps.println(linha);
		}
		entrada.close();
		ps.close();
	}
}
