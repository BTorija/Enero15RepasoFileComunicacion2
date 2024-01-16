package com.corenetworks.ClienteServidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteSencillo {
    public static void main(String[] args) {
        String articulo= "pera";
        int cantidad=5;
        try (Socket peticion = new Socket("localhost",9999);
             PrintWriter sSalida = new PrintWriter(peticion.getOutputStream(),true);){



            sSalida.printf("%10s%d %n",articulo,cantidad);

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
