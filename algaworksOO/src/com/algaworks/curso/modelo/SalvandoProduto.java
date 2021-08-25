package com.algaworks.curso.modelo;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SalvandoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("produto", Produto.class);
		
		Produto sabonete = new Produto(1L, "sabonete", new BigDecimal("2.30"));
		
		String xml = xstream.toXML(sabonete);
		System.out.println(xml);
		
		try {
			OutputStream os = new FileOutputStream("./produto1.xml");
			xstream.toXML(sabonete, os);
		}catch (Exception e) {
			System.out.println("Não foi possivel salvar o arquivo.");
		}
		
	}

}
