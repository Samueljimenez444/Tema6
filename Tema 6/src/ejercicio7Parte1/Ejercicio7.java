package ejercicio7Parte1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejercicio7 {
	static HashMap<String, Integer> listaContactos = new HashMap<>();

	public static void main(String[] args) {
		int eleccion;
		int numero;
		String nombre;
		listaContactos.put("ola", 1);
		listaContactos.put("hola", 2);
		listaContactos.put("mola", 3);

		Scanner lectura = new Scanner(System.in);

		do {
			leerFichero();
			System.out.println("-- MENU --");
			System.out.println("1 Nuevo Contacto.");
			System.out.println("2 Buscar por nombre.");
			System.out.println("3 Mostrar todos");
			
			System.out.println("0 Salir.");

			eleccion = lectura.nextInt();
			lectura.nextLine();

			switch (eleccion) {
			case 1:
				System.out.println("Introduce el nombre del contacto");
				nombre = lectura.nextLine();
				System.out.println("Introduce el numero el contacto");
				numero = lectura.nextInt();

				listaContactos.put(nombre, numero);
				break;

			case 2:
				System.out.println("Introduce el numero del contacto que quieres buscar");
				numero = lectura.nextInt();

				if (listaContactos.containsKey(numero)) {
					System.out.println(listaContactos.get(numero));
				} 
				else {
					System.out.println("No existe contacto con ese nombre");
				}
				break;

			case 3:
				for (Entry<String, Integer> entry : listaContactos.entrySet()) {
					String clave = entry.getKey();
					Integer valor = entry.getValue();
					System.out.println("Clave: " + clave + ", Valor: " + valor);
				}
				break;
			}
		} while (eleccion != 0);
		actualizarFichero();
		
		}

	public static void actualizarFichero() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ejercicio7Parte1\\Agendas.txt"))) {
			for (String nombre : listaContactos.keySet()) {
				bw.write(nombre + " " + listaContactos.get(nombre));
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero este no se ha encontrado ");
		}
	}
	public static void leerFichero() {

		try (BufferedReader br = new BufferedReader(new FileReader("src\\ejercicio7Parte1\\Agendas.txt"))) {

			String[] datos;

			String linea = br.readLine();
			while (linea != null) {
				datos = linea.split(" ");
				listaContactos.put(datos[0], Integer.parseInt(datos[1]));

				linea = br.readLine();
			}

		} catch (FileNotFoundException e) {
			try {
				FileWriter f = new FileWriter("src\\ejercicio7Parte1\\Agendas.txt");
				f.close();
			} catch (IOException e1) {
				System.out.println("Error al crear el fichero: " + e1.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error al leer el fichero: " + e.getMessage());
		}

	}
}
