package listaDobleEnlace;

public class Nodo 
{
    int dato;
    Nodo adelante;
    Nodo atras;

    public Nodo(int dato) 
    {
        this.dato = dato;
        adelante = null;
        atras = null;
    }//Fin del constructor.

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getAdelante() {
        return adelante;
    }

    public void setAdelante(Nodo adelante) {
        this.adelante = adelante;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }    
}//Fin de la clase Nodo.
