/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colaCircular;

/**
 *
 * @author estudiante
 */
public class PruebaCircular {
    
    public static void main(String[] args)
    {
        boolean capicua;
        String numero;
        
        ColaCircular q = new ColaCircular();
        try
        {
            int i = 0;
            q.insertar(i++);
           System.err.println("Imprimir valores caso1 fin  "+q.fin+"   frente   "+q.frente);
            
            
            while(!q.colaLlena())
            {
                //System.err.println(q.quitar());
                q.insertar(i++);
                System.out.println(i+" , ");
            }
            
                System.out.println("imprimir valores caso4  "+q.fin+" frente  "+q.frente);
                q.quitar();
                System.out.println("imprimir valores caso4  "+q.fin+" frente  "+q.frente);
                q.insertar(i++);
                System.out.println("imprimir valores caso4  "+q.fin+" frente  "+q.frente);
                
                
        } catch (Exception er)
        {
            System.err.println("Error(exception) en el proceso"+er);
        }
    }
}
