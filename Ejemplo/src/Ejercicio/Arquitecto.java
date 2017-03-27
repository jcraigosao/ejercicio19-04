
package Ejercicio;

public class Arquitecto extends Empleado{
   private int N_proyectos ;

    public Arquitecto(int N_proyectos, String nombre, int identificacion, int edad, String E_civil, double salario) {
        super(nombre, identificacion, edad, E_civil, salario);
        this.N_proyectos = N_proyectos;
    }

    public int getN_proyectos() {
        return N_proyectos;
    }

    public void setN_proyectos(int N_proyectos) {
        this.N_proyectos = N_proyectos;
    }

    @Override
    public String toString() {
        return "Arquitecto{" + "N_proyectos=" + N_proyectos + '}'+ super.toString();
    }

    
   
   
}
