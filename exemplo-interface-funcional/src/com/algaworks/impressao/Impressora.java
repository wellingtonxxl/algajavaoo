package com.algaworks.impressao;

import com.algaworks.compra.Compra;

@FunctionalInterface
public interface Impressora {

	//Interface com apenas um método é chamada de interface funcional
	void imprimir(Compra c);
}
