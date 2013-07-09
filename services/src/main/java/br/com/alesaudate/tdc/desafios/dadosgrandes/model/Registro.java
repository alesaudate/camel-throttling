package br.com.alesaudate.tdc.desafios.dadosgrandes.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Registro {

	private Long id;
	
	private String nome;
	
	private String telefone;
	
	private String endereco;
	
	private String profissao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	

	

}
