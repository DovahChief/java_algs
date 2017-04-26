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
    int m_key;
    String m_nombre;
    
    //cada nodo contiene a sus hijos (en c++ son apuntadores,,,
    // ... revisar bien aqui como esta generado
    
    Nodo hijo_der;
    Nodo hijo_izq;
    
    //ctor 
    Nodo(int _key, String _nombre){
        this.m_key = _key;
        this.m_nombre = _nombre;
    }
    
    //a cadena imprime info del nodo
    @Override
    public String toString(){
        return (m_nombre + " tiene llave " + m_key) ; 
    }
    
    public boolean tiene_hijos(){
        return (this.hijo_der != null && this.hijo_der != null);
    }
}
