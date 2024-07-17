package laboratorioUno;

import javax.swing.JOptionPane;

public class Flecha {
	int longitud;
	String color;
	
	
	private void imprime (String simbolo) {
		if (color.equals("negro")) {
			System.out.print(simbolo);
		}else { System.err.print(simbolo);}
	}
	
	
	public void construirFlecha() {
		for (int i=1; i <longitud; i++) {
			imprime ("-");
		}
		imprime (">");
	}
	
	
	public void inprimirEspacio() {
		System.out.println();
	}
	
	public Flecha (int longitud, String color) {
	this.longitud=longitud;
	this.color=color;
}
	
	public void pedirDatos() {
		String cadena;
		cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud que desea ponerle a la flecha:");
		longitud = Integer.parseInt(cadena);
		
		cadena = JOptionPane.showInputDialog(null, "Ingrese el color que desea para la flecha (1 para negro y 2 para rojo)");
		if (cadena.equals("1")) {
			color = "negro";
		} 
		else if (cadena.equals("2")) {
			color = "rojo";
		}
		else {JOptionPane.showMessageDialog(null, "Ingresó un valor no válido, el color por defecto será negro");
		color = "negro";}
		
		
		construirFlecha();
		inprimirEspacio();
	}

	public Flecha() {
		this.longitud = 24;
		this.color= "negro";
	}
}



