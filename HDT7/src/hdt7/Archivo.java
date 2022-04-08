/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt7;

import java.util.ArrayList;

/**
 *
 * @author jsken
 */
public class Archivo {
    //crear método que lea un archivo linea por linea y lo guarde en un arraylist

    public static ArrayList<String> leerArchivo(String ruta) {
        ArrayList<String> lineas = new ArrayList<>();
        try {
            java.io.FileReader fr = new java.io.FileReader(ruta);
            java.io.BufferedReader br = new java.io.BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        return lineas;
    }

    //crear método que pida escribir al usuario una linea en el archivo 
    public static void escribirArchivo(String ruta, String linea) {
        try {
            java.io.FileWriter fw = new java.io.FileWriter(ruta, true);
            java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
            bw.write(linea);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo");
        }
    }



   


   
}
