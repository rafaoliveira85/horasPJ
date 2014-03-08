package br.com.iter.horaspj.diaTrabalhado;

import java.util.Date;

import br.com.iter.horaspj.projeto.Projeto;
import br.com.iter.horaspj.usuario.Usuario;

public class diaTrabalhado {

	private long id;
	
	private Projeto projeto;
	
	private String descricao;
	
	private Usuario usuario;
	
	private Date dia;
	
	private Date primeiroTurnoInicial;
	
	private Date primeiroTurnoFinal;
	
	private Date segundoTurnoInicial;
	
	private Date segundoTurnoFinal;

	private Date terceiroTurnoInicial;
	
	private Date terceiroTurnoFinal;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Date getPrimeiroTurnoInicial() {
		return primeiroTurnoInicial;
	}

	public void setPrimeiroTurnoInicial(Date primeiroTurnoInicial) {
		this.primeiroTurnoInicial = primeiroTurnoInicial;
	}

	public Date getPrimeiroTurnoFinal() {
		return primeiroTurnoFinal;
	}

	public void setPrimeiroTurnoFinal(Date primeiroTurnoFinal) {
		this.primeiroTurnoFinal = primeiroTurnoFinal;
	}

	public Date getSegundoTurnoInicial() {
		return segundoTurnoInicial;
	}

	public void setSegundoTurnoInicial(Date segundoTurnoInicial) {
		this.segundoTurnoInicial = segundoTurnoInicial;
	}

	public Date getSegundoTurnoFinal() {
		return segundoTurnoFinal;
	}

	public void setSegundoTurnoFinal(Date segundoTurnoFinal) {
		this.segundoTurnoFinal = segundoTurnoFinal;
	}

	public Date getTerceiroTurnoInicial() {
		return terceiroTurnoInicial;
	}

	public void setTerceiroTurnoInicial(Date terceiroTurnoInicial) {
		this.terceiroTurnoInicial = terceiroTurnoInicial;
	}

	public Date getTerceiroTurnoFinal() {
		return terceiroTurnoFinal;
	}

	public void setTerceiroTurnoFinal(Date terceiroTurnoFinal) {
		this.terceiroTurnoFinal = terceiroTurnoFinal;
	}

}