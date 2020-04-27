/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.message.factory;

import domain.message.Message;

/**
 *
 * @author urosv
 */
public abstract class MessageCreator {
    
    public Message getMessage(){
        Message message = createMessage();
        
        message.addDefaultHeaders();
        message.encrypt();
        
        return message;
    }
    
    //Factory method
    public abstract Message createMessage();
}
