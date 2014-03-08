package br.com.iter.horaspj.cliente;

import java.util.ArrayList;
import java.util.List;

import br.com.iter.horaspj.projeto.Projeto;

public class Cliente {
	
	private long id;
	
	private String nome;
	
	private String endereco;
	
	private String telfone;
	
	private String telefoneAlternativo;
	
	private String email;
	
	private String emailAlternativo;
	
	private List<Projeto> projetos = new ArrayList<Projeto>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelfone() {
		return telfone;
	}

	public void setTelfone(String telfone) {
		this.telfone = telfone;
	}

	public String getTelefoneAlternativo() {
		return telefoneAlternativo;
	}

	public void setTelefoneAlternativo(String telefoneAlternativo) {
		this.telefoneAlternativo = telefoneAlternativo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailAlternativo() {
		return emailAlternativo;
	}

	public void setEmailAlternativo(String emailAlternativo) {
		this.emailAlternativo = emailAlternativo;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

}
