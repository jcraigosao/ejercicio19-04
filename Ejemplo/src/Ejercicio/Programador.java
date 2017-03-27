
package Ejercicio;

public class Programador extends Empleado{
    private int N_lineas;
    private String lenguaje;

    public Programador(int N_lineas, String lenguaje, String nombre, int identificacion, int edad, String E_civil, double salario) {
        super(nombre, identificacion, edad, E_civil, salario);
        this.N_lineas = N_lineas;
        this.lenguaje = lenguaje;
    }

    public int getN_lineas() {
        return N_lineas;
    }

    public void setN_lineas(int N_lineas) {
        this.N_lineas = N_lineas;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Programador{" + "N_lineas=" + N_lineas + ", lenguaje=" + lenguaje + '}'+ super.toString();
    }
    
    
}
