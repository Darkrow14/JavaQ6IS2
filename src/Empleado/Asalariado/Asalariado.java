package Empleado.Asalariado;
import Empleado.Empleado;

public class Asalariado extends Empleado{

    private double salarioSemanal;

    public Asalariado(String nombre, String apellido,
    String ssn, double salSemanal){
        super(nombre, apellido, ssn);
        establecerSalarioSemanal(salSemanal);
    }

    public void establecerSalarioSemanal(double salario) {
        salarioSemanal = salario < 0.0 ? 0.0 : salario;
    }

    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    public double ingresos(){

        return obtenerSalarioSemanal();
    }

    public String toString(){
        return "\nempleado asalariado: "
                + obtenerPrimerNombre()
                + " " + obtenerApellidoPaterno()
                + "\nnúmero de seguro social: "
                + obtenerNumeroSeguroSocial();
    }

    public String getTipo(){
        return "Empleado Asalariado";
    }

    public String process(){
        String salida = "";
        salida += toString();
        salida += "\nganó $" +ingresos() + "\n";
        return salida;
    }
    
}
