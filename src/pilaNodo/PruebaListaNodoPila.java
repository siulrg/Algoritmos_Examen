package pilaNodo;

import java.util.Random;

public class PruebaListaNodoPila 
{
    public static void main(String args[])
    {
        Random random = new Random();
        ListaNodoPila listaNodoPila = new ListaNodoPila();
        int elemento;
        
        System.out.println("Insertar nodos a la lista...");
        
        for(int ingresos=0; ingresos<10; ingresos++)
        {
            elemento = 1 + random.nextInt(50);
            listaNodoPila.insertar(ingresos);//Inserta un elemento en la pila.
        }//Fin del for.
        
        System.out.println("Lista de elementos en la pila");
        listaNodoPila.visualizar();
        
        System.out.println("Eliminado nodos desde la cima...\nSe eliminan los ultimos tres.");
        
        try
        {
            System.out.println("Elemento cima: " + (listaNodoPila.quitar()));
            System.out.println("Elemento cima: " + (listaNodoPila.quitar()));
            System.out.println("Elemento cima: " + (listaNodoPila.quitar()));
            listaNodoPila.visualizar();
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
    }//Fin del main.
}//Fin de la clase PruebaListaNodoPila.
