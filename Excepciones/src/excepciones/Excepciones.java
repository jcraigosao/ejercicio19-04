
package excepciones;

import java.util.Scanner;

public class Excepciones {

    public double dividirCero(int denominador) throws CustomException{
        double resultado=0; 
        if(denominador == 0)
            throw new CustomException();
        resultado= 25/denominador;
         return resultado;
    }
    public double dividir(int denominador) throws CustomException{
        return dividirCero(denominador);
    }
    public static void main(String[] args) throws CustomException {
    Excepciones excep= new Excepciones();
    int denominador=0;
    double resultado= 0;
    Scanner lectura= new Scanner(System.in);
    for(int i=0; i<5; i++){
        denominador= lectura.nextInt();
        
        resultado= excep.dividir(denominador);
        
        System.out.println(resultado);
    }
    }
    
}
