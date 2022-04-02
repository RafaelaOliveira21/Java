package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class TestaCliente {
	
public static void main (String[] args) {
        
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da agência: "));
		int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
		float saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo: "));
	
        Cliente obj1 = new Cliente(nome, numeroAgencia, numeroConta, saldo);
        obj1.mostrar();
        obj1.depositar(200);
        obj1.mostrar();
        obj1.sacar(300);
        obj1.mostrar();
        
        nome = JOptionPane.showInputDialog("Digite o nome: ");
		numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da agência: "));
		numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
		saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo: "));
        
        Cliente obj2 = new Cliente(nome, numeroAgencia, numeroConta, saldo);
        obj2.mostrar();
        obj2.sacar(300);
        obj2.mostrar();
        obj2.depositar(200);;
        obj2.mostrar();
        
    }

}
