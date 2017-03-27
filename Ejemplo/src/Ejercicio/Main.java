
package Ejercicio;

public class Main {
    public static void main(String[] args) {
        Empleado e1= new Empleado("fabian", 9546, 56, "Casado", 4580000 );
        Programador p1= new Programador(2, "Java", "Valeria", 123, 0, "Soltero", 0);
        Director d1= new Director(10, "pedro", 452,40,"dfghj",55);
        Empresas empresa= new Empresas();
        empresa.adicionarEmpleado(e1);
        empresa.adicionarEmpleado(p1);
        empresa.adicionarEmpleado(d1);
        empresa.adicionarEmpleados();
        
    }
}
