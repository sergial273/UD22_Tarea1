package views;

import javax.swing.*;
import java.awt.*;

public class MenuInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	public JLabel label;
	public JButton anadir, ver, quitar;
	private JPanel mainPanel, buttonPanel;
    
	public MenuInicio() {
        setSize(400, 150);

        
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        
        label = new JLabel("¿Qué acción quieres realizar?");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(label, BorderLayout.CENTER);

        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        
        anadir = new JButton("Añadir");
        ver = new JButton("Ver");
        quitar = new JButton("Quitar");

        
        buttonPanel.add(anadir);
        buttonPanel.add(ver);
        buttonPanel.add(quitar);

        
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        
        add(mainPanel);

	}
}




