package ejercicio1Parte1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio1Oficial {

	public static void main(String[] args) {
		int suma = 0;
		double media = 0.0;
		int contador = 0;
		int numero;

		try (Scanner lectura = new Scanner(new FileReader("src\\ejercicio1Parte1\\NumerosReales.txt"))) {
			while (lectura.hasNextInt()) {
				numero = lectura.nextInt();
				contador++;
				suma += numero;
			}
			media = suma / contador;
			System.out.println(media + " " + suma);
		} catch (FileNotFoundException e) {

			System.out.println("Error el archivo no se encuentra");
		}

	}

}
