package com.corenetworks.Presentacion;

import java.io.FileWriter;
import java.io.IOException;

public class PruebaFicheroCaracteres {
    public static void main(String[] args) {
        //en presentacion se usa try catch en modelo o persistencia usamos propagacion
        //usamos el try con recurso para no tener que cerrar el flujo
        try(FileWriter f1=new FileWriter("salida1.txt" );) {
            f1.write("Buen inicio de semana!!");
            f1.flush();
        } catch (IOException e) {
            System.out.println(e.toString());;
        }

    }
}
