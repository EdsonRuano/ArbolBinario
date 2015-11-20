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
    
    private void inorder(Nodo aux){
             
        if (aux != null){
        
            inorder(aux.izq);
            System.out.print(aux.valor+", ");
            inorder(aux.der);
            
        }
        }
    
    public void imprimePre(){
    
        preorder(raiz);
    } 
    
    private void preorder(Nodo aux){
             
        if (aux != null){
        
            System.out.print(aux.valor+", ");
            preorder(aux.izq);
            preorder(aux.der);
            
        }
        }

    public void imprimePos(){
    
        postorden(raiz);
    } 
    
    private void postorden(Nodo aux){
             
        if (aux != null){
            
            postorden(aux.izq);
            postorden(aux.der);
            System.out.print(aux.valor+", ");
            
        }
        }
    
    //metodo para buscar un nodo
    
    private Nodo buscar(int valor){
    
        Nodo aux = raiz;
        
        while(aux.valor != valor){
        
            if(valor < aux.valor){
            
                aux = aux.izq;
            
            }else{
                
                aux = aux.der;
            }
            
            if (aux==null){
            
                return null;
            }
        }
        
        return aux;
    }
    
    //Buscar un nodo Z para obtener hijo izquierdo
    
    public int buscaHijoIzq(int valor){
    
        return buscar(valor).izq.valor;
    }
    //Buscar un nodo Z para obtener hijo derecho
    public int buscaHijoDer(int valor){
    
        return buscar(valor).der.valor;
    }
    
    //metodo para eliminar
    
    public boolean elimina(int valor){
    
        Nodo aux = raiz;
        Nodo padre = raiz;
        boolean esHijoIzq = true;
        
        while(aux.valor != valor){ //while para buscar
        
        padre = aux;
        
        if(valor < aux.valor ){
        
            esHijoIzq = true;
            aux = aux.izq;            
        }else{
            esHijoIzq = false;
            aux = aux.der;
        }
    
        if (aux == null){
            
            return false;
        }
    }//fin del while
    
        if (aux.izq==null && aux.der==null){
        
            if(aux==raiz){
            
                raiz = null;
                
            }else if(esHijoIzq){
            
                padre.izq = null;
             
            }else{
                
                padre.der = null;
            }
        
        }else if(aux.der==null){
        
            if(aux==raiz){
            
                raiz = aux.izq;
                
            }else if(esHijoIzq){
            
                padre.izq = aux.izq;
             
            }else{
                
                padre.der = aux.izq;
            }
            
        }else if(aux.izq==null){
        
            if(aux==raiz){
            
                raiz = aux.der;
                
            }else if(esHijoIzq){
            
                padre.izq = aux.der;
             
            }else{
                
                padre.der = aux.der;
            }
            
        }else{
        
            Nodo reemplazo = ObtenerReemplazo(aux);
            
            if(aux==raiz){
            
                raiz = reemplazo;
                
            }else if(esHijoIzq){
            
                padre.izq = reemplazo;
             
            }else{
                
                padre.der = reemplazo;
            }
            
            reemplazo.izq = aux.izq;
        }
        
        return true;
        
    }//fin eliminar
   
    //Metodo obtener remplazo
    
    private Nodo ObtenerReemplazo(Nodo nodoR){
    
        Nodo reemplazarPadre = nodoR;
        Nodo reemplazo = nodoR;
        Nodo aux = nodoR.der;
        
        while(aux != null){
        
            reemplazarPadre = reemplazo;
            reemplazo = aux;
            aux = aux.izq;
        }
        
        if(reemplazo!=nodoR.der){
        
            reemplazarPadre.izq = reemplazo.der;
            reemplazo.der = nodoR.der;
            
        }
        
        return reemplazo;
    }//fin obtener reemplazo
    
   }//fin classe
