/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashSet_y_TreeSet;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class InterfazEstudiante extends javax.swing.JFrame {

    private Hashtable tablaHash;
    /**
     * Creates new form InterfazEstudiante
     */
    public InterfazEstudiante() {
        initComponents();
        tablaHash = new Hashtable();
        ejemplos(); //Agregar cinco ejemplos al Hashtable tablaHash.
        
        setLocationRelativeTo(null);
    }

    public void ejemplos()
    {
        Estudiante estudiante1 = new Estudiante("1", "Javier");
        Estudiante estudiante2 = new Estudiante("2", "Andres");
        Estudiante estudiante3 = new Estudiante("3", "Sara");
        Estudiante estudiante4 = new Estudiante("4", "Veronica");
        Estudiante estudiante5 = new Estudiante("5", "Roberto");
        
        agregarEstudiantes(estudiante1.getCedula(), estudiante1);
        agregarEstudiantes(estudiante2.getCedula(), estudiante2);
        agregarEstudiantes(estudiante3.getCedula(), estudiante3);
        agregarEstudiantes(estudiante4.getCedula(), estudiante4);
        agregarEstudiantes(estudiante5.getCedula(), estudiante5);
    }
    
    public void agregarEstudiantes(String cedula, Estudiante estudiante)
    {
        tablaHash.put(cedula, estudiante);
    }
    
    public String imprimirTabla(Collection coleccion)
    {
        String info = "";
        
        Iterator iterador = coleccion.iterator();
        Estudiante e = null;
        
        while(iterador.hasNext())
        {
            e = (Estudiante)iterador.next();
            
            if(!iterador.hasNext())
            {
                info += (e.getCedula() + " - " + e.getNombre() + ". ");
            }
            else
            {
                info += (e.getCedula() + " - " + e.getNombre() + "\n");
            }
        }//Fin del while.
        
        return info;
    }//Fin del metodo imprimirTabla.
    
    public void ordenarPorNombre()
    {
        TreeSet treeSet = new TreeSet(new Comparador());
        treeSet.addAll(tablaHash.values());
        
        System.out.println("Elementos ordenados:\n" + imprimirTabla(treeSet));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar_BarraMenu = new javax.swing.JMenuBar();
        jMenu_Estudiantes = new javax.swing.JMenu();
        jMenuItem_AgregarNuevo = new javax.swing.JMenuItem();
        jMenuItem_Ordenar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu_Estudiantes.setText("Estudiantes");

        jMenuItem_AgregarNuevo.setText("Agregar nuevo");
        jMenuItem_AgregarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AgregarNuevoActionPerformed(evt);
            }
        });
        jMenu_Estudiantes.add(jMenuItem_AgregarNuevo);

        jMenuItem_Ordenar.setText("Ordenar por nombre");
        jMenuItem_Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_OrdenarActionPerformed(evt);
            }
        });
        jMenu_Estudiantes.add(jMenuItem_Ordenar);

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_Estudiantes.add(jMenuItem1);

        jMenuBar_BarraMenu.add(jMenu_Estudiantes);

        setJMenuBar(jMenuBar_BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_AgregarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AgregarNuevoActionPerformed
        // TODO add your handling code here:
        AgregarNuevo agregarNuevo = new AgregarNuevo(tablaHash);
        agregarNuevo.setVisible(true);
    }//GEN-LAST:event_jMenuItem_AgregarNuevoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        String cedula = JOptionPane.showInputDialog(null, "Ingrese la cedula del estudiante que desea eliminar.");
        
        if(tablaHash.containsKey(cedula))
        {
            tablaHash.remove(cedula);
            JOptionPane.showMessageDialog(null, "El estudiante se ha eliminado.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El estudiante que busca no existe.");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem_OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_OrdenarActionPerformed
        // TODO add your handling code here:
        ordenarPorNombre();
    }//GEN-LAST:event_jMenuItem_OrdenarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar_BarraMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_AgregarNuevo;
    private javax.swing.JMenuItem jMenuItem_Ordenar;
    private javax.swing.JMenu jMenu_Estudiantes;
    // End of variables declaration//GEN-END:variables
}
