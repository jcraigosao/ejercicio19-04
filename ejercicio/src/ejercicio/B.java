
package ejercicio;

public class B extends A{
    
        public B(){
        System.out.println("Estoy en B...");
    }
    @Override
    public void f(int b) {
        System.out.println("En B: "+ b);
    
        }
}
