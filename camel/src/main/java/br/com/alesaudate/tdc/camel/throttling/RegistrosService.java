package br.com.alesaudate.tdc.camel.throttling;

import javax.jws.WebService;

import br.com.alesaudate.tdc.camel.throttling.model.Registro;

@WebService(serviceName = "RegistrosServiceImplService", portName = "RegistrosServiceImplPort", targetNamespace="http://dadosgrandes.desafios.tdc.alesaudate.com.br/")
public interface RegistrosService {

	public void adicionarRegistro(Registro registro);

}
