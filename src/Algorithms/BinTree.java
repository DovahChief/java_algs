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
public class BinTree {
    //inicio del arbol
    Nodo m_raiz;
    
    //agregar un nodo
    public void agrega_nodo(int _k, String _nombre){
        Nodo n_nodo = new Nodo(_k, _nombre);
        
        //caso del primer nodo del arbol
        if(m_raiz == null)    m_raiz = n_nodo; //si no se ha inicializado la raiz 
        else {
            Nodo focus_n = m_raiz;
            Nodo padre;
            
            //ciclo que recorre el arbol
            while(true){
                padre = focus_n;
                
                if(_k < focus_n.m_key) {
                    focus_n = focus_n.hijo_izq;
                    if(focus_n == null){
                        padre.hijo_izq = n_nodo;
                        return;
                    }//fin del if 
                }//fin del if para el lado izquierdo (llave menor a raiz)
                else {
                    focus_n = focus_n.hijo_der;
                    if(focus_n == null) {
                        padre.hijo_der = n_nodo;
                        return;
                    }
                }//fin del else para el lado derecho (llave mayor a raiz)
            }//fin del ciclo
            
        }
    }
    
    //busqueda binaria
    public Nodo bin_search(int _k){
        Nodo focus_n = m_raiz;   
        while(focus_n.m_key != _k){
            focus_n = (_k > focus_n.m_key) ?  focus_n.hijo_der :  focus_n.hijo_izq;
            if(focus_n == null || focus_n.m_key == _k) return (focus_n);  //unico punto de salida
       }     
       return (focus_n); //innecesario pero requerido por el compilador *revisar
    }
          
    //elimina un elemento del arbol
    public void remueve(int _k){
        Nodo focus = m_raiz;
        Nodo padre = m_raiz;
        boolean es_hijo_izq = false;
        
        while(focus.m_key != _k){
            padre = focus;
            if(_k < focus.m_key){
                es_hijo_izq = true;
                focus = focus.hijo_izq;
            } else {
                es_hijo_izq = false;
                focus = focus.hijo_der;
            }
            if(focus == null) return;
        }//fin del while
        
        //no tiene hijos
        if(!focus.tiene_hijos()){ 
            if(focus == m_raiz)    m_raiz = null;
            else if(es_hijo_izq) padre.hijo_izq = null;
            else                 padre.hijo_der = null;
        } //no tiene hijo derecho 
        else if(focus.hijo_der == null){ 
            if(focus == m_raiz)  m_raiz = focus.hijo_izq;
            else if(es_hijo_izq) padre.hijo_izq = focus.hijo_izq;
            else                 padre.hijo_der = focus.hijo_izq;
        } //no tiene hijo izquierdo 
        else if(focus.hijo_izq == null){ 
            if(focus == m_raiz)  m_raiz = focus.hijo_der;
            else if(es_hijo_izq) padre.hijo_izq = focus.hijo_der;
            else                 padre.hijo_der = focus.hijo_der;
        } else {
            Nodo reemplazo = reemplaza_n(focus);
            if(focus == m_raiz)  m_raiz = reemplazo;
            else if(es_hijo_izq) padre.hijo_izq = reemplazo;
            else                 padre.hijo_der = reemplazo;
            reemplazo.hijo_izq = focus.hijo_izq;
        }
    }
    
    //solo para ser usado en la funcion de remueve
    private Nodo reemplaza_n(Nodo _cambiado) {
            Nodo replacementParent = _cambiado;
            Nodo replacement = _cambiado;
            Nodo focusNode = _cambiado.hijo_der;
            
            while (focusNode != null) {
                    replacementParent = replacement;
                    replacement = focusNode;
                    focusNode = focusNode.hijo_izq;

            }
            if (replacement != _cambiado.hijo_der) {
                    replacementParent.hijo_izq = replacement.hijo_der;
                    replacement.hijo_der = _cambiado.hijo_der;
            }

            return replacement;
    }
    
    //recorrido inorden en el arbol
    public void rec_inorden(Nodo _focus_n){
        if(_focus_n != null){
            rec_inorden(_focus_n.hijo_izq);
            System.out.println(_focus_n);
            rec_inorden(_focus_n.hijo_der);
        }
    }
    
    //recorrodo preorden del arbol
    public void rec_preorden(Nodo _focus_n){
        if(_focus_n != null){
            System.out.println(_focus_n);
            rec_preorden(_focus_n.hijo_izq);
            rec_preorden(_focus_n.hijo_der);
        }
    }
    
    //recorrodo posorden del arbol
    public void rec_posorden(Nodo _focus_n){
        if(_focus_n != null){
            rec_posorden(_focus_n.hijo_izq);
            rec_posorden(_focus_n.hijo_der);
            System.out.println(_focus_n);
        }
    }
    
    
}
