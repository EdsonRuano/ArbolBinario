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
    
    public void imprimeIno(){
    
        inorder(raiz);
    }
    
    public void inorder(Nodo aux){
             
        if (aux != null){
        
            inorder(aux.izq);
            System.out.println(aux.valor);
            inorder(aux.der);
            
        }
        }
    
    public void imprimePre(){
    
        preorder(raiz);
    } 
    
    public void preorder(Nodo aux){
             
        if (aux != null){
        
            System.out.println(aux.valor);
            preorder(aux.izq);
            preorder(aux.der);
            
        }
        }

        public void imprimePos(){
    
        postorden(raiz);
    } 
    
    public void postorden(Nodo aux){
             
        if (aux != null){
            
            postorden(aux.izq);
            postorden(aux.der);
            System.out.println(aux.valor);
            
        }
        }
    
    
   }//fin classe
