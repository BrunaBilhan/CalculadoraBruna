package br.com.db1start.db1.calculadoraapi.model;

public enum Operacao {
	
	SOMA {
		@Override
		public double calculaOperacao(double num1, double num2) {
			return num1 + num2;
		}
	},
	SUBTRACAO {
		@Override
		public double calculaOperacao(double num1, double num2) {
			return num1 - num2;
		}
	},
	MULTIPLICACAO {
		@Override
		public double calculaOperacao(double num1, double num2) {
			return num1 * num2;
		}
	},
	DIVISAO {
		@Override
		public double calculaOperacao(double num1, double num2) {
			return num1 / num2;
		}
	};
	
	public abstract double calculaOperacao(double num1, double num2);

}
