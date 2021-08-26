package com.algaworks.curso.dao;

import java.util.List;

public interface ClienteDAO {

	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(long codigo);

	public List<Cliente> buscarTodos();
	
}
