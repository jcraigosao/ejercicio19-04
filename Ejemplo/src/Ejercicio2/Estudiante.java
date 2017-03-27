
package Ejercicio2;

public class Estudiante extends Persona {
    private String materia;
    private double[] notas;
    private Profesor profe;

    public Estudiante(String materia, double[] notas, Profesor profe, String nombre, int edad, String direccion, int telefono) {
        super(nombre, edad, direccion, telefono);
        this.materia = materia;
        this.notas = notas;
        this.profe = profe;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }
    public double imprimirpromedio(){
        double m=0;
        for(int i=0; i<4; i++){
            m+= notas[i];
        }
        System.out.println(m/4);
        return m/4;
    }
    public void impromirmateria(){
        System.out.println(materia);
    }
    
    public void imprimirprofe(){
        System.out.println(profe.nombre);
    } 
    
}
