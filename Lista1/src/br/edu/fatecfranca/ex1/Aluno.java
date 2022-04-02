package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class Aluno {

	int numeroAluno, idades;
    String nomes;
    float prova1, prova2, notaFinal;
    
    public Aluno() {
        
    }
    
    public Aluno(String nome, int numero, int idade, float p1, float p2) {
        this.nomes = nome;
        this.numeroAluno = numero;
        this.idades = idade;
        this.prova1 = p1;
        this.prova2 = p2;
    }
    
    public float notaFinal() {
    	return (this.prova1 + this.prova2) / 2;
    }
    
    public void dadosAluno() {
    	
        JOptionPane.showMessageDialog(null, "Número do Aluno: " 
        		+ this.numeroAluno + " Nome: " + this.nomes +
                " Idade: " + this.idades + " anos.");
    }
    
    // Operador Ternário
    
    public String passou() {
    	
        return (this.notaFinal() >= 6 ) ? "Aprovado" : "Reprovado";
        
    }
}
