package com.corenetworks.presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSencillo {
    public static void main(String[] args) {
        BufferedReader bf;
        PrintWriter sRespuesta;
        try (ServerSocket servidor = new ServerSocket(3000);){
            while (true){
                System.out.println("En espera de peticiones ...");
                Socket s1 = servidor.accept();
                bf = new BufferedReader(new InputStreamReader(s1.getInputStream()));
                System.out.println(bf.readLine());
                sRespuesta = new PrintWriter(s1.getOutputStream(),true);
                sRespuesta.println("Se ha recibido su Hola mundo!!");

            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
