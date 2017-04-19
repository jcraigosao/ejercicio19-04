
package excepciones;

import java.util.Scanner;

public class Test2 {
    public Test2(){
        divideByZero();
    }
    double divideByZero(){
        double result=0;
        int k=0;
       // try{
            result= 25/k;
        //}catch(ArithmeticException exception){
      //      System.out.println("Error aritmetico, no es posible dividir por 0");
       // }
        return result;
        }
  
    public static void main(String[] args) {
        new Test2();
    }
}
