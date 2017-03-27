
package Ejercicio2;


public class Main {
    public static void main(String[] args) {
        java.util.Scanner lectura= new java.util.Scanner(System.in);
        double[]k= new double[4];
        System.out.println("Materia cursada");
        String materia= lectura.next();
        System.out.println("Notas obtenidas");
        k[0]= lectura.nextInt();
        k[1]= lectura.nextInt();
        k[2]= lectura.nextInt();
        k[3]= lectura.nextInt();
        
        System.out.println("Profesor");
        System.out.println("Nombre: ");
        String nombre_prof= lectura.next();
        System.out.println("Edad: ");
        int edad_prof= lectura.nextInt();
        System.out.println("Direccion: ");
        String direccion_prof= lectura.next();
        System.out.println("Telefono: ");
        int telefono_prof=lectura.nextInt();
        
        System.out.println("Nombre del estudiante");
        String nombre= lectura.next();
        System.out.println("Edad del estudiante");
        int edad= lectura.nextInt();
        System.out.println("Direccion del estudiante");
        String direccion= lectura.next();
        System.out.println("Telefono estudiante");
        int telefono= lectura.nextInt();
        
        Profesor profe= new Profesor(nombre_prof, edad_prof, direccion_prof, telefono_prof);
        Estudiante est= new Estudiante(materia, k, profe, nombre, edad, direccion, telefono);
        est.imprimirpromedio();
        
    }
    
}
