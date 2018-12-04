package com.example.soninait.mykotlinapp;

import android.util.Log;
import java.net.*;
import java.io.*;

public class SocketMessage extends Thread {
    private ServerSocket serverSocket;

    public SocketMessage(int port) throws IOException {
        Log.e("**Message","1");
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(100000);
        Log.e("**Message","2");
    }

    public void run() {
        while(true) {
            try {
                Log.i("**Message","Waiting for client on port " +
                        serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();

                System.out.println("Just connected to " + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());

                Log.i("**Message",in.readUTF());

                server.close();

            } catch (SocketTimeoutException s) {
                System.out.println("Socket timed out!");
                Log.e("**Message","Socket timed out!");
                break;
            } catch (IOException e) {
                e.printStackTrace();
                Log.e("**Message",e.getMessage());
                break;
            }
        }
    }

}