package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class Rio {

	String nome;
	float nivel;
	boolean poluido;

	public Rio() {

	}

	public Rio(String nome, float nivel, boolean poluido) {
		this.nome = nome;
		this.nivel = nivel;
		this.poluido = poluido;
	}

	public void chover(float x) {
		this.nivel += x;
	}

	public void ensolarar(float x) {
		this.nivel -= x;
	}

	public void limpar() {
		if (this.poluido = false) {
			JOptionPane.showMessageDialog(null, "O rio está limpo");
		}
	}

	public void sujar() {
		if (this.poluido == true) {
			JOptionPane.showMessageDialog(null, "O rio está sujo");
		}
	}

	public void mostrar() {
		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + " | Nível do Rio: " + nivel + "m³ | Poluição: " + poluido);
	}
}
