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
            System.out.println("3. Translate from a sentence to another language");
            System.out.println("4. delete a node");
            System.out.println("5. modify a node");
            System.out.println("6. print trees inorder");
            System.out.println("7. exit");
            int opcion = Integer.parseInt(br.readLine());

            switch(opcion){
                case 1 :
                    System.out.println("English");
                    System.out.println("Enter the word you want to translate");
                    String palabra = br.readLine();
                    String result = op.getEnglishTree().search(palabra);
                    if (result == null){
                        System.out.println("The word doesn't exist");
                        System.out.println("Do you want to add it? (y/n)");
                        String respuesta = br.readLine();
                        if (respuesta.equals("y")){
                            System.out.println("Enter the translation");
                            String traduccion = br.readLine();
                            op.getEnglishTree().insert(palabra, traduccion);
                            System.out.println("The word has been added");
                        }
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
                    if (result2 == null){
                        System.out.println("The word doesn't exist");
                        System.out.println("Do you want to add it? (y/n)");
                        String respuesta2 = br.readLine();
                        if (respuesta2.equals("y")){
                            System.out.println("Enter the translation");
                            String traduccion2 = br.readLine();
                            op.getFrenchTree().insert(palabra2, traduccion2);
                            System.out.println("The word has been added");
                        }
                    }
                    else{
                        System.out.println(result2);
                    }
                    break;
                case 3 :
                  System.out.println("Ingrese el nombre del archivo a buscar");
                  Archivo archivo = new Archivo();
                    String nombreArchivo = br.readLine();
                    ArrayList<String> sentence = archivo.readFile(nombreArchivo);
                    ArrayList<String> traduccion = new ArrayList<String>();

                    //separate the sentence into words and then set lower case every word
                    for (int i = 0; i < sentence.size(); i++){
                        String[] words = sentence.get(i).split(" ");
                        for (int j = 0; j < words.length; j++){
                            words[j] = words[j].toLowerCase();
                            traduccion.add(words[i]);
                        }
                    }
                    int  existe = 0;


                    //search in the trees if the words in tradiccion exists and breaks the loop if it finds a match with one of them 
                    for (int i = 0; i < traduccion.size(); i++){
                        String resultado = op.getEnglishTree().search(traduccion.get(i));
                        String resultado2 = op.getFrenchTree().search(traduccion.get(i));
                        if (resultado != null){
                             existe = 1 ;
                             break;
                        }
                        else if (resultado2 != null){
                             existe = 2 ;
                             break;
                        }
                        else{
                            existe = 0;
                            
                        }
                    }
                    
                    String total = "";
                    if (existe == 1){
                        for (int i = 0; i < traduccion.size(); i++){
                            total = total + " " + op.getEnglishTree().search(traduccion.get(i));
                        }
                    }
                    else if (existe == 2){
                        for (int i = 0; i < traduccion.size(); i++){
                            total = total + " " + op.getFrenchTree().search(traduccion.get(i));
                        }
                    }
                    else{
                            System.out.println("the words of the sentences doesn't exist");
                    }
                    
                    System.out.println(total);



                    break;
                case 4 :
                System.out.println("select the language you want to delete");
                System.out.println("1. English");
                System.out.println("2. French");
                int opcion2 = Integer.parseInt(br.readLine());
                switch(opcion2){
                    case 1 :
                        System.out.println("English");
                        System.out.println("Enter the word you want to delete");
                        String palabra3 = br.readLine();
                        op.getEnglishTree().delete(palabra3);
                        break;
                    case 2 :
                        System.out.println("French");
                        System.out.println("Enter the word you want to delete");
                        String palabra4 = br.readLine();
                        op.getFrenchTree().delete(palabra4);
                        break;
                }
                break;
                    
                case 5 :
                    //delete and adds a new node 
                    System.out.println("select the language you want to delete");
                    System.out.println("1. English");
                    System.out.println("2. French");
                    int opcion3 = Integer.parseInt(br.readLine());
                    switch(opcion3){
                        case 1 :
                            System.out.println("English");
                            System.out.println("Enter the word you want to modify");
                            String palabra5 = br.readLine();
                            System.out.println("put the new translation for the word");
                            String palabra6 = br.readLine();
                            op.getEnglishTree().delete(palabra5);
                            op.getEnglishTree().insert(palabra5, palabra6);
                            break;
                        case 2 :
                            System.out.println("French");
                            System.out.println("Enter the word you want to modify");
                            String palabra7 = br.readLine();
                            System.out.println("put the new translation for the word");
                            String palabra8 = br.readLine();
                            op.getFrenchTree().delete(palabra7);
                            op.getFrenchTree().insert(palabra7, palabra8);
                    }
                    break;
                case 6 :
                    System.out.println("select the language you want to see");
                    System.out.println("1. English");
                    System.out.println("2. French");
                    int opcion4 = Integer.parseInt(br.readLine());
                    switch(opcion4){
                        case 1 :
                            System.out.println("English");
                            op.getEnglishTree().printTree();
                        break;
                        case 2 :
                            System.out.println("French");
                            op.getFrenchTree().printTree();
                        break;
                    }
                    break;
                    
                case 7 :
                    System.out.println("closing the program...");
                    salir = true;
                    break;
                    
            }

        }while (!salir);





        



    }
    
}
