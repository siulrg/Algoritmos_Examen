package colas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaColaLineal 
{
    public static void main(String args[])
    {
        ColaLineal colaLineal = new ColaLineal();
        
        System.out.println("Ingresando datos a array...");
        
        for(int i=0; i<10; i++)
        {
            try
            {
                colaLineal.insertar(i+1);
            }
            catch(Exception ex)
            {
                System.err.println(ex);
            }
        }
        System.out.println("Elementos de la cola...");
        colaLineal.visualizar();
        
        System.out.println("Quitando el elemento del frente de la cola...");
        
        try 
        {
            colaLineal.quitar();
            colaLineal.quitar();
        } 
        catch (Exception ex) 
        {
            System.err.println(ex);
        }
        
        System.out.println("Elementos de la cola despues de quitar los dos del frente.");
        colaLineal.visualizar();        
    }
}//Fin de la clase PruebaColaLineal.
