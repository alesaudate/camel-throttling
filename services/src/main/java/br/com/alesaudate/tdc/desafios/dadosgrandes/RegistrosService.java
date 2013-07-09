package br.com.alesaudate.tdc.desafios.dadosgrandes;

import javax.jws.WebService;

import br.com.alesaudate.tdc.desafios.dadosgrandes.model.Registro;


@WebService
public interface RegistrosService {
	
	public void adicionarRegistro (Registro registro);
	
}
