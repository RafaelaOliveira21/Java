package br.edu.fatecfranca.ex0;

public class Diretor extends Funcionario {

	private float valor;
	private String modelo;
	
	public Diretor() {
		super();
	}
	
	public Diretor(float valor, String modelo, int nro, String nome, float salario) {
		super(nro, nome, salario);
		this.valor = valor;
		this.modelo = modelo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Diretor [valor = " + valor + ", modelo = " + modelo + "Salario Final" + calculaSalarioFinal() + "]";
	}
	
	@Override
	public float calculaSalarioFinal() {
		return this.salario + (5 * this.valor/100);
	}
	
		
}
