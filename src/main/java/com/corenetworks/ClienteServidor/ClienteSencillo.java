package com.corenetworks.presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteSencillo {
    public static void main(String[] args) {
        try (Socket peticion = new Socket("localhost",3000);
             PrintWriter sSalida = new PrintWriter(peticion.getOutputStream(),true);){

            sSalida.println("Hola Mundo!!");
            try( BufferedReader bf = new BufferedReader(new InputStreamReader(peticion.getInputStream()));){
                System.out.println(bf.readLine());
            }

        } catch (UnknownHostException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
