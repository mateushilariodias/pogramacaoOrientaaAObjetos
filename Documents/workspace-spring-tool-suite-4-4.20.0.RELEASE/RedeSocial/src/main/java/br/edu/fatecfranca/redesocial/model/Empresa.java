package br.edu.fatecfranca.redesocial.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa {
	
	@Id
	private long id;
	@Column(name="nome")
	private String nome;
	@Column(name="cpf")
	private String cpf; 
	@Column(name="url")
	private String url;
	@Column(name="faturamento")
	private float faturamento;
	@Column(name="nmrFuncionarios")
	private int nmrFuncionarios;
	
	public Empresa() {
		
	}

	public Empresa(long id, String nome, String cpf, String url, float faturamento, int nmrFuncionarios) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.url = url;
		this.faturamento = faturamento;
		this.nmrFuncionarios = nmrFuncionarios;
	}

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public float getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(float faturamento) {
		this.faturamento = faturamento;
	}

	public int getNmrFuncionarios() {
		return nmrFuncionarios;
	}

	public void setNmrFuncionarios(int nmrFuncionarios) {
		this.nmrFuncionarios = nmrFuncionarios;
	}
	
}
