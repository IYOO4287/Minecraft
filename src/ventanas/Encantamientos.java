package ventanas;

import javax.swing.*;
import javax.swing.text.Utilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Encantamientos extends JFrame {
    private static final Logger logger = Logger.getLogger(Encantamientos.class.getName());
    private Map<String, String> descriptionMap;

    public Encantamientos() {
        initComponents();
        initializeDescriptionMap();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Encantamientos().setVisible(true));
    }

    private void initializeDescriptionMap() {
        descriptionMap = new HashMap<>();
        descriptionMap.put("Afinidad acuática (1)", "Sirve para minar más rápido bajo el agua");
        descriptionMap.put("Respiración (1-3)", "puedes respirar más tiempo bajo el agua");
        descriptionMap.put("Espinas (1-3)", "devuelve a los enemigos parte del daño recibido");
        descriptionMap.put("Protección (1-4)", "reduce casi todos los tipos de daño");
        descriptionMap.put("Protección contra explosiones (1-4)", "reduce el retroceso y también el daño que recibes en las explosiones");
        descriptionMap.put("Protección contra fuego (1-4)", "reduce el año por fuego");
        descriptionMap.put("Irrompibilidad (1-3)", "aumenta la durabilidad de los objetos");
        descriptionMap.put("Reparación (1)", "Sirve para reparar los objetos con experiencia");
        descriptionMap.put("Furtivo rápido (1-3)", "Permite ir más rápido mientras se está agachado");
        descriptionMap.put("Agilidad acuática (1-3)", "te mueves más rápido bajo el agua");
        descriptionMap.put("Caída de pluma (1-4)", "recibes menos daño en las caídas");
        descriptionMap.put("Paso Helado (1-2)", "Si caminas sobre el agua se convierte en hielo");
        descriptionMap.put("Velocidad del alma (1-3)", "caminas más rápido sobre arena de almas y tierra de almas");
        descriptionMap.put("Maldición de ligamento (1)", "hace que no sea posible retirar un objeto colocado");
        descriptionMap.put("Maldición de desaparición (1)", "si mueres, el objeto encantado desaparece");
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 650));

        JLabel WindowEnchantTittle = new JLabel("Encantamientos", SwingConstants.CENTER);
        WindowEnchantTittle.setFont(new Font("Segoe UI", Font.BOLD, 30));
        JButton jButtonVolver = new JButton("Volver");
        jButtonVolver.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagenes/arrowBack.png"))));
        jButtonVolver.addActionListener(this::jButtonVolverActionPerformed);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(200, 150, 200, 30);
        ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        comboBox.addItem("Seleccione una opción");
        comboBox.addItem("Casco");
        comboBox.addItem("Peto");
        comboBox.addItem("Grebas");
        comboBox.addItem("Botas");

        JTextArea textArea = new JTextArea(15, 20);

        textArea.setEditable(false);
        textArea.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        textArea.setText("Seleccione una pieza de armadura");
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        setLayout(null);

        WindowEnchantTittle.setBounds(175, 75, 250, 30);
        comboBox.setBounds(200, 150, 200, 30);
        scrollPane.setBounds(100, 225, 400, 350);
        jButtonVolver.setBounds(10, 10, 100, 30);

        add(WindowEnchantTittle);
        add(comboBox);
        add(scrollPane);
        add(jButtonVolver);

        JLabel backgroundEnchants = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().
                getResource("/imagenes/backgroundEnchants.jpg"))));
        backgroundEnchants.setBounds(0, 0, 600, 650);
        add(backgroundEnchants);

        comboBox.addActionListener(e -> {
            String option = (String) comboBox.getSelectedItem();
            String enchantmentInfo;

            switch (option) {
                case "Casco":
                    enchantmentInfo = """
                            Afinidad acuática (1)
                            Respiración (1-3)
                            Espinas (1-3)
                            Protección (1-4)
                            Protección contra explosiones (1-4)
                            Protección contra fuego (1-4)
                            Irrompibilidad (1-3)
                            Reparación (1)
                            Maldición de desaparición (1)
                            Maldición de ligamento (1)
                            """;
                    textArea.setText(enchantmentInfo);
                    break;
                case "Peto":
                    enchantmentInfo = """
                            Espinas (1-3)
                            Protección (1-4)
                            Protección contra explosiones (1-4)
                            Protección contra fuego (1-4)
                            Irrompibilidad (1-3)
                            Reparación (1)
                            Maldición de desaparición (1)
                            Maldición de ligamento (1)
                            """;
                    textArea.setText(enchantmentInfo);
                    break;
                case "Grebas":
                    enchantmentInfo = """
                            Furtivo rápido (1-3)
                            Espinas (1-3)
                            Protección (1-4)
                            Protección contra explosiones (1-4)
                            Protección contra fuego (1-4)
                            Irrompibilidad (1-3)
                            Reparación (1)
                            Maldición de desaparición (1)
                            Maldición de ligamento (1)
                            """;
                    textArea.setText(enchantmentInfo);
                    break;
                case "Botas":
                    enchantmentInfo = """
                            Agilidad acuática (1-3)
                            Caída de pluma (1-4)
                            Espinas (1-3)
                            Protección (1-4)
                            Protección contra explosiones (1-4)
                            Protección contra fuego (1-4)
                            Irrompibilidad (1-3)
                            Reparación (1)
                            Maldición de desaparición (1)
                            Maldición de ligamento (1)
                            Paso Helado (1-2)
                            Velocidad del alma (1-3)
                            """;
                    textArea.setText(enchantmentInfo);
                    break;
                case null:
                    break;
                default:
                    //logger.log(Level.WARNING, "Opción no válida: {0}", option);
            }

        });

        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JTextArea source = (JTextArea) e.getSource();
                int offset = source.viewToModel2D(e.getPoint());
                try {
                    int start = Utilities.getRowStart(source, offset);
                    int end = Utilities.getRowEnd(source, offset);
                    String line = source.getText(start, end - start);

                    if (!line.isBlank()) {
                        String description = descriptionMap.get(line);
                        if (description != null) {
                            Icon icono = new ImageIcon(Objects.requireNonNull(getClass()
                                    .getResource("/imagenes/enchantedBook.png")));
                            JOptionPane.showMessageDialog(
                                    Encantamientos.this, description, line, JOptionPane.INFORMATION_MESSAGE, icono);
                        } else {
                            logger.log(Level.WARNING, "No se encontró una descripción para la línea: {0}", line);
                        }
                    }
                } catch (Exception ex) {
                    logger.log(Level.SEVERE, "Error al mostrar la información del encantamiento", ex);
                }
            }
        });
        pack();
    }

    private void jButtonVolverActionPerformed(ActionEvent evt) {
        this.dispose();
        Interfaz ventanaPrincipal = new Interfaz();
        ventanaPrincipal.setVisible(true);
    }
}
