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
    
    //inserta despues de una llave
    public void ins_despues_de(String _dat, int _num, int _llave){
        Dlink nuevo = new Dlink(_dat, _num);
        Dlink actual =  m_primer_link;
        
        while(actual.m_numero != _llave){
            actual = actual.siguiente;
            if(actual == null)  return; 
        }
        
        if(actual == m_ultimo_link){
            nuevo.siguiente = null;
            m_ultimo_link = nuevo;
        }else{
            nuevo.siguiente = actual.siguiente;
            actual.siguiente.anterior = nuevo;
        }
        nuevo.anterior = actual;
        actual.siguiente = nuevo; 
     }
    
    //inserta en orden
    public void ins_en_orden(String _dat, int _num){
        Dlink nuevo = new Dlink(_dat, _num);
        Dlink previo = null;
        Dlink actual = m_primer_link;
        
        while((actual != null) && (actual.m_numero < _num)){
            previo = actual;
            actual = actual.siguiente;
        }
        
        if(previo == null)  m_primer_link = nuevo;
        else                previo.siguiente = nuevo;
        
        nuevo.siguiente =  actual; 
            
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
