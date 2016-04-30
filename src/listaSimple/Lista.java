package listaSimple;

public class Lista
{
    protected Nodo primero;

    public Lista()
    {
        primero = null;
    }//Fin del constructor.

    public Lista insertarCabezaLista(int entrada)
    {
        Nodo nuevo; //Esta linea es mejor declararla en la linea 4.
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;

        return this;
    }//Fin del metodo insertarCabezaLista.

    public void visualizar()
    {
        Nodo n;
        int k = 0;

        n = primero;
        while(n != null)
        {
            System.out.print(n.dato + " ");
            n = n.enlace;
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
        
        indice = primero;
        
        for(i=1; (i<posicion) && (indice!=null); i++)
        {
            indice = indice.enlace;
        }//Fin del for.
        
        return indice;
    }//Fin del metodo buscarPosicion.
    
    public void eliminar(int entrada)
    {
        Nodo actual, anterior;
        boolean encontrado;
        //inicializa los apuntadores.
        actual = primero;
        anterior = null;
        encontrado = false;
        //busqueda del nodo y del anterior.
        while((actual!=null) && (!encontrado))
        {
            encontrado = (actual.dato == entrada);
            //con objetos: actual.dato.equals(entrada)
            if(!encontrado)
            {
                anterior = actual;
                actual = actual.enlace;
            }//Fin del if.
        }//Fin del while.
        //Enlace del nodo anterior con el siguiente.
        if(actual != null)
        {
            //Distingue entre que el nodo sea el cabecera,
            //o del resto de la lista
            if(actual == primero)
            {
                primero = actual.enlace;
            }
            else
            {
                anterior.enlace = actual.enlace;
            }
            actual = null; //no es necesario al ser una variable local.
        }//Fin del if.
    }//Fin del metodo eliminar.
}//Fin de la clase Lista.
