package listaSimple;

import java.util.Random;

public class ListaAleatoria
{
    public static void main(String args[])
    {
        Random r;
        int d;
        Lista lista;
        int k;

        r = new Random();

        lista = new Lista(); //Crea la lista vacia.
        k = Math.abs(r.nextInt() % 55); //Numero de nodos.
        //se insertan elementos en la lista
        for(; k>0; k--)
        {
            d = r.nextInt() % 99;
            lista.insertarCabezaLista(d);
        }//Fin del for.
        //recorre la lista para escribir sus elementos.
        System.out.println("Elementos de la lista generados al azar.");
        lista.visualizar();
        System.out.println();

        Nodo nodo = lista.buscarPosicion(6);//siempre va a buscar en la posicion #6.
        System.out.println("El valor del nodo en la posicion 6 es: " + nodo.dato);
        
        System.out.println(">>>Borrando el Nodo #6<<<");
        lista.eliminar(nodo.dato);
        System.out.println(">>>Se elimino el nodo<<<");
        lista.visualizar();
    }//Fin del metodo main.
}//Fin de la clase ListaAleatoria.
