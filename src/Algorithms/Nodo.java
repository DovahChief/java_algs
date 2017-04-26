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
public class Nodo {
    //identificadores del nodo
    int key;
    String nombre;
    
    //cada nodo contiene a sus hijos (en c++ son apuntadores,,,
    // ... revisar bien aqui como esta generado
    
    Nodo hijo_der;
    Nodo hijo_izq;
    
    //ctor 
    Nodo(int _key, String _nombre){
        this.key = _key;
        this.nombre = _nombre;
    }
    
    //a cadena imprime info del nodo
    @Override
    public String toString(){
        return (nombre + " tiene llave " + key) ; 
    }
    
    public boolean tiene_hijos(){
        return (this.hijo_der != null && this.hijo_der != null);
    }
}
