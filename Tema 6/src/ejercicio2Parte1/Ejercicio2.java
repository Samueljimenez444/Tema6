package ejercicio2Parte1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int numero;
		int contador=0;
		double media=0.0;
		int suma=0;
		
		try(Scanner lectura=new Scanner(new FileReader("src\\ejercicio2Parte1\\Enteros.txt"))){
			while(lectura.hasNextInt()) {
			numero=lectura.nextInt();
			suma+=numero;
			contador++;
			}
			media=suma/contador;
			System.out.println(media);
			System.out.println(suma);
		} catch (FileNotFoundException e) {
			System.out.println("Error no se ha encontrado el archivo" + e.getMessage());
		}
	}
}
