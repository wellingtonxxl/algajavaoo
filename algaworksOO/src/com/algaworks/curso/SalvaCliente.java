package com.algaworks.curso;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;
import com.algaworks.curso.dao.Cliente;

public class SalvaCliente {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		Cliente cliente = new Cliente();
		
		String nome = JOptionPane.showInputDialog(null, "Nome do cliente", "Cadastro de cliente", JOptionPane.QUESTION_MESSAGE);
		//int codigo = 1;
		
		if (nome != null) {
			cliente.setNome(nome);
			//cliente.setCodigo(codigo);
		
			ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
			clienteDAO.salvar(cliente);
			System.out.println("Cliente salvo com sucesso.");
		}
		
	}

}
