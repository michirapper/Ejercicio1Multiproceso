
import java.io.*;
import java.util.Scanner;

class Ejercicio1 {
	public static void main(String[] args) {
		Runtime runTime = Runtime.getRuntime();
		Process process = null;
		try {
			Scanner sc = new Scanner(System.in);
			String fin = "fin";
			while (!sc.nextLine().equals(fin)) {

				process = runTime.exec("java -jar ./src/Ejercicio1.jar");
				BufferedReader on = new BufferedReader(new InputStreamReader(process.getInputStream()));
				PrintStream on1 = new PrintStream(process.getOutputStream());
				System.out.println(on.readLine());
				BufferedReader on2 = new BufferedReader(new InputStreamReader(System.in));
				//System.out.println(on2.read()); 
				process.destroy();
				on1.flush();
				//ni idea de que hacer en el 2 y 3

			}
			sc.close();

		} catch (IOException e) {
			System.out.println("No pudimos correr el programa");
			System.exit(-1);
		}
		if (process != null)
			process.destroy();
		try {
			process.waitFor();
		} catch (InterruptedException e) {
			System.out.println("No pudimos esperar por témino");
			System.exit(-1);
		}
		System.exit(0);

	}
}