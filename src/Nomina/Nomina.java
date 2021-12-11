package Nomina;
// Programa de nómina
import javax.swing.JOptionPane;

import Empleado.Empleado;
import Empleado.Asalariado.Asalariado;
import Empleado.Comision.Comision;
import Empleado.BaseComision.BaseComision;
import Empleado.Horas.Horas;

public class Nomina {

    public static void main(String[] args) {
         

        // crear arreglo tipo Empleado
        Empleado empleados[] = new Empleado[4];

        // inicializar arreglo con Empleados

        empleados[0] = new Asalariado("Juan", "Pérez", "111-11-1111", 800.00);
        empleados[1] = new Comision("Arlae", "Razón","222-22-2222", 10000, .06);
        empleados[2] = new BaseComision("Alfonso", "Romero","333-33-3333",300, 5000, .04);
        empleados[3] = new Horas("Isabel", "Romero","444-44-4444", 16.75, 40);
        

        String salida = "";

        // procesar genéricamente cada elemento en el arreglo empleados
        for (int i = 0; i < empleados.length; i++) {
            salida += empleados[i].process();

        } // fin de instrucción for

        // obtener nombre del tipo de cada objeto en el arreglo empleados
        for (int j = 0; j < empleados.length; j++)
            salida += "\nEl empleado " + j + " es un " +
                    empleados[j].getTipo();

        JOptionPane.showMessageDialog(null, salida); // mostrar resultados
        System.exit(0);

    } // fin de main
} // fin de la clase Nomina