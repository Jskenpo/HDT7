/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt7;

/**
 *
 * @author jsken
 */
public class ArbolesBinarios<k,V> {
    Nodo root;

    //constructor of the class 

    public ArbolesBinarios() {
        root = null;
    }


    //insert new node in a binary tree
    public void insert(k key, V value) {
        Nodo newNode = new Nodo(key);
        newNode.value = value;
        if (root == null) {
            root = newNode;
        } else {
            Nodo focusNode = root;
            Nodo parent;
            while (focusNode != null) {
                parent = focusNode;
                if (((String) key ).compareTo((String)focusNode.key) <= 0) {
                    focusNode = focusNode.left;
                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    //search a node in a binary tree with a given key 
    public V search(k key) {
        Nodo focusNode = root;
        while (focusNode.key != key) {
            if (((String) key ).compareTo((String)focusNode.key) < 0) {
                focusNode = focusNode.left;
            } else {
                focusNode = focusNode.right;
            }
            if (focusNode == null) {
                return null;
            }
        }
        return focusNode.value;
    }
    
}
