package listaCircular;

public class ListaCircular 
{
    private Nodo lc;
    
    public ListaCircular()
    {
        lc = null;
    }//Fin del constructor.
    
    public ListaCircular insertar(int entrada)
    {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        
        if(lc != null) //lista circular no vacia.
        {
            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;
        }//Fin del if.
        
        lc = nuevo;
        
        return this;
    }//Fin del metodo insertar.
    
    public void eliminar(int entrada)
    {
        Nodo actual;
        boolean encontrado = false;
        
        //bucle de busqueda.
        actual = lc;
        
        while((actual.enlace != lc) && (!encontrado))
        {
            encontrado = (actual.enlace.dato == entrada);
            if(!encontrado)
            {
                actual = actual.enlace;
            }//Fin del if.
        }//Fin del while.
        
        encontrado = (actual.enlace.dato == entrada);
        
        //Enlace de nodo anterior con el siguiente.
        
        if(encontrado)
        {
            Nodo p;
            p = actual.enlace; //Nodo a eliminar.
            if(lc == lc.enlace) //Lista con un solo nodo.
            {
                lc = null;
            }//Fin del enlace.
            else
            {
                if( p == lc)
                {
                    lc = actual; //Se borra el elemento referenciado por lc,
                                 //el nuevo acceso a la lista es el anterior.
                }//Fin del if.
                actual.enlace = p.enlace;
            }//Fin del else.
            
            p = null;
        }//Fin del if.
    }//Fin del metodo eliminar.
    
    public void visualizar()
    {
        Nodo n;
        int k = 0;

        n = lc;
        
        do{
            System.out.print(n.dato + ", ");
            n = n.enlace;
            k++;
        }while(n != lc);
        System.out.println();
    }//Fin del metodo visualizar.
}//Fin de la clase ListaCircular.
