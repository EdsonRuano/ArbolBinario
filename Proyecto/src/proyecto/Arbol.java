package proyecto;

public class Arbol {
 
    Nodo raiz = null;
    
    public void insertar(int valor){
    
    Nodo newNodo = new Nodo(valor);
    
    if (raiz==null){
    
        raiz = newNodo;
    }else{
        Nodo temporal = raiz; 
        Nodo raizAux = temporal;
        
        while(temporal != null){
        
            if(newNodo.valor == temporal.valor){
            
                    temporal = null;
                    raizAux = null;
                    
            }else{
            
            if(newNodo.valor > temporal.valor){
            
                raizAux = temporal;
                temporal = temporal.der;
                
                }else{
                    
                    raizAux = temporal;
                    temporal = temporal.izq;
                }
            }
        }//fin while
        
        if (raizAux!= null){
        
        if (newNodo.valor > raizAux.valor){
        
                raizAux.der = newNodo;          //Aqui hay problema
            }else{
                raizAux.izq = newNodo;
            }
        }
    }
    }//fin insertar
}//fin classe
