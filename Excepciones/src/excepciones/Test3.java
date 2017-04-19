
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
        public Test3(){
        divideByZero();
    }
      double divideByZero(){
        Scanner read= new Scanner(System.in);
        double result= 0, number=0;
        try{
            System.out.println("Please enter other number");
            number=read.nextDouble();
            result=25/number;
        }catch(ArithmeticException exception){
            System.out.println("Usted no puede dividir entre 0");
        }
        catch(InputMismatchException exception){
            System.out.println("Input error, usted debe ingresar un numero");
        }
      return result;
    }
      public static void main(String[] args) {
         new Test3();
    }
}
