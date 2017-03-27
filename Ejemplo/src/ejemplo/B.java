/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author Estudiante
 */
public class B extends A {
    private int b1;

    public B(int a, int b) {
        super(a);
        this.b1 = b;
    }

    public int getB() {
        return b1;
    }

    public void setB(int b) {
        this.b1 = b;
    }
    
    
}
