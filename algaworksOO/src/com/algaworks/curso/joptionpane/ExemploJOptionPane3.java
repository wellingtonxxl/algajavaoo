package com.algaworks.curso.joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

		Object[] opcoes = {"Sim", "Não", "Sim, com e-email"};
		
		int opcao = JOptionPane.showOptionDialog(null, "Você gostaria de finalizar o cadastro?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);
		
		System.out.println("Opção selecionada: "+opcao);
		
		if (opcao == 1) {
			// lógica ...
		}
	}

}
