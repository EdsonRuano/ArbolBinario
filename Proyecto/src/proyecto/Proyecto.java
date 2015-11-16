package proyecto;

public class Proyecto {

    public static void main(String[] args) {
        
        System.out.println("Mi Arbol Binario");
        
        Arbol ar = new Arbol();
        
        ar.insertar(5);
        ar.insertar(4);
        ar.insertar(8);
        ar.insertar(6);
        ar.insertar(7);
        ar.insertar(8);
        ar.insertar(9);
  

    
    System.out.println(ar.raiz.valor);
    System.out.println(ar.raiz.izq.valor);
    System.out.println(ar.raiz.der.valor);
    System.out.println(ar.raiz.der.izq.valor);
    System.out.println(ar.raiz.der.izq.der.valor);
    
    }
    
}
