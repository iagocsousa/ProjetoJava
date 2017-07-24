package testeIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;//new FileInputStream("Entrada.txt");
		OutputStream os = new FileOutputStream("Saida.txt");		
		
		Scanner entrada = new Scanner(is);
		PrintStream saida = new PrintStream(os);
		
		
		while (entrada.hasNextLine()) {
			//saida.append(entrada.nextLine());	
			saida.println(entrada.nextLine());
		}
		entrada.close();
		saida.close();
	}
}
