package objeto_cristian;

import java.util.ArrayList;

public class Ejercicio {

	public static void main(String[] args) {
		ArrayList<Mascota> listaMascotas = new ArrayList<>();
		
		Mascota mascota1 = new Mascota();
		mascota1.nombre = "Max";
		mascota1.especie = "Perro";
		mascota1.edad = 3;
		listaMascotas.add(mascota1);
		Mascota mascota2 = new Mascota();
		mascota2.nombre = "Luna";
		mascota2.especie = "Gato";
		mascota2.edad = 2;
		listaMascotas.add(mascota2);
		Mascota mascota3 = new Mascota("Paco", "Perro", 4 , 23);
		listaMascotas.add(mascota3);
		
		for (Mascota mascota : listaMascotas) {
			System.out.println("Nombre: " + mascota.nombre);
			System.out.println("Especie: " + mascota.especie);
			System.out.println("Edad: " + mascota.edad);
			System.out.println("Identificación: " + mascota.identificacion);
			System.out.println("---------------------------");
			}
		
		for (Mascota mascota : listaMascotas) {
			mascota.mostrarInformacion();
			System.out.println("---------------------------");
			}
		
		mascota1.comer("carne");

	}

}
