package edu.ifrs.demo.client;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven
public class MDB implements MessageListener{

  @Override
  public void onMessage(Message arg0) {
    System.out.println("Hello MDB");
    System.out.println("Message: " + arg0.toString());
    
  }
  
}
