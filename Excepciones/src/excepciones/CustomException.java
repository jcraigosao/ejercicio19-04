/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Estudiante
 */
public class CustomException extends Exception {
    
//    public CustomException(String message){
  //      super(message);
    //}
    public CustomException(){
        super("Error personalizado");
    }
}
