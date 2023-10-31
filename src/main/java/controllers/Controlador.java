package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import connexion.Connector;
import models.Cliente;
import views.Anadir;
import views.MenuInicio;
import views.Quitar;
import views.Ver;

public class Controlador implements ActionListener {
	
	private MenuInicio menu;
	private Cliente cliente;
	private Anadir anadir;
	private Ver ver;
	private Connector connector;
	private Quitar quitar;
	
	public Controlador(MenuInicio menu, Cliente cliente, Anadir anadir, Ver ver, Connector connector, Quitar quitar){
		this.cliente = cliente;
		this.menu = menu;
		this.anadir = anadir;
		this.ver = ver;
		this.connector = connector;
		this.quitar = quitar;
		this.menu.anadir.addActionListener(this);
		this.menu.ver.addActionListener(this);
		this.menu.quitar.addActionListener(this);
		this.anadir.guardarButton.addActionListener(this);
		this.anadir.cancelarButton.addActionListener(this);
		this.ver.guardarButton.addActionListener(this);
		this.ver.cancelarButton.addActionListener(this);
		this.quitar.cancelarButton.addActionListener(this);
		this.quitar.guardarButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(menu.anadir == e.getSource()) {
			menu.setVisible(false);
			iniciarVistaAnadir();
			
		}
		else if(menu.ver == e.getSource()) {
			menu.setVisible(false);
			iniciarVistaVer();
		}
		else if(menu.quitar == e.getSource()) {
			menu.setVisible(false);
			iniciarVistaQuitar();
		}
		else if(anadir.guardarButton== e.getSource()) {
			anadirValor();
		}
		else if(ver.guardarButton== e.getSource()) {
			mostrarValor();
			
		}
		else if(quitar.guardarButton== e.getSource()) {
			quitarValor();
			
		}
		else if(anadir.cancelarButton == e.getSource() || ver.cancelarButton == e.getSource() || quitar.cancelarButton == e.getSource()) {
			//cambiar visibilidades
			anadir.setVisible(false);
			ver.setVisible(false);
			quitar.setVisible(false);
			menu.setVisible(true);
		}
	}
	
	public void iniciarVista() {
		menu.setTitle("Menu inicio");
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
	}
	
	public void iniciarVistaAnadir() {
		anadir.setTitle("Anadir");
		anadir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		anadir.setLocationRelativeTo(null);
		anadir.setVisible(true);
	}
	
	public void iniciarVistaVer() {
		ver.setTitle("Ver");
		ver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ver.setLocationRelativeTo(null);
		ver.setVisible(true);
	}
	
	public void iniciarVistaQuitar() {
		quitar.setTitle("Quitar");
		quitar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quitar.setLocationRelativeTo(null);
		quitar.setVisible(true);
	}
	
	public void mostrarValor() {
		cliente = connector.leer(ver.nombreTextField.getText());
		if (cliente != null) {
			ver.apellidoTextField.setText(cliente.toString());
		}
		else {
			JOptionPane.showMessageDialog(null, "El elemento no se encuentra en la base de datos",
				      "Error", JOptionPane.ERROR_MESSAGE);
		}
	    
	}
	
	public void anadirValor() {

		boolean podido = connector.escribir(anadir.nombreTextField.getText(), anadir.apellidoTextField.getText(), anadir.direccionTextField.getText(), anadir.dniTextField.getText(), anadir.fechaTextField.getText());
		
		if (podido) {
			JOptionPane.showMessageDialog(null, "Values added successfully",
				      "Ok", JOptionPane.DEFAULT_OPTION);
		}
		else {
			JOptionPane.showMessageDialog(null, "Error en los campos de los datos",
				      "Error", JOptionPane.ERROR_MESSAGE);
		}
	    
	}
	
	public void quitarValor() {
		boolean podido =  connector.quitar(quitar.nombreTextField.getText());
		if (podido) {
			JOptionPane.showMessageDialog(null, "Client deleted successfully",
				      "Ok", JOptionPane.DEFAULT_OPTION);
		}
		else {
			JOptionPane.showMessageDialog(null, "Error en los campos de los datos",
				      "Error", JOptionPane.ERROR_MESSAGE);
		}
	    
	}
}
