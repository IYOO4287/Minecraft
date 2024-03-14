package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;
import static java.awt.Font.BOLD;

public class Encantamientos extends JFrame {
    public Encantamientos() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 650));

        JLabel WindowEnchantTittle = new JLabel("Encantamientos", SwingConstants.CENTER);
        WindowEnchantTittle.setFont(new Font("Segoe UI", BOLD, 30));
        JButton jButtonVolver = new JButton("Volver");
        jButtonVolver.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagenes/arrowBack.png"))));
        jButtonVolver.addActionListener(this::jButtonVolverActionPerformed);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Seleccione una opción");
        comboBox.addItem("Casco");
        comboBox.addItem("Peto");
        comboBox.addItem("Grebas");
        comboBox.addItem("Botas");

        JTextArea textArea = new JTextArea(10, 20);
        textArea.setEditable(false);
        textArea.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        textArea.setText("Seleccione una pieza de armadura");
        JScrollPane scrollPane = new JScrollPane(textArea);

        setLayout(null);

        WindowEnchantTittle.setBounds(175, 75, 250, 30);
        comboBox.setBounds(200, 150, 200, 30);
        scrollPane.setBounds(100, 250, 400, 300);
        jButtonVolver.setBounds(10, 10, 100, 30);

        add(WindowEnchantTittle);
        add(comboBox);
        add(scrollPane);
        add(jButtonVolver);

        JLabel backgroundEnchants = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagenes/backgroundEnchants.jpg"))));
        backgroundEnchants.setBounds(0, 0, 600, 650);
        add(backgroundEnchants);

        comboBox.addActionListener(e -> {
            String option = (String) comboBox.getSelectedItem();
            switch (option) {
                case "Casco":
                    textArea.setText("""
                            Afinidad acuática (1)
                            Respiración (1-3)
                            Espinas(1-3)
                            Protección(1-4)
                            Protección contra explosiones(1-4)
                            Protección contra fuego(1-4)
                            Irrompibilidad(1-3)
                            Reparación(1)
                            """);
                    break;
                case "Peto":
                    textArea.setText("""
                            Espinas(1-3)
                            Protección(1-4)
                            Protección contra explosiones(1-4)
                            Protección contra fuego(1-4)
                            Irrompibilidad(1-3)
                            Reparación(1)
                            """);
                    break;
                case "Grebas":
                    textArea.setText("""
                            Furtivo rápido(1-3)
                            Espinas(1-3)
                            Protección(1-4)
                            Protección contra explosiones(1-4)
                            Protección contra fuego(1-4)
                            Irrompibilidad(1-3)
                            Reparación(1)
                            """);
                    break;
                case "Botas":
                    textArea.setText("""
                            Agilidad acuática(1-3)
                            Caida de pluma(1-4)
                            Espinas(1-3)
                            Protección(1-4)
                            Protección contra explosiones(1-4)
                            Protección contra fuego(1-4)
                            Irrompibilidad(1-3)
                            Reparación(1)
                            """);
                    break;
                case null:
                    break;
                default:
                    textArea.setText("Seleccione una pieza de armadura");
            }
        });

        pack();
    }

    private void jButtonVolverActionPerformed(ActionEvent evt) {
        // Cerrar la ventana actual (Encantamientos) y mostrar la ventana principal (Interfaz)
        this.dispose();
        Interfaz ventanaPrincipal = new Interfaz();
        ventanaPrincipal.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Encantamientos().setVisible(true));
    }
}
