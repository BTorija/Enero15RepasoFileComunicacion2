package com.corenetworks.Presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
    public static void main(String[] args) {
        try(FileReader f1=new FileReader("salida1.txt");) {
            int letra=0;
            Character frase;
            while (true) {
                letra = f1.read();
                System.out.print((char)letra);
               if (letra==-1){
                  break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
