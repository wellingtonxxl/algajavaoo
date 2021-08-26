package com.algaworks.curso.modelo;

import java.util.List;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.Cliente;
import com.algaworks.curso.dao.DAOFactory;

public class BuscaTodosClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		List<Cliente> clientes = clienteDAO.buscarTodos();
		
		
		for(Cliente cliente: clientes) {
			System.out.println("---------- Cliente encontrado ------");
			//System.out.printf("Código: %d\n ", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		}
		
	}

}
