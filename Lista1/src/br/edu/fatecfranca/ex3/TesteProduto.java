package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class TesteProduto {
	
	public static void main(String[] args) {
		// TODO code application logic here
		// criar objeto 
		
		int auxId = Integer.parseInt(JOptionPane.showInputDialog("Informe o Id: "));
		int auxQtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
		String auxDescricao = JOptionPane.showInputDialog("Informe a descrição:");
		float auxPreco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço:"));
		
		Produto obj1 = new Produto(auxId, auxQtde, auxDescricao, auxPreco);
		
        obj1.mostrar();
        obj1.comprar(15);
        obj1.mostrar();
        obj1.vender(7);
        obj1.mostrar();
        obj1.subir(5);
        obj1.mostrar();
        obj1.descer(2);
        obj1.mostrar();
        
        auxId = Integer.parseInt(JOptionPane.showInputDialog("Informe o Id: "));
		auxQtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
		auxDescricao = JOptionPane.showInputDialog("Informe a descrição:");
		auxPreco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço:"));
        
        Produto obj2 = new Produto(auxId, auxQtde, auxDescricao, auxPreco);
        obj2.mostrar();
        obj2.comprar(3);
        obj2.mostrar();
        obj2.vender(1);
        obj2.mostrar();
        obj2.subir(2);
        obj2.mostrar();
        obj2.descer(1);
        obj2.mostrar();
	}
	
	

}
