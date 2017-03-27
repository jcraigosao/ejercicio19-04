
package ejemplo;

public class Ejemplo {

    public static void main(String[] args) {
       A a= new A(5);
       System.out.println(a.getA());
       
       B b= new B(10,5);
       System.out.println(b.getA()+" "+b.getB());
    }
    
}
