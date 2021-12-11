package Empleado.BaseComision;
import Empleado.Comision.Comision;

public class BaseComision extends Comision{

    private double salarioBase;

    public BaseComision(String nombre, String apellido,
    String ssn, double salarioBase, double ventasTotales, double tasaComision){
        super(nombre, apellido, ssn, ventasTotales, tasaComision);
        establecerSalarioBase(salarioBase);
    }

    public void establecerSalarioBase(double salario) {
        salarioBase = salario < 0.0 ? 0.0 : salario;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    public double ingresos(){
        return obtenerSalarioBase() + obtenerTasaComision() * obtenerVentasTotales();
    }

    public String toString(){
        return  "\nempleado con salario base más comisión: "
                + obtenerPrimerNombre()
                + " " + obtenerApellidoPaterno()
                + "\nnúmero de seguro social: "
                + obtenerNumeroSeguroSocial();
    }

    public String getTipo(){
        return "Empleado Base mas Comision";
    }

    public String process(){
        String salida = "";
        salida += toString();
        // determinar si el elemento es un EmpleadoBaseMasComision
        double salarioBaseAnterior = obtenerSalarioBase();
        salida += "\nsalario base anterior: $" + salarioBaseAnterior;

        establecerSalarioBase(1.10 * salarioBaseAnterior);
        salida += "\nel nuevo salario base con aumento del 10% es: $" +
                obtenerSalarioBase();
        salida += "\nganó $" +ingresos() + "\n";
        return salida;
    }
    
}
