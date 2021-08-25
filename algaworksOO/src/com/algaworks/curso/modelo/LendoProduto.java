package com.algaworks.curso.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LendoProduto {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		
        xstream.allowTypes(new Class[]{Produto.class}); //Tratando Exception ForbiddenClassException


		Produto p = (Produto) xstream.fromXML(new FileInputStream("/home/wellington-o2b/eclipse-workspace/produto1.xml"));
		System.out.println(p.getCodigo());
		System.out.println(p.getDescricao());
		System.out.println(p.getValor());
	}

}
