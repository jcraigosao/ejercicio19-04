/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresas {
    private ArrayList <Empleado> empleados;

    public Empresas() {
        this.empleados = new ArrayList<>();
    }
    public void adicionarempleado(Empleado empleado){
        this.empleados.add(empleado);
    }
    public void imprimirEmpleado(){
        for( Empleado empleado: empleados){
        System.out.println(empleado);
    }
    }
    
}
