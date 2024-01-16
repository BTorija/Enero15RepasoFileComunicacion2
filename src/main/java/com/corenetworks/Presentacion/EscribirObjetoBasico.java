package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Pedido;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirObjetoBasico {
    public static void main(String[] args) {
        //Instanciar tres pedidos
        Pedido p1 = new Pedido(1, "Juan Lopez", 1000, "CR");
        Pedido p2 = new Pedido(2, "Ana Flores", 500, "M");
        Pedido p3 = new Pedido(3, "Luis Ramirez", 200, "M");

        try (FileOutputStream f1 = new FileOutputStream("pedidos.dat");
             ObjectOutputStream o1 = new ObjectOutputStream(f1);
             ObjectOutputStream o2 = new ObjectOutputStream(new FileOutputStream("pedidos2.dat"))) {
            o1.writeObject(p1);
            o1.writeObject(p2);
            o1.writeObject(p3);
            o1.flush();

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
