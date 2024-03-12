package ventanas;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        this.setUndecorated(false);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        //Declaración de objetos
        jButtonEncantamientos = new JButton();
        jButtonMateriales = new JButton();
        jLabel1Fondo = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        jButtonEncantamientos.setFont(new Font("Segoe UI Black", 0, 18));
        jButtonEncantamientos.setText("Encantamientos");
        jButtonEncantamientos.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jButtonEncantamientos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonEncantamientos(evt);
            }
        });
        getContentPane().add(jButtonEncantamientos, new AbsoluteConstraints(210, 150, 180, 40));

        jButtonMateriales.setFont(new Font("Segoe UI Black", 0, 18)); //Asignar fuente el botón
        jButtonMateriales.setText("Materiales"); // Asignarle un texto al botón
        jButtonMateriales.setBorder(new SoftBevelBorder(BevelBorder.RAISED)); //Tipo de borde asignado
        jButtonMateriales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButtonMateriales(evt);
            }
        });
        //Añadir el botón al panel de la ventana con determinado tamaño y posición
        getContentPane().add(jButtonMateriales, new AbsoluteConstraints(210, 200, 180, 40));


        jLabel1Fondo.setIcon(new ImageIcon(getClass().getResource("/imagenes/b764d3546a4a6910acb27faf851af2ab.jpg"))); // NOI18N
        jLabel1Fondo.setText("jLabel1");
        getContentPane().add(jLabel1Fondo, new AbsoluteConstraints(0, -1, 600, 650));

        pack();
    }

    private void jButtonEncantamientos(java.awt.event.ActionEvent evt) {
        Encantamientos pantallaEncantamientos = new Encantamientos();
        pantallaEncantamientos.setVisible(true);
        pantallaEncantamientos.setLocationRelativeTo(null);
        this.dispose();
    }

    private void jButtonMateriales(ActionEvent evt) {
        Materiales pantallaMateriales = new Materiales(); //Nuevo objeto del tipo Minerales
        pantallaMateriales.setVisible(true); //Mostrar la ventana de la clase Minerales
        pantallaMateriales.setLocationRelativeTo(null); //Iniciar la ventana en el centro de la pantalla
        this.dispose(); // Cerrar la ventana actual (Interfaz)
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonEncantamientos;
    private javax.swing.JButton jButtonMateriales;
    private javax.swing.JLabel jLabel1Fondo;
}
