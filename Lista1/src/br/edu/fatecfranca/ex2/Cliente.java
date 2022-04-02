package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class Cliente {
	
	int numeroConta, numeroAgencia;
    String nome;
    float saldo;
    
    public Cliente() {

    }
    
    public Cliente(String nome, int numeroAgencia, int numeroConta, float saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public void sacar (float x) {
    	this.saldo -= x;
    }
    
    public void depositar (float x) {
    	this.saldo += x;
    }
    
    public void mostrar () {
    	JOptionPane.showMessageDialog(null, "Número da Agência: " + 
    			this.numeroAgencia + " Número da conta: " 
    			+ this.numeroConta + " Nome: " + this.nome + " Saldo: " 
    			+ this.saldo);
    }
}
