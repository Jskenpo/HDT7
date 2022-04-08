/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jsken
 */
public class Operaciones {
    Archivo read = new Archivo();
    ArrayList<String> lineas = new ArrayList<String>();

    public void settingUp() throws IOException, FileNotFoundException {
        ArrayList <String> Datos = new ArrayList<>();
        try {
            Datos = read.leerlineas();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int i = 0; i < Datos.size(); i++) {
            String[] palabras = Datos.get(i).split(",");
            for (int j = 0; j < palabras.length; j++) {
                palabras[j] = palabras[j].toLowerCase();
                lineas.add(palabras[j]);
            }
        }
    }

    
    

}
