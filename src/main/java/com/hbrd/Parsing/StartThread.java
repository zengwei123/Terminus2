package com.hbrd.Parsing;

import java.net.ServerSocket;
import java.net.Socket;

public class StartThread extends Thread {
    public void run() {
        try {
            ServerSocket  ss =new  ServerSocket(8082);
            while(true) {
               Socket  s=ss.accept();
               new TerminusMessage(s);
            }
        }catch( Exception ex ) {
            ex.printStackTrace();
        }
    }
}


