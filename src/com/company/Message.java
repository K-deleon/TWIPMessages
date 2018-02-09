package com.company;

/**
 * Created by KiaraDeleon on 2/8/2018.
 */


import java.time.Clock;
import java.util.ArrayList;

public class Message {

    public String contactName;
    public String contactNumber;
    public String contactText;
    public Clock timeReceived;

    public ArrayList convo = new ArrayList();
    public ArrayList convo2 = new ArrayList();

    public Message(){

    }

    public void contactInfo(String name, String num){
        contactName = name;
        contactNumber = num;
    }

    public String messageInfo(String m){
        contactText = m;
        timeReceived = Clock.systemDefaultZone();
        String mess = timeReceived + ": " + m;
        convo.add(0, mess);

        return mess;
    }

    public void removeMess(int i){
        convo.remove(i);
    }

    public void switchMess(String m){
        int ind = convo.indexOf(m);
        String mov = convo.get(ind).toString();
        convo2.add(0, mov);
    }

}
