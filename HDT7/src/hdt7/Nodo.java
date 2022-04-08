/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt7;

/**
 *
 * @author jsken
 */
public class Nodo<K,V> {
    Nodo Root;
    K key;
    V value;
    Nodo left;
    Nodo right;

    //constructor de nodo
    public Nodo(K key, V value) {
        this.key = key;
        right = null;
        left = null;
        value = null;
    }
}
