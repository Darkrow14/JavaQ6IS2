package Empleado.Comision;
import Empleado.Empleado;

public class Comision extends Empleado{

    private double ventasTotales; // ventas totales por semana
    private double tasaComision;

    public Comision(String nombre, String apellido,
    String ssn, double ventasTotales, double tasaComision){
        super(nombre, apellido, ssn);
        establecerVentasTotales(ventasTotales);
        establecerTasaComision(tasaComision);
    }

    public void establecerTasaComision(double tasa) {
        tasaComision = (tasa > 0.0 && tasa < 1.0) ? tasa : 0.0;
    }

    public double obtenerTasaComision() {
        return tasaComision;
    }

    public void establecerVentasTotales(double ventas) {
        ventasTotales = ventas < 0.0 ? 0.0 : ventas;
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public double ingresos(){
        return obtenerTasaComision() * obtenerVentasTotales();
    }

    public String toString(){
        return "\nempleado por comisión: "
                + obtenerPrimerNombre() + " "
                + obtenerApellidoPaterno()
                + "\nnúmero de seguro social: "
                + obtenerNumeroSeguroSocial();
    }

    public String getTipo(){
        return "Empleado por Comision";
    }

    public String process(){
        String salida = "";
        salida += toString();
        salida += "\nganó $" +ingresos() + "\n";
        return salida;
    }
    
}
