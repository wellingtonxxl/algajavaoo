package com.algaworks.curso.modelo;

import com.algaworks.curso.dao.Cliente;
import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;

public class BuscaPeloCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		Cliente cliente = clienteDAO.buscarPeloCodigo(1L);
		
		if(cliente != null) {
			System.out.println("---------- Cliente encontrado ------");
			System.out.printf("Código: %d\n ", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		}else {
			System.out.println("Nenhum cliente encontrado.");
		}
		
	}

}
