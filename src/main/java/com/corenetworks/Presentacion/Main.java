package com.corenetworks.Presentacion;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f1=new File("archivo_ejemplo2.txt");
        System.out.println("Nombre del archivo-->"+ f1.getName());
        System.out.println("Ruta absoluta--> " +f1.getAbsolutePath());
        System.out.println("Es una carpeta?" +f1.isDirectory());
        System.out.println("Es un fichero? "+ f1.isFile());
        System.out.println("Ultima modificacion-->" + f1.lastModified());
        System.out.println("Existe?" +f1.exists());

        //crear una carpeta
        File f2 = new File("documentos");
        //Si no existe lo crea en el directorio !f2.exist
        if (!f2.exists()){
            System.out.println(f2.mkdir());
        }
        System.out.println("Nombre de la carpeta->"+f2.getName());
        System.out.println("Ruta absoluta" +f2.getAbsolutePath());
        System.out.println("Es un directorio " +f2.isDirectory());
        System.out.println("Es un fichero? "+ f2.isFile());
        System.out.println("Existe? "+f2.exists());
    }
}