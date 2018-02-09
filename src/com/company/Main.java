package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
    System.out.print("To (Input name and number separated by a space): ");
    Scanner recipientInput = new Scanner(System.in);
    String recipient = recipientInput.next();
    String recipientNum = recipientInput.next();

    System.out.print("Message: ");
    Scanner messInput = new Scanner(System.in);
    String mess = messInput.nextLine();

    Message conv = new Message();
    conv.contactInfo(recipient, recipientNum);
    conv.messageInfo(mess);
    conv.removeMess(0);
    conv.switchMess(mess);

    }
}
