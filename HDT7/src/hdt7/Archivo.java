/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt7;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author jsken
 */
public class Archivo {
    
    public ArrayList<String> leerlineas() throws IOException, FileNotFoundException{
        // pedir al usuario que ingrese la dirección del archivo
        System.out.println("Ingrese la dirección del archivo");
        String ruta = System.console().readLine();
        ArrayList<String> lineas = new ArrayList<String>();
        // leer el archivo
        try{
        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr);
        
        // leer linea por linea
        String linea = br.readLine();
        while(linea != null){
            System.out.println(linea);
            linea = br.readLine();

            lineas.add(linea);
            
        }
        
        // cerrar el archivo
        br.close();
        fr.close();
        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
        }catch(IOException e){
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
