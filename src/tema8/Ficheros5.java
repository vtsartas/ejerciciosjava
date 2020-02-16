package tema8;

import java.io.File;

/* Uso de la librería File */

public class Ficheros5 {
    public static void main(String[] args) {
        String nomfichero="c:/prueba.txt";
        // Definimos un objeto del tipo 'File' con el nombre y ruta de fichero definido
        File fichero = new File(nomfichero);
        
        // creamos un fichero con esa ruta/nombre con createNewFile() , manejaremos excepciones
        System.out.println("Creando el fichero "+fichero.getAbsolutePath()+" ...");
        try {
            fichero.createNewFile();
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println("Fichero creado.");
        // métodos de File
        System.out.println("El fichero "+fichero.getName()+(fichero.exists()?" ":" no ")+"existe.");
        System.out.println("El fichero "+fichero.getName()+(fichero.canRead()?" ":" no ")+"es legible.");
        System.out.println("El fichero "+fichero.getName()+(fichero.canWrite()?" ":" no ")+"permite escritura.");
        
        System.out.println("Ruta completa de "+fichero.getName()+": "+fichero.getPath());
        System.out.println("Longitud del fichero: " + fichero.length() + " bytes");
        System.out.println("Borrando el fichero "+fichero.getAbsolutePath()+".");
        fichero.delete(); // borra ficheros, pero también carpetas !!
        System.out.println("Fichero borrado.");
        System.out.println("El fichero "+fichero.getName()+(fichero.exists()?" ":" no ")+"existe.");


    } //fin del main
    
} //fin de la clase principal
