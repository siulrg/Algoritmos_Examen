package listaDobleEnlace;

public class ListaDoble 
{
    Nodo cabeza;

    public ListaDoble()
    {
        cabeza = null;
    }//Fin del constructor.
    
    public void visualizar()
    {
        Nodo n;
        int k = 0;

        n = cabeza;
        while(n != null)
        {
            System.out.print(n.dato + " ");
            n = n.adelante;
            k++;
            System.out.print((k%15 != 0 ? " " : "\n"));
        }//Fin del while
    }//Fin del metodo visualizar.
    
    public Nodo buscarPosicion(int posicion)
    {
        Nodo indice;
        
        int i;
        
        if(posicion < 0) //Posicion ha de ser mayor que cero.
        {
            return null;
        }//Fin del if.
        
        indice = cabeza;
        
        for(i=1; (i<posicion) && (indice!=null); i++)
        {
            indice = indice.adelante;
        }//Fin del for.
        
        return indice;
    }//Fin del metodo buscarPosicion.
    
    public ListaDoble insertarCabezaLista(int entrada)
    {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.adelante = cabeza;
        
        if(cabeza != null)
        {
            cabeza.atras = nuevo;
        }//Fin del if.
        
        cabeza= nuevo;
        
        return this;
    }//Fin del metodo insertarCabezaLista.
    
    public void eliminar(int entrada)
    {
        Nodo actual;
        boolean encontrado = false;
        actual = cabeza;
        
        //Bucle de busqueda.
        while((actual != null) && (!encontrado))
        {
            /* la comparacion se realiza con el metodo equals()...,
            depende del tipo Elemento. */
            encontrado = (actual.dato == entrada);
            if(!encontrado)
            {
                actual = actual.adelante;
            }//Fin del if.
        }//Fin del while.
        
        //Enlace de nodo anterior con el siguiente
        if(actual != null)
        {
            //distingue entre nodo cabecera o resto de la lista.
            if(actual == cabeza)
            {
                cabeza = actual.adelante;
                if(actual.adelante != null)
                {
                    actual.adelante.atras = null;
                }//Fin del if.
            }//Fin del if.
            else if(actual.adelante != null) //no es el ultimo nodo.
            {
                actual.atras.adelante = actual.adelante;
                actual.adelante.atras = actual.atras;
            }//Fin del else-if.
            else //ultimo nodo.
            {
                actual.atras.adelante = null;
            }//Fin del else.
            
            actual = null;
        }//Fin del if.
    }//Fin del metodo eliminar.
}//Fin de la clase ListaDoble.
