package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class TestaAluno {

	public static void main(String[] args) {

		String auxNome = JOptionPane.showInputDialog("Nome: ");
		int auxNumeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Número do aluno:"));
		int auxIdade = Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno:"));
		float auxP1 = Integer.parseInt(JOptionPane.showInputDialog("Nota da Prova 1:"));
		float auxP2 = Integer.parseInt(JOptionPane.showInputDialog("Nota da Prova 2:"));

		Aluno obj1 = new Aluno(auxNome, auxNumeroAluno, auxIdade, auxP1, auxP2);
		obj1.dadosAluno();
		obj1.notaFinal();
		obj1.passou();

		auxNome = JOptionPane.showInputDialog("Nome: ");
		auxNumeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Número do aluno:"));
		auxIdade = Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno:"));
		auxP1 = Integer.parseInt(JOptionPane.showInputDialog("Nota da Prova 1:"));
		auxP2 = Integer.parseInt(JOptionPane.showInputDialog("Nota da Prova 2:"));

		Aluno obj2 = new Aluno(auxNome, auxNumeroAluno, auxIdade, auxP1, auxP2);
		obj2.dadosAluno();
		obj2.notaFinal();
		obj2.passou();
	}

}
