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
        
    }
    
    public void encrypt(){
        
    }
    
}
