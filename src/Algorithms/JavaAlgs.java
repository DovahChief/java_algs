/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/**
 *
 * @author jose
 */
public class JavaAlgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creando lista
        LinkedList lista = new LinkedList();
        //creando lista doblemente ligada
        DLinkList lista_2 = new DLinkList();
        //creando arbol ver doc en BinTree.java
        BinTree arbol_bin = new BinTree();
        
        
        
        //pruebas de lista ligada
        lista.insert("cien anios de soledad", 0);
        lista.insert("Java How to Program", 2);
        lista.insert("C++ Primer Plus", 10);
        
        lista.recorre();
        lista.find("C++ Primer Plus");
        //fin de pruebas de lista ligada
        
        
        //pruebas de lista doblemente ligada
        
        //fin de pruebas de lista doblemente ligada
        
        //pruebas de arbol binario
        arbol_bin.agrega_nodo(117, "Master Chief");
        arbol_bin.agrega_nodo(50, "Big Boss");
        arbol_bin.agrega_nodo(17, "Solid Snake");
        arbol_bin.agrega_nodo(30, "Commander Shepard");
        arbol_bin.agrega_nodo(120, "Dovahkiin");
        arbol_bin.agrega_nodo(4, "Arbiter");
        arbol_bin.agrega_nodo(300, "Noble Six");
        
        System.out.println("---------------------------------");
        arbol_bin.rec_inorden(arbol_bin.m_raiz);
        System.out.println("---------------------------------");
        
        System.out.println("---------------------------------");
        System.out.println("Busqueda binaria (11): "+arbol_bin.bin_search(11));
        System.out.println("Busqueda binaria (30): "+arbol_bin.bin_search(30));
        System.out.println("---------------------------------");
        
        arbol_bin.remueve(30);
        
        System.out.println("\tBorrando el elemento (30)");
        
        System.out.println("---------------------------------");
        System.out.println("Busqueda binaria (11): "+arbol_bin.bin_search(11));
        System.out.println("Busqueda binaria (30): "+arbol_bin.bin_search(30));
        System.out.println("---------------------------------");
        //fin pruebas de arbol
        
        
        
    }
    
}
