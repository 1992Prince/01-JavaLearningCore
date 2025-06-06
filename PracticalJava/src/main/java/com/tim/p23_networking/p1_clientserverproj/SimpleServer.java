package com.tim.p23_networking.p1_clientserverproj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) {


        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            try (Socket socket = serverSocket.accept()) {
                System.out.println("Server accepts client connection");
                // since connection is done, read info from client
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                while(true){
                    String echoString = input.readLine();
                    System.out.println("Server got req data: " + echoString);
                    if(echoString.equals("exit")){
                        break;
                    }
                    output.println("Echo from server: " + echoString);
                }
            }
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
        }
    }


}
