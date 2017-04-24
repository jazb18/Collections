
package uni.entity;

public class Empleado {
 // campos
    private String idempleado;
    private String nombre;
    private double sueldo;
    private double descuento;
    private double neto;

    // contructor
    public Empleado() {
    }

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // metodos get y set
    public String getIdempleado() {
        return idempleado;
    }

     public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
    
}
