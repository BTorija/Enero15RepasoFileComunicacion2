package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Pedido;

import java.io.*;

public class LeerObjetoBasico {
    public static void main(String[] args) {
        Pedido p1 = null;
        try (FileInputStream f1= new FileInputStream("pedidos.dat");
             ObjectInputStream o1 = new ObjectInputStream(f1);
             ObjectInputStream o2= new ObjectInputStream(new FileInputStream("pedidos2.dat")))
        {
            while (true){
                p1=(Pedido) o1.readObject();
                if(p1==null){
                    break;
                }
                System.out.println(p1.toString());

            }
        } catch (IOException e) {
            System.out.println(e.toString());;
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());;
        }
    }
}
