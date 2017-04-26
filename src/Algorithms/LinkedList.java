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
public class LinkedList {
    //ultimo elemento
    public Link m_primer_lnk;

    //constructor que no hace absolutamente nadaaaaaa
    public LinkedList() {
        m_primer_lnk = null;
    }
    
    //checa si esta vacia
    public boolean es_vacio(){
        return (m_primer_lnk == null);
    }
    
    //insertar elemento en lista
    public void insert(String _nom, int _cant){
        Link nuevo = new Link(_nom, _cant);
        nuevo.siguiente = m_primer_lnk;
        m_primer_lnk = nuevo;
    }
    
    //eliminar el ultimo
    public void elimina(){
        Link lref = m_primer_lnk;
        if(!es_vacio())
            m_primer_lnk = m_primer_lnk.siguiente;
        else
            System.out.println("Lista Vacia");
    }
    
    //recorrer lista
    public void recorre() {
        Link l = m_primer_lnk;
        while (l != null) {            
            l.display();
            System.out.println("link siguiente  : "+ l.siguiente);
            l = l.siguiente;
            System.out.println();
        }
    }
    
    //recorrer busca
    public void find(String _sf) {
        Link l = m_primer_lnk;
        if(!es_vacio()){
            while(!l.m_nombre.equals(_sf)){
                if(l.siguiente == null) return;         
                l= l.siguiente;
            }
        }else 
            System.out.println("Lista vacia");
        System.out.println("encontrado -> "+ l.m_nombre + "  : "+l.m_cantidad);
    }
}
