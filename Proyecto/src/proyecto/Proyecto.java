package proyecto;

public class Proyecto {

    public static void main(String[] args) {
        
        System.out.println("Mi Arbol Binario");
        
        Arbol ar = new Arbol();
        
        ar.insertar(5);
        ar.insertar(3);
        ar.insertar(2);
        ar.insertar(7);
        ar.insertar(4);
        ar.insertar(6);
        ar.insertar(10);
      
    /*System.out.println(ar.raiz.valor);
    System.out.println(ar.raiz.izq.valor);
    System.out.println(ar.raiz.der.valor);
    System.out.println(ar.raiz.der.izq.valor);
    System.out.println(ar.raiz.der.izq.der.valor+"\n");
    */
    ar.imprimePre();    System.out.println("\n");
    ar.imprimeIno();    System.out.println("\n");
    ar.imprimePos();    System.out.println("\n");
    
    System.out.println(ar.buscaHijoIzq(5));
    System.out.println(ar.buscaHijoDer(5));
    
    }  
}
