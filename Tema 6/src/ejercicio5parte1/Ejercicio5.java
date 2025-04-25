package ejercicio5parte1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int edad;
		String nombre;
		Scanner lectura = new Scanner(System.in);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ejercicio5Parte1\\datos.txt"))) {
			
			System.out.println("Introduce el nombre");
			nombre = lectura.nextLine();

			System.out.println("Introduce la edad");
			edad = lectura.nextInt();
			
			bw.write(nombre + " " + edad);
			bw.newLine();
			bw.flush();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		lectura.close();
	}

}
