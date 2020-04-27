/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.message.factory.impl;

import domain.message.Message;
import domain.message.factory.MessageCreator;
import domain.message.impl.TextMessage;

/**
 *
 * @author urosv
 */
public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new TextMessage(); 
    }
    
}
