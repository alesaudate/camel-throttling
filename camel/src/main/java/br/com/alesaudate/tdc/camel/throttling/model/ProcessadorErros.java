package br.com.alesaudate.tdc.camel.throttling.model;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessadorErros implements Processor{

	@Override
	public void process(Exchange arg0) throws Exception {
		Exception in = arg0.getIn().getBody(Exception.class);
		System.out.println(in);
		
	}
	

}
