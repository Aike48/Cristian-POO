package laboratorioDos;

import javax.swing.*;

public class ClaseConMetodos {
    public static void main (String arg[])
    {
    	// Se declaran las variables para guardar los lados y luego se le pide los datos añ usuario llamando a la clase del mismo nombre
        double ladoA;
        double ladoB;

        ladoA = ingresarDatos ("Ingrese la longitud del lado A: ");
        ladoB = ingresarDatos ("Ingrese la longitud del lado B: ");
        //Se llama la clase necesaria para calcular el resultado
        calcularArea ( ladoA, ladoB );
    }
    
// Se crea esta clase que será la que haga el funcionamiento de pedir los datos
    public static double ingresarDatos ( String mensaje )
    {
        String cadena;
        double valor;

        cadena = JOptionPane.showInputDialog ( null, mensaje );
        valor = Double.parseDouble ( cadena );

        return valor;
    }

    // Se crea la clase encargada de realizar el cálculo
    public static void calcularArea ( double a, double b )
    {
        double resultado;

        resultado = a * b;
        JOptionPane.showMessageDialog ( null, "El resultado es: " + resultado );
    }
}
// fin de la clase Aplicacion
