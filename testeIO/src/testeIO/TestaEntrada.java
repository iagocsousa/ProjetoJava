package testeIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestaEntrada {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Entrada.txt")) );
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Saida.txt")) );		


		String linha = br.readLine();

		while (linha != null){
			bw.write(linha); 
			bw.newLine(); 			
			linha = br.readLine();						
		}
		br.close();
		bw.close();
	}

}

