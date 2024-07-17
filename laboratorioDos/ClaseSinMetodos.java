package laboratorioDos;

import javax.swing.*;

public class ClaseSinMetodos {
    public static void main (String arg[])
    {
    	// Declaración de variables para almacenar los lados de la cancha y hacer el cálculo
        String cadena;
        double ladoA;
        double ladoB;
        double resultado;

        // Aquí le pedimos los datos al usuario y los guardamos en las variables
        cadena = JOptionPane.showInputDialog (null, "Ingrese la longitud del lado a: ");
        ladoA = Double.parseDouble ( cadena );

        cadena = JOptionPane.showInputDialog (null, "Ingrese la longitud del lado b: ");
        ladoB = Double.parseDouble ( cadena );

        // Aquí se hace el cálculo y se guarda el resultado en la variable del mismo nombre, luego se muestra al usuario
        resultado = ladoA * ladoB;
        JOptionPane.showMessageDialog ( null, "El resultado es: " + resultado );
    }
}

