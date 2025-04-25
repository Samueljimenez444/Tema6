package ejercicio4Parte1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String texto = "";
		Scanner lectura = new Scanner(System.in);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ejercicio4Parte1\\Texto.txt"))) {
			System.out.println("Introduce el texto");
			texto = lectura.nextLine();

			while (!texto.equalsIgnoreCase("salir")) {
				System.out.println("Introduce el texto");

				bw.write(texto);
				bw.newLine();
				
				texto = lectura.nextLine();

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
		lectura.close();

	}

}
