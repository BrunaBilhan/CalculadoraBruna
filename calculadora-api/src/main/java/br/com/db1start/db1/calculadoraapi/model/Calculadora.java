package br.com.db1start.db1.calculadoraapi.model;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calculadora")
public class Calculadora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Column(name = "numeroUm", nullable = false, length = 50)
	private double numeroUm;
	
	@Column(name = "numeroDois", nullable = false, length = 50)
	private double numeroDois;
	
	@Column(name = "resultado", nullable = false, length = 50)
	private double resultado;
	
	@Column(name = "data", nullable = false)
	private LocalDateTime date;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name = "operacao", nullable = false)
	private Operacao operacao;

	protected Calculadora()	{
		
	}
	
	public Calculadora(double numeroUm, double numeroDois, Operacao operacao) {
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
		this.operacao = operacao;
		this.calcula();
		this.date = LocalDateTime.now();
		
	}

	public Double getNumeroUm() {
		return this.numeroUm;
		
	}
	
	
	public Double getNumeroDois() {
		return this.numeroDois;
		
	}
	
	public Operacao getOperacao() {
		return operacao;
		
	}
	
	public LocalDateTime getDate(){
		return date;
		
	}
	
	public double getResultado() {
		return resultado;
		
	}
	
	public void calcula() {
		resultado = operacao.calculaOperacao(numeroUm, numeroDois);
	}
}

	