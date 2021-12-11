package Empleado.Horas;
import Empleado.Empleado;

public class Horas extends Empleado{

    private double sueldo; // sueldo por hora
    private double horas;

    public Horas(String nombre, String apellido,
    String ssn, double sueldo, double horas){
        super(nombre, apellido, ssn);
        establecerSueldo( sueldo);
        establecerHoras( horas);
    }

    public void establecerSueldo(double cantidadSueldo) {
        sueldo = cantidadSueldo < 0.0 ? 0.0 : cantidadSueldo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerHoras(double horasTrabajadas) {
        horas = (horasTrabajadas >= 0.0 && horasTrabajadas <= 168.0) 
        ? horasTrabajadas : 0.0;
    }

    public double obtenerHoras() {
        return horas;
    }

    public double ingresos(){
        if (horas <= 40) // sin tiempo extra
            return sueldo * horas;
        else
            return 40 * sueldo + (horas - 40) * sueldo * 1.5;
    }

    public String toString(){
        return "\nempleado por horas: "
                + obtenerPrimerNombre()
                + " " + obtenerApellidoPaterno()
                + "\nnúmero de seguro social: "
                + obtenerNumeroSeguroSocial();
    }

    public String getTipo(){
        return "Empleado por Horas";
    }
    
    public String process(){
        String salida = "";
        salida += toString();
        salida += "\nganó $" +ingresos() + "\n";
        return salida;
    }
}
