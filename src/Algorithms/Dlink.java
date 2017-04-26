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
public class Dlink {
    
    public String m_nombre;
    public int m_numero;
    
    public Dlink siguiente;
    public Dlink anterior;
    
    //constructor
    public Dlink(String _nom, int _num){
        this.m_nombre = _nom;
        this.m_numero = _num;
    }
    
    //despliega
    public void display(){
        System.out.println(m_nombre + "  " + m_numero);
    }
    
    //a cadena
    @Override
    public String toString(){return m_nombre;}
}
