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
public class DLinkList {
    Dlink m_primer_link;
    Dlink m_ultimo_link;
    
    //inserta al comienzo
    public void ins_primera_pos(String _dat, int _num){
        Dlink nuevo = new Dlink(_dat, _num);
        
        if(es_vacio()) m_ultimo_link = nuevo;
        else           m_primer_link.anterior = nuevo;
        
        nuevo.siguiente = m_primer_link;
        m_primer_link = nuevo;
    }
    
    //inserta al final
    public void ins_ultima_pos(String _dat, int _num){
        Dlink nuevo = new Dlink(_dat, _num);
        
        if(es_vacio()) m_primer_link = nuevo;
        else{
            m_ultimo_link.siguiente = nuevo;
            nuevo.anterior = m_ultimo_link;
        } 
        
        m_ultimo_link = nuevo;
    }
    
    //revisa si la lista esta vacia
    public boolean es_vacio(){ return (m_primer_link == null);}
    
    public void display(){
        Dlink n = m_primer_link;
        while(n != null){
            n.display();
            System.out.println("Siguiente -> " + n.siguiente);
            n = n.siguiente;
            System.out.println();
        }
    }
    
}
