/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colaCircular;

/**
 *
 * @author estudiante
 */
public class ColaCircular {
    
    private static final int MAXTAMQ = 5;
    protected int frente;
    protected int fin;
    protected Object[] listaCola;
    
    //avanza una posicion
    
    private int siguiente(int r)
    {
        return(r + 1) % MAXTAMQ;
    }
    //inicializa la cola vacia
    
    public ColaCircular()
    {
        frente = 0;
        fin = MAXTAMQ -1;
        listaCola = new Object[MAXTAMQ];
        
    }
    //operaciones de la modificacion de la cola
    
    public void insertar(Object elemento)throws Exception
    {
        //System.out.print("fin" +"fin");
        
        if(!colaLlena())
        {
            fin = siguiente(fin);
            listaCola[fin] = elemento;
            
        } else if(++fin ==(MAXTAMQ-1))
        {
 //fin = siguiente(fin);
             listaCola[fin] = elemento;
        }
        else {
            throw new Exception("Overflow en la cola");
        }
    }
    
    public Object quitar() throws Exception
    {
        if(!colaVacia())
        {
            Object tm = listaCola[frente];
            frente = siguiente(frente);
            return tm;
        }
        else
        {
            throw new Exception("Cola vacia");
        }
    }
    
    public void borrarCola()
    {
        frente = 0;
        fin =MAXTAMQ -1;
        
    }
    
    //acseso a la cola
    
    public Object frenteCola() throws Exception
    {
        if(!colaVacia())
        {
            return listaCola[frente];
            
        }
        else
        {
            throw new Exception("Cola vacia");
        }
    }
    
    //metodos de verificacion
    
    public boolean colaVacia()
    {
        return frente == siguiente(fin);
    }
    
    //comprueba si está llena
    
    public boolean colaLlena()
    {
        System.out.print("  fin  "+siguiente(fin)); //0
        System.out.print("  Siguiente fin  "+siguiente(siguiente(fin)));
        return frente ==siguiente(siguiente(fin));
    }
}
