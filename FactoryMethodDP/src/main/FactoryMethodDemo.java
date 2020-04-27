/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.message.Message;
import domain.message.factory.MessageCreator;
import domain.message.factory.impl.JSONMessageCreator;
import domain.message.factory.impl.TextMessageCreator;

/**
 *
 * @author urosv
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        Message message = new JSONMessageCreator().getMessage();
        System.out.println();
        message = new TextMessageCreator().getMessage();
    }

}
