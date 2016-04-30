package pilaNodo;

public class ListaNodoPila 
{
    private NodoPila cima;
    
    public ListaNodoPila()
    {
        cima = null;
    }
    
    public void insertar(Object elemento)
    {
        NodoPila nuevo;
        nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }
    
    public Object quitar() throws Exception
    {
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no se puede extraer.");
        }
        
        Object aux = cima.elemento;
        cima = cima.siguiente;
        
        return aux;
    }
    
    public void visualizar()
    {
        NodoPila nodoPila;
        int k=0;
        
        nodoPila = cima;
        
        while(nodoPila != null)
        {
            System.out.print(nodoPila.elemento + " ");
            nodoPila = nodoPila.siguiente;
            k++;
            System.out.print((k%15 != 0 ? " " : "\n"));
        }//Fin del while
    }
    
    public boolean pilaVacia()
    {
        return cima == null;
    }
}//Fin de la clase ListaNodoPila.
