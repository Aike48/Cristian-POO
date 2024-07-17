package laboratorioUno;

public class Principal {

	Flecha flecha1, flecha2, flecha3, flecha4;
	
	public static void main(String[] args) {
		Principal miPrincipal = new Principal();

	}
	
	public Principal() {
		flecha1 = new Flecha();
		flecha1.construirFlecha();
		flecha1.inprimirEspacio();
		
		flecha2 = new Flecha();
		flecha2.longitud = 34;
		flecha2.color = "rojo";
		flecha2.construirFlecha();
		flecha2.inprimirEspacio();
		
		flecha3 = new Flecha(12, "negro");
		flecha3.construirFlecha();
		flecha3.inprimirEspacio();
		
		flecha4 = new Flecha();
		flecha4.pedirDatos();
		flecha4.inprimirEspacio();
	}

}
