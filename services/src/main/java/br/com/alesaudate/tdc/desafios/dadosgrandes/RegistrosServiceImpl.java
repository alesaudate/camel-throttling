package br.com.alesaudate.tdc.desafios.dadosgrandes;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.alesaudate.tdc.desafios.dadosgrandes.model.Registro;


@WebService
public class RegistrosServiceImpl implements RegistrosService{

	
	public void adicionarRegistro (Registro registro) {
		System.out.println("Registro " + registro.getId() + " recebido.");
	}
	
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8090/servico", new RegistrosServiceImpl());

	}

}
