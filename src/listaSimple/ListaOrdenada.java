package listaSimple;

public class ListaOrdenada extends Lista 
{
    public ListaOrdenada()
    {
        super();
    }//Fin del constructor.
    
    public ListaOrdenada insertaOrden(int entrada)
    {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        
        if( primero == null) //lista vacia
        {
            primero = nuevo;
        }//Fin del if.
        else if(entrada < primero.getDato())
        {
            nuevo.setEnlace(primero);
            primero = nuevo;
        }//Fin del else-if.
        else //busqueda del nodo anterior a partir del que se debe insertar
        {
            Nodo anterior, p;
            anterior = p = primero;
            
            while((p.getEnlace() != null) && (entrada > p.getDato()))
            {
                anterior = p;
                p = p.getEnlace();
            }//Fin del while.
            if(entrada > p.getDato()) //se inserta despues del ultimo nodo.
            {
                anterior = p;
            }//Fin del if.
            
            //Se procede al enlace del nuevo nodo.
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }//Fin del else.
        
        return this;
    }//Fin del metodo insertaOrden.

}//Fin de la clase ListaOrdenada.
