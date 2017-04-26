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
public class Link {
    //variables genericas de ejemplo sobre lo que contiene cada elemento de la lista    
    public String m_nombre;
    public int m_cantidad;
    
    //necesario que se contenga el link al siguiente elemento
    
    public Link siguiente;

    //constructor
    public Link(String _nom, int _cant) {
        m_nombre = _nom;
        m_cantidad = _cant;
        
    }
    //muestra cadena con informacion    
    public String to_String(){
        return (m_nombre + " cantidad = " + m_cantidad);
    }
    
    //imprime contenido
    public void display(){
        System.out.println("link ("+m_nombre+" , "+m_cantidad+")");
    }
}
