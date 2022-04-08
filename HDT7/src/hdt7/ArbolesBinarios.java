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
    /**
     *
     * @param key
     * @param value
     */
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
        return null;
    }

    // delete a node from the binary tree

    public void delete(k key) {
        Nodo focusNode = root;
        Nodo parent = root;
        boolean isLeftChild = true;
        while (focusNode.key != key) {
            parent = focusNode;
            if (((String) key ).compareTo((String)focusNode.key) < 0) {
                isLeftChild = true;
                focusNode = focusNode.left;
            } else {
                isLeftChild = false;
                focusNode = focusNode.right;
            }
            if (focusNode == null) {
                return;
            }
        }
        if (focusNode.left == null && focusNode.right == null) {
            if (focusNode == root) {
                root = null;
            }
            if (isLeftChild == true) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (focusNode.right == null) {
            if (focusNode == root) {
                root = focusNode.left;
            } else if (isLeftChild) {
                parent.left = focusNode.left;
            } else {
                parent.right = focusNode.left;
            }
        } else if (focusNode.left == null) {
            if (focusNode == root) {
                root = focusNode.right;
            } else if (isLeftChild) {
                parent.left = focusNode.right;
            } else {
                parent.right = focusNode.right;
            }
        } else {
            Nodo replacement = getReplacementNode(focusNode);
            if (focusNode == root) {
                root = replacement;
            } else if (isLeftChild) {
                parent.left = replacement;
            } else {
                parent.right = replacement;
            }
            replacement.left = focusNode.left;
        }
    }

    //get the replacement node for the node to be deleted
    public Nodo getReplacementNode(Nodo replacedNode) {
        Nodo replacementParent = replacedNode;
        Nodo replacement = replacedNode;
        Nodo focusNode = replacedNode.right;
        while (focusNode != null) {
            replacementParent = replacement;
            replacement = focusNode;
            focusNode = focusNode.left;
        }
        if (replacement != replacedNode.right) {
            replacementParent.left = replacement.right;
            replacement.right = replacedNode.right;
        }
        return replacement;
    }

    // print the tree inorder
    public void printTree() {
        if (root == null) {
            System.out.println("Tree is empty");
        } else {
            printTree(root);
        }
    }

    public void printTree(Nodo focusNode) {
        if (focusNode != null) {
            printTree(focusNode.left);
            System.out.println(focusNode.key + " " + focusNode.value);
            printTree(focusNode.right);
        }
    }

    
}
