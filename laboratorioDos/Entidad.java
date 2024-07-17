package laboratorioDos;

import javax.swing.JOptionPane;

// Iniciando la clase que nos permitirá la crecación de nuestro objeto 
public class Entidad {
	private double ladoA;
	private double ladoB;
	
	//primer método de nuestra clase que se encargará de pedir los datos al usuario
	public void ingresarDatos () {
		String cadena;
		cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado A:");
		ladoA = Double.parseDouble(cadena);
		
		cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado B:");
		ladoB = Double.parseDouble(cadena);
			
	}
	
	//Segundo método encargado de realizar el cálculo del área
	public void calcularArea () {
		double resultado = ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "El resultado es:" + resultado);
	}
}
