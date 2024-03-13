package ventanas;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Encantamientos extends javax.swing.JFrame {
    public Encantamientos() {
        initComponents();
        agregarFondo();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 650));

        // Componentes de la ventana
        JLabel jLabel1 = new JLabel("Encantamientos");
        JLabel jLabel2 = new JLabel("IMAGEN");
        JLabel jLabel3 = new JLabel("ESCRITO");
        JButton jButtonVolver = new JButton("Volver");

        jButtonVolver.addActionListener(this::jButtonVolverActionPerformed);

        setLayout(null);

        // Agregar componentes a la ventana con coordenadas absolutas
        jLabel1.setBounds(250, 20, 150, 30);
        jLabel2.setBounds(50, 100, 100, 100);
        jLabel3.setBounds(300, 100, 250, 100);
        jButtonVolver.setBounds(10, 10, 100, 30);

        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jButtonVolver);

        JLabel jLabel1Fondo = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagenes/backgroundEnchants.jpg"))));
        jLabel1Fondo.setBounds(0, 0, 600, 650);
        add(jLabel1Fondo);

        pack();
    }

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {
        // Cerrar la ventana actual (Encantamientos) y mostrar la ventana principal (Interfaz)
        this.dispose();
        Interfaz ventanaPrincipal = new Interfaz();
        ventanaPrincipal.setVisible(true);
    }

    private void agregarFondo() {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Encantamientos().setVisible(true));
    }
}
