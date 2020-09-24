import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		String fin = "fin";
		String palabras="";
		while (!palabras.equals(fin)) {
		palabras = sc.nextLine();
		Process process = new ProcessBuilder().command("cmd.exe", "/c", "java -jar ./src/Ejercicio2.jar " + palabras).start();
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		sc.close();
	}
}