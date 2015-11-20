package proyecto;

public class Proyecto {

    public static void main(String[] args) {
         Arbol arbol = new Arbol();
         String a = args[0];
         if(args.length>0 && a.contains("insertar(")&&(a.contains("&elimina(")&&(a.contains("&insertar(")&&(a.contains("&buscaHijoDer("))))){
               int valor;
               String[] comparar = new String[100];
               int inicio = a.indexOf("insertar");
               int fin = a.lastIndexOf("&elimina");
               comparar[0] = a.substring(inicio+9,fin-1);
               int sinComa;
               String[] almacenar = new String[100];
               almacenar[0] = comparar[0];
               String[] quitarComa =almacenar[0].split(",");
               for(int i=0;i<quitarComa.length;i++){
                   sinComa = Integer.parseInt(quitarComa[i]);
                   arbol.insertar(sinComa);
               }
               int inicio1 = a.indexOf("elimina");
               int fin1 = a.lastIndexOf("&insertar");
               int sinComa1;
               String comparar1;
               comparar1 = a.substring(inicio1+8,fin1-1);
               String[] almacenar2 = new String[100];
               almacenar2[1] = comparar1;
               String[] quitarComa1 = almacenar2[1].split(",");
               for(int i=0;i<quitarComa1.length;i++){
                   sinComa1 = Integer.parseInt(quitarComa1[i]);
                   valor = sinComa1;
                   arbol.elimina(valor);
               }
               int inicio2 = a.indexOf("&insertar");
               int fin2 = a.lastIndexOf("&buscaHijoDer");
               int sinComa2;
               String comparar2;
               comparar2 = a.substring(inicio2+10,fin2-1);
               String[] almacenar3 = new String[100];
               almacenar3[1] = comparar2;
               String[] quitarComa2 = almacenar3[1].split(",");
               for(int i=0;i<quitarComa2.length;i++){
                   sinComa2 = Integer.parseInt(quitarComa2[i]);
                   int valor2 = sinComa2;
                   arbol.insertar(valor2);
               }
               int inicio3 = a.indexOf("&buscaHijoDer(");
               int fin3 = a.lastIndexOf(")");
               String comparar3;
               comparar3 = a.substring(inicio3+14,fin3);
               String[] almacenar4 = new String[100];
               almacenar4[1] = comparar3;
               int valor3 = Integer.parseInt(comparar3);
               System.out.println();
               arbol.buscaHijoDer(valor3);
               System.out.println();
         }
         else if(args.length>0 && a.contains("insertar(")&&(a.contains("&elimina(")&&(a.contains("&insertar(")&&(a.contains("&buscaHijoIzq("))))){
               int valor;
               String[] comparar = new String[100];
               int inicio = a.indexOf("insertar");
               int fin = a.lastIndexOf("&elimina");
               comparar[0] = a.substring(inicio+9,fin-1);
               int sinComa;
               String[] almacenar = new String[100];
               almacenar[0] = comparar[0];
               String[] quitarComa =almacenar[0].split(",");
               for(int i=0;i<quitarComa.length;i++){
                   sinComa = Integer.parseInt(quitarComa[i]);
                   arbol.insertar(sinComa);
               }
               int inicio1 = a.indexOf("elimina");
               int fin1 = a.lastIndexOf("&insertar");
               int sinComa1;
               String comparar1;
               comparar1 = a.substring(inicio1+8,fin1-1);
               String[] almacenar2 = new String[100];
               almacenar2[1] = comparar1;
               String[] quitarComa1 = almacenar2[1].split(",");
               for(int i=0;i<quitarComa1.length;i++){
                   sinComa1 = Integer.parseInt(quitarComa1[i]);
                   valor = sinComa1;
                   arbol.elimina(valor);
               }
               int inicio2 = a.indexOf("&insertar");
               int fin2 = a.lastIndexOf("&buscaHijoIzq");
               int sinComa2;
               String comparar2;
               comparar2 = a.substring(inicio2+10,fin2-1);
               String[] almacenar3 = new String[100];
               almacenar3[1] = comparar2;
               String[] quitarComa2 = almacenar3[1].split(",");
               for(int i=0;i<quitarComa2.length;i++){
                   sinComa2 = Integer.parseInt(quitarComa2[i]);
                   int valor2 = sinComa2;
                   arbol.insertar(valor2);
               }
               int inicio3 = a.indexOf("&buscaHijoIzq(");
               int fin3 = a.lastIndexOf(")");
               String comparar3;
               comparar3 = a.substring(inicio3+14,fin3);
               String[] almacenar4 = new String[100];
               almacenar4[1] = comparar3;
               int valor3 = Integer.parseInt(comparar3);
               System.out.println();
               arbol.buscaHijoIzq(valor3);
               System.out.println();
         }
         else if(args.length>0 &&(a.contains("insertar(")&&(a.contains("&elimina(")&&(a.contains("&imprimeIno()"))))){
             int valor;
             String[] comparar = new String[100];
                int inicio = a.indexOf("insertar");
                int fin = a.lastIndexOf("&elimina");
                comparar[0] = a.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar[0];
                String[] quitarComa = almacenar[0].split(",");
                for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbol.insertar(sinComa);
                }
                int inicio1 = a.indexOf("elimina");
                int fin1 = a.lastIndexOf("&imprimeIno");
                int sinComa1;
                String comparar1;
                comparar1 = a.substring(inicio1+8,fin1-1);
                String[] almacenar2 = new String[100];
                almacenar2[1] = comparar1;
                String[] quitarComa1 = almacenar2[1].split(",");
                for(int i=0;i<quitarComa1.length;i++){
                sinComa1 = Integer.parseInt(quitarComa1[i]);
                valor = sinComa1;  
                arbol.elimina(valor);
                }
                System.out.println();
                arbol.imprimeIno();
                System.out.println();
            }  
         else if(args.length>0 &&(a.contains("insertar(")&&(a.contains("&imprimeIno()")))){
   
                String comparar;
                 int inicio = a.indexOf("insertar(");
                int fin = a.lastIndexOf("&imprimeIno");
                comparar = a.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
                for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbol.insertar(sinComa);
                } 
                System.out.println();
                arbol.imprimeIno();
                System.out.println();
            } 
         
         else if(args.length>0 &&(a.contains("insertar(")&&(a.contains("&elimina(")&&(a.contains("&imprimePre()"))))){
                int valor;
                String comparar;
                 int inicio = a.indexOf("insertar(");
                int fin = a.lastIndexOf("&elimina");
                comparar = a.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
                for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbol.insertar(sinComa);
                } 
                int inicio1 = a.indexOf("elimina(");
                int fin1 = a.lastIndexOf("&imprimePre");
                String comparar1;
                comparar1 = a.substring(inicio1+8,fin1-1);
                String[] almacenar2 = new String[100];
                almacenar2[1] = comparar1;
                String[] quitarComa1 = almacenar2[1].split(",");
                for(int i=0;i<quitarComa1.length;i++){
                sinComa = Integer.parseInt(quitarComa1[i]);
                valor = sinComa;
                arbol.elimina(valor);
                }
                System.out.println();
                arbol.imprimePre();
                System.out.println();
            }    
         else if(args.length>0 &&(a.contains("insertar(")&&(a.contains("&imprimePre()")))){
   
                String comparar;
                int inicio = a.indexOf("insertar(");
                int fin = a.lastIndexOf("&imprimePre");
                comparar = a.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
                for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbol.insertar(sinComa);
                } 
                System.out.println();
                arbol.imprimePre();
                System.out.println();
            }    
         else  if(args.length>0 &&(a.contains("insertar(")&&(a.contains("&elimina(")&&(a.contains("&imprimePos()"))))){
                int valor;
                String comparar;
                 int inicio = a.indexOf("insertar(");
                int fin = a.lastIndexOf("&elimina");
                comparar = a.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
                for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbol.insertar(sinComa);
                } 
                int inicio1 = a.indexOf("elimina(");
                int fin1 = a.lastIndexOf("&imprimePos");
                String comparar1;
                comparar1 = a.substring(inicio1+8,fin1-1);
                String[] almacenar2 = new String[100];
                almacenar2[1] = comparar1;
                String[] quitarComa1 = almacenar2[1].split(",");
                for(int i=0;i<quitarComa1.length;i++){
                sinComa = Integer.parseInt(quitarComa1[i]);
                valor = sinComa;
                arbol.elimina(valor);
                }
                System.out.println();
                arbol.imprimePos();
                System.out.println();
            }    
          else if(args.length>0 &&(a.contains("insertar(")&&(a.contains("&imprimePos()")))){
   
                String comparar;
                 int inicio = a.indexOf("insertar(");
                int fin = a.lastIndexOf("&imprimePos");
                comparar = a.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
                for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbol.insertar(sinComa);
                } 
                System.out.println();
                arbol.imprimePos();
                System.out.println();
            } 
         
          else if (args.length >0 && a.contains("insertar(")&&(a.contains("&buscaHijoDer("))){
               {
               int valor;
                String comparar;
                 int inicio = a.indexOf("insertar(");
                int fin = a.lastIndexOf("&buscaHijoDer");
                comparar = a.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
                for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbol.insertar(sinComa);
                } 
                int inicio1 = a.indexOf("buscaHijoDer(");
                int fin1 = a.lastIndexOf(")");
                String comparar1;
                comparar1 = a.substring(inicio1+13,fin1);
                String[] almacenar2 = new String[100];
                almacenar2[1] = comparar1;
                valor = Integer.parseInt(comparar1);
                System.out.println();
                arbol.buscaHijoDer(valor);
                System.out.println();
            } 
           }else if(args.length >0 && a.contains("insertar(")&&(a.contains("&buscaHijoIzq(")))
                   {
               int valor;
                String comparar;
                 int inicio = a.indexOf("insertar(");
                int fin = a.lastIndexOf("&buscaHijoIzq");
                comparar = a.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
                for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbol.insertar(sinComa);
                } 
                int inicio1 = a.indexOf("buscaHijoIzq(");
                int fin1 = a.lastIndexOf(")");
                String comparar1;
                comparar1 = a.substring(inicio1+13,fin1);
                String[] almacenar2 = new String[100];
                almacenar2[1] = comparar1;
                valor = Integer.parseInt(comparar1);
                System.out.println();
                arbol.buscaHijoIzq(valor);
                System.out.println();
            }                   
    }
}


