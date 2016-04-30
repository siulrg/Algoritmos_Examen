/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashSet_y_TreeSet;

import java.util.Comparator;

/**
 *
 * @author estudiante
 */
public class Comparador implements Comparator{

    public int compare(Object o1, Object o2) 
    {
        Estudiante e1 = (Estudiante)o1;
        Estudiante e2 = (Estudiante)o2;
        String c1 = e1.getNombre();
        String c2 = e2.getNombre();
        
        c1 = c1.toUpperCase();
        c2 = c2.toUpperCase();
        
        return c1.compareTo(c2);
    }//Fin del metodo compare.
    
}
