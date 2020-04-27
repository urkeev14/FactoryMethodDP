/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.message;

/**
 *
 * @author urosv
 */
public abstract class Message {
    
    public abstract String getContent();
    
    public void addDefaultHeaders(){
        System.out.println("Default header for " + this.getClass().getSimpleName());
    }
    
    public void encrypt(){
        System.out.println("Encription for the type of message " + this.getClass().getSimpleName());
    }
    
    
}
