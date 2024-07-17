package objeto_cristian;

public class Mascota {
	// Atributos
	String nombre;
	String especie;
	int edad;
	int identificacion;
	// Constructor sin parametros
	public Mascota() {
	}
	// Constructor con parametros
	public Mascota(String nombre, String especie, int edad, int identificacion) {
	this.nombre = nombre;
	this.especie = especie;
	this.edad = edad;
	this.identificacion = identificacion;
	}
	// Método para mostrar información de la mascota
	public void mostrarInformacion() {
	System.out.println("Nombre: " + nombre);
	System.out.println("Especie: " + especie);
	System.out.println("Edad: " + edad + " años");
	System.out.println("Identificación: " + identificacion);
	}
	// Método para hacer que la mascota realice un sonido
	public void hacerSonido() {
	if (especie.equalsIgnoreCase("perro")) {
	System.out.println("¡Guau guau!");
	} else if (especie.equalsIgnoreCase("gato")) {
	System.out.println("¡Miau miau!");
	} else {
	System.out.println("La mascota no hace sonidos conocidos.");
	}
	}
	
	// Método para hacer que la mascota haga un truco
	public void hacerTruco() {
	if (especie.equalsIgnoreCase("perro")) {
		System.out.println("Tu perro esta levantando la pata!");
		} else if (especie.equalsIgnoreCase("gato")) {
		System.out.println("Tu gato no quiere hacer nada y solo te mira mal");
		}else if (especie.equalsIgnoreCase("ave")) {
		System.out.println("Tu pájaro esta cantando");}
		else {
		System.out.println("Tu mascota esta haciendo un truco de." + especie);
		}
	}
	
	// Método para hacer que la mascota coma
		public void comer(String tipoComida) {
		if (especie.equalsIgnoreCase("perro")) {
			
			if (tipoComida == "Comida de perro") {
				System.out.println("Tu perro come feliz");
			}
			else if (tipoComida == "carne") {
				System.out.println("Tu perro se enfermó, que dueño inrresponsable");
			} else {
				System.out.println("Tu mascota murió, ¿por qué le das comida que no es apta para" + especie + "? :(");
			}
		} 
			else if (especie.equalsIgnoreCase("gato")) {
				if (tipoComida == "Comida de gato") {
					System.out.println("Tu gato come medio feliz");
				}
				else if (tipoComida == "carne") {
					System.out.println("Tu gato se enfermó, que dueño inrresponsable");
				} else {
					System.out.println("Tu mascota murió, ¿por qué le das comida que no es apta para" + especie + "? :(");
				}
				
			}else if (especie.equalsIgnoreCase("ave")) {
			if (tipoComida == "Comida de ave") {
				System.out.println("Tu ave come feliz");
			}
			else if (tipoComida == "carne") {
				System.out.println("Tu ave no comió, ¿cómo comerá eso?");
			} else {
				System.out.println("Tu mascota murió, ¿por qué le das comida que no es apta para" + especie + "? :(");
			}
			}
		
			else {
			System.out.println("Tu mascota esta comiendo");
			}
		}
	
	}