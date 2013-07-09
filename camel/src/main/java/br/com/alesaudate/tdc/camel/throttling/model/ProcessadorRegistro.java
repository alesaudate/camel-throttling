package br.com.alesaudate.tdc.camel.throttling.model;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessadorRegistro implements Processor{
	
	
	
	public void process(Exchange exchange) throws Exception {
		String[] dadosEntrada = exchange.getIn().getBody(String.class).split(";");
		Registro dadosSaida = new Registro();
		
		dadosSaida.setId(Long.parseLong(dadosEntrada[0]));
		dadosSaida.setNome(dadosEntrada[1]);
		dadosSaida.setTelefone(dadosEntrada[2]);
		dadosSaida.setEndereco(dadosEntrada[3]);
		dadosSaida.setProfissao(dadosEntrada[4]);
		
		exchange.getIn().setBody(dadosSaida);		
	}
}
