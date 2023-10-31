package views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Anadir extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel mainPanel;
    private JLabel nombreLabel, apellidoLabel, direccionLabel, dniLabel, fechaLabel;
    public JTextField nombreTextField, apellidoTextField, direccionTextField, dniTextField, fechaTextField;
    public JButton guardarButton, cancelarButton;

    public Anadir() {
        
        setSize(450, 350);

        
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets.left = 10;
        constraints.insets.right = 10;
        constraints.insets.top = 5;
        constraints.insets.bottom = 5;

        
        nombreLabel = new JLabel("Nombre Completo:");
        nombreTextField = new JTextField(25);

        apellidoLabel = new JLabel("Apellido:");
        apellidoTextField = new JTextField(25);

        direccionLabel = new JLabel("Dirección:");
        direccionTextField = new JTextField(25);

        dniLabel = new JLabel("DNI:");
        dniTextField = new JTextField(25);

        fechaLabel = new JLabel("Fecha de Nacimiento (YYYY-MM-DD):");
        fechaTextField = new JTextField(25);

        
        guardarButton = new JButton("Guardar");
        cancelarButton = new JButton("Atras");

        constraints.gridy = 0;
        mainPanel.add(nombreLabel, constraints);
        constraints.gridy = 1;
        mainPanel.add(apellidoLabel, constraints);
        constraints.gridy = 2;
        mainPanel.add(direccionLabel, constraints);
        constraints.gridy = 3;
        mainPanel.add(dniLabel, constraints);
        constraints.gridy = 4;
        mainPanel.add(fechaLabel, constraints);

        constraints.gridy = 0;
        constraints.gridx = 1;
        constraints.gridwidth = GridBagConstraints.REMAINDER; // Extender por toda la fila
        mainPanel.add(nombreTextField, constraints);
        constraints.gridy = 1;
        mainPanel.add(apellidoTextField, constraints);
        constraints.gridy = 2;
        mainPanel.add(direccionTextField, constraints);
        constraints.gridy = 3;
        mainPanel.add(dniTextField, constraints);
        constraints.gridy = 4;
        mainPanel.add(fechaTextField, constraints);

        constraints.gridwidth = 1;
        constraints.gridy = 5;
        mainPanel.add(guardarButton, constraints);
        constraints.gridx = 2;
        mainPanel.add(cancelarButton, constraints);

        add(mainPanel);
    }
}


