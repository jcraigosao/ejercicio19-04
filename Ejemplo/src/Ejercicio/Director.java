/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Estudiante
 */
public class Director extends Empleado{
    private int A_experiencia;

    public Director(int A_experiencia, String nombre, int identificacion, int edad, String E_civil, double salario) {
        super(nombre, identificacion, edad, E_civil, salario);
        this.A_experiencia = A_experiencia;
    }

    public int getA_experiencia() {
        return A_experiencia;
    }

    public void setA_experiencia(int A_experiencia) {
        this.A_experiencia = A_experiencia;
    }

    @Override
    public String toString() {
        return "Director{" + "A_experiencia=" + A_experiencia + '}'+ super.toString();
    }
    
    
}
