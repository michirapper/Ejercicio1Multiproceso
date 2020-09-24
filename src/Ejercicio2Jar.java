import java.util.Arrays;

public class Ejercicio2Jar {
	public static void main(String args[]) {
		StringBuilder sbf = new StringBuilder();
		String[] hola = args;
		sbf.append(Arrays.toString(hola).replaceAll("\\[|\\]|,|\\s", "")); 
		System.out.println(sbf.toString().toUpperCase());

	}
}