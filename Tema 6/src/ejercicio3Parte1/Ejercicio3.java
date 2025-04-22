package ejercicio3Parte1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) {
		String nombre;
		String edad;
		String altura;
		String datos;
		String[] datosAlumnos = new String[9];

		try (BufferedReader br = new BufferedReader(new FileReader("src\\ejercicio3Parte1\\Alumnos.txt"))) {
			datos = br.readLine();
			while (datos != null) {
				datosAlumnos = datos.split(" ");
				nombre = datosAlumnos[0];
				edad = datosAlumnos[1];
				altura = datosAlumnos[2];
				System.out.println(nombre + " " + edad + " " + altura);
				datos = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
