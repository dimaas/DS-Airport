/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validator;

/**
 *
 * @author M
 */
public class InvalidAttributeException extends Exception {
    
    public InvalidAttributeException(){
        super();
    }
    
    public InvalidAttributeException(String message){
        super(message);
    }
}
