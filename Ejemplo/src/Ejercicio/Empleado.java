
package Ejercicio;

public class Empleado {
    protected String nombre;
    protected int identificacion;
    protected int edad;
    protected String E_civil;
    protected double salario;

    public Empleado(String nombre, int identificacion, int edad, String E_civil, double salario) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.E_civil = E_civil;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getE_civil() {
        return E_civil;
    }

    public void setE_civil(String E_civil) {
        this.E_civil = E_civil;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", edad=" + edad + ", E_civil=" + E_civil + ", salario=" + salario + '}';
    }
    
    
}
