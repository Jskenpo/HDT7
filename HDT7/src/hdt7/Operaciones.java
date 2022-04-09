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
    ArbolesBinarios<String, String> EnglishTree = new ArbolesBinarios<String, String>();
    ArbolesBinarios<String, String> FrenchTree = new ArbolesBinarios<String, String>();

    //getters of the trees
    public ArbolesBinarios<String, String> getEnglishTree() {
        return EnglishTree;
    }

    public ArbolesBinarios<String, String> getFrenchTree() {
        return FrenchTree;
    }

    
    

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
            if (Datos.get(i) != null) {
                String[] palabras = Datos.get(i).split(",");
                for (int j = 0; j < palabras.length; j++) {
                    palabras[j] = palabras[j].toLowerCase();
                    lineas.add(palabras[j]);
                }
            }
                
            }
        }
    

    public void treeCreation(){

    ArrayList<String> EnglishArray = new ArrayList<String>();
    ArrayList<String> SpanishArray = new ArrayList<String>();
    ArrayList<String> FrenchArray = new ArrayList<String>(); 

    for (int i = 0 ; i < lineas.size() ; i++){
        EnglishArray.add(lineas.get(i));
        i = i+1;
        SpanishArray.add(lineas.get(i));
        i = i+1;
        FrenchArray.add(lineas.get(i));

    }
    // create binary tree with English words

    for (int k = 0 ; k < EnglishArray.size() ; k++){
        EnglishTree.insert(EnglishArray.get(k), SpanishArray.get(k));
    }

    // crear arbol binario con palabras en frances 
    for (int k = 0 ; k < FrenchArray.size() ; k++){
        FrenchTree.insert(FrenchArray.get(k), SpanishArray.get(k));
    }

    // print both trees
    System.out.println("English Tree");
    EnglishTree.printTree();
    System.out.println("French Tree");
    FrenchTree.printTree();

    }


    
    

}
