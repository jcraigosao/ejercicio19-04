
package ejercicio;

public class D extends C{
    
        public D(){
        System.out.println("Estoy en D...");
    }

    @Override
    public void f(int d) {
        System.out.println("En D: "+ d);
        super.f(d);
    }
    
}
