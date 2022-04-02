package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class TestaRio {
	
    public static void main(String[] args) {
    	
    	String nome = JOptionPane.showInputDialog("Digite o nome: ");
    	float nivel = Float.parseFloat(JOptionPane.showInputDialog("Digite o nível: "));
    	int resposta = JOptionPane.showConfirmDialog(null, "O rio está poluído? ");
    	boolean poluido = resposta == JOptionPane.OK_OPTION ;
        
        Rio obj1 = new Rio(nome, nivel, poluido);
        obj1.chover(0);
        obj1.mostrar();
        obj1.sujar();
        
        nome = JOptionPane.showInputDialog("Digite o nome: ");
    	nivel = Float.parseFloat(JOptionPane.showInputDialog("Digite o nível: "));
    	resposta = JOptionPane.showConfirmDialog(null, "O rio está poluído? ");
    	poluido = resposta == JOptionPane.OK_OPTION ;

        Rio obj2 = new Rio(nome, nivel, poluido);
        obj2.chover(0);
        obj2.mostrar();
        obj2.limpar();
    }
}
