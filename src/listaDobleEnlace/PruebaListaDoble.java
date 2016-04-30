package listaDobleEnlace;

import java.util.Random;

public class PruebaListaDoble 
{
    public static void main(String args[])
    {
        Random r = new Random();
        int d;
        ListaDoble lista;
        int k=10;


        lista = new ListaDoble(); //Crea la lista vacia.
        //se insertan elementos en la lista
        for(; k>0; k--)
        {
            d = k;
            lista.insertarCabezaLista(d);
        }//Fin del for.
        //recorre la lista para escribir sus elementos.
        System.out.println("Elementos de la lista generados al azar.");
        lista.visualizar();
        System.out.println();

        int valor = r.nextInt(10);
        Nodo nodo = lista.buscarPosicion(8);//va a eliminar una posicion aleatoria entre 1 y 10.
        System.out.println("El valor del nodo en la posicion " + valor + " es: " + nodo.dato);
        
        System.out.println(">>>Borrando el Nodo #6<<<");
        lista.eliminar(8);
        System.out.println(">>>Se elimino el nodo<<<");
        lista.visualizar();
    }//Fin del metodo main.
    
}
