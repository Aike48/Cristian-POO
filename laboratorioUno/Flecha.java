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
		
		cadena = JOptionPane.showInputDialog(null, "Ingrese el color que desea para la flecha entre el rojo y negro:");
		color = cadena;
		
		construirFlecha();
		inprimirEspacio();
	}

	public Flecha() {
		this.longitud = 24;
		this.color= "negro";
	}
}



