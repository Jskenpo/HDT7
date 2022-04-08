/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hdt7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author jsken
 */
public class HDT7 {

    /**
     * @param args the command line arguments
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Operaciones op = new Operaciones();
        op.settingUp();
        op.treeCreation();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //menu principal
        boolean salir = false;

        do{
            System.out.println("select the language you want to translate");
            System.out.println("1. English");
            System.out.println("2. French");
            System.out.println("3. Salir");
            int opcion = Integer.parseInt(br.readLine());

            switch(opcion){
                case 1 :
                    System.out.println("English");
                    System.out.println("Enter the word you want to translate");
                    String palabra = br.readLine();
                    String result = op.getEnglishTree().search(palabra);
                    if (result == null){
                        System.out.println("The word doesn't exist");
                    }
                    else{
                        System.out.println(result);
                    }
                    break;
                case 2 :
                    System.out.println("French");
                    System.out.println("Enter the word you want to translate");
                    String palabra2 = br.readLine();
                    String result2 = op.getFrenchTree().search(palabra2);
                    
                    break;
            }

        }while (!salir);





        



    }
    
}
