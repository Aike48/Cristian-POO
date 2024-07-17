package laboratorioDos;

public class ClaseConObjetos {
	public static void main (String args[]) {
		//Creación de un nuevo objeto a base de la clase "Entidad"
		Entidad rectangulo;
		rectangulo = new Entidad ();
		
		//llamado de los métodos de la clase
		rectangulo.ingresarDatos();
		rectangulo.calcularArea();
	}
}
