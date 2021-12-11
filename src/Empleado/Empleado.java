package Empleado;


public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    // constructor
    public Empleado(String nombre, String apellido,
            String ssn) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = ssn;
    }// fin de Empleado

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public String process(){
        return "";
    }

    public String getTipo(){
        return "";
    }
} // fin de la clase Empleado