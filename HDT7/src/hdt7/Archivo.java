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




    

    //create a method that reads a file line by line given the file name 
    
    public ArrayList<String> readFile(String nameFile) throws IOException, FileNotFoundException{

        ArrayList<String> lineas = new ArrayList<String>();
        // leer el archivo
        String nombreArchivo = nameFile+".txt";
        try{
        FileReader fr = new FileReader(nombreArchivo);
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



   


   
}
