package listaSimple;


import java.util.Random;

public class ListaEnOrden 
{
    public static void main(String args[])
    {
        Random r;
        int d;
        ListaOrdenada lista;
        int k;
        
        r = new Random(); //generador de numeros aleatorios.
        lista = new ListaOrdenada(); //crea lista vacia
        
        k = r.nextInt(99)+1; //numero de elementos.
        
        //inserta elementos en la lista.
        for(; k>=0; k--)
        {
            d = 1 + r.nextInt(1000);
            lista.insertaOrden(d);
        }//Fin del for.
        //escribe los elementos de la lista.
        System.out.println("Elementos de la lista ordenada: \n");
        lista.visualizar();
    }//Fin del main.
}//Fin de la clase ListaEnOrden.
