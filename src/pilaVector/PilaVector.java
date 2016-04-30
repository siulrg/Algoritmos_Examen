package pilaVector;

import java.util.Vector;

public class PilaVector 
{
    //private static final int TAM_PILA = 10;
    private int cima;
    private Vector listaPilaVector;
    
    public PilaVector()
    {
        cima = -1; //condicion de pila vacia.
        listaPilaVector = new Vector();
    }//Fin del constructor.
    
    //Operaciones que modifican la pila
    public void insertar(Object objeto) throws Exception
    {
        if(pilaLlena())
        {
            throw new Exception("Desbordamiento de la pila");
        }//Fin del if.
        
        //incrementar puntero cima y copia elemento.
        cima++;
        listaPilaVector.addElement(objeto);
    }//Fin del metodo insertar.
    
    /**
     * Este metodo devuelve el objeto de la cima, y disminuye la cima de la
     * pila en 1 con cada ejecucion.
     * @return
     * @throws Exception 
     */
    public Object quitar() throws Exception
    {
        Object aux;
        
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no se puede extraer.");
        }//Fin del if.
        
        //guarda elemento de la cima.
        aux = listaPilaVector.elementAt(cima);
        listaPilaVector.removeElementAt(cima); //Elimina el elemento de la cima.
        
        //decrementar cima y devolver elemento.
        cima--;
        
        return aux;
    }//Fin del metodo quitar.
    
    public void limpiarPila()
    {
        listaPilaVector.removeAllElements();
        cima = -1;
    }//Fin del metodo limpiarPila.
    
    //Operacion de acceso a la pila.
    public Object cimaPila() throws Exception
    {
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no hay elementos.");
        }//Fin del if.
        
        return listaPilaVector.elementAt(cima);
    }//Fin del metodo cimaPila.
    
    //Verificacion estado de la pila.
    public boolean pilaVacia()
    {
        return cima==-1;
    }//Fin del metodo pilaVacia.
    public boolean pilaLlena()
    {
        int tamanioVector = listaPilaVector.size();
        return cima == (tamanioVector-1);
    }//Fin del metodo pilaLlena
}//Fin de la clase PilaVector.
