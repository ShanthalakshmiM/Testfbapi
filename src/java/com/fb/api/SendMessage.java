/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fb.api;


import com.restfb.DefaultFacebookClient;
import com.restfb.DefaultJsonMapper;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.types.GraphResponse;

import com.restfb.types.send.IdMessageRecipient;
import com.restfb.types.send.Message;
import com.restfb.types.webhook.WebhookEntry;
import com.restfb.types.webhook.WebhookObject;
import com.restfb.types.webhook.messaging.MessagingItem;


/**
 *
 * @author HP
 */
public class SendMessage {
    public static void sendMsg(String message){
        //IdMessageRecipient recipient = new IdMessageRecipient(Activities.recipient_id);
        //Message msg =new Message("Hi Subi");
        //Activities.fbClient.publish("me/messages", GraphResponse.class, Parameter.with("recipient", recipient),Parameter.with("message", msg));
     
    }
}