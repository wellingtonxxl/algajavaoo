package com.algaworks.curso.joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		JOptionPane.showMessageDialog(null, "Vamo que vamo!");
	}
}
