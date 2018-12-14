package br.com.db1start.db1.calculadoraapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1start.db1.calculadoraapi.model.Calculadora;
import br.com.db1start.db1.calculadoraapi.model.Operacao;
import br.com.db1start.db1.calculadoraapi.repository.CalculadoraRepository;

@Service
public class CalculadoraService {

	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	public Calculadora salvaDados(double numeroUm, double numeroDois, Operacao operacao){
		Calculadora calculadora = new Calculadora(numeroUm, numeroDois, operacao);
		calculadoraRepository.save(calculadora);
		return calculadora;	

	}
	
	public List<Calculadora> buscarTodosCalculos(){
		return calculadoraRepository.findAll();
	}
}
