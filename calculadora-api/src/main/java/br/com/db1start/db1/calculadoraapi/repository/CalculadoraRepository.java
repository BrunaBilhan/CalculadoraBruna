package br.com.db1start.db1.calculadoraapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1start.db1.calculadoraapi.model.Calculadora;

public interface CalculadoraRepository extends JpaRepository<Calculadora, Double>{
	
}
