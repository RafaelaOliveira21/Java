package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO code application logic here
		// criar objeto

		Carro obj1 = new Carro("Onix", 2019, 0, false);
		/*
		 * obj1.modelo = "Onix"; obj1.ano = 2019; obj1.velocidade = 0; obj1.motor =
		 * false;
		 */

		// chamar os métodos

		obj1.mostrar();
		obj1.ligar();
		obj1.mostrar();
		obj1.acelerar(40);
		obj1.mostrar();
		obj1.frear(10);
		obj1.mostrar();
		obj1.desligar();
		obj1.mostrar();

		// treinar: crie um obj2 e faça conforme fizemos

		// criar objeto

		String auxModelo = JOptionPane.showInputDialog("Informe o modelo");
		int auxAno = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
		float auxVel = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade"));
		int resp = JOptionPane.showConfirmDialog(null, "Carro está ligado?");
		boolean auxMotor = (resp == JOptionPane.OK_OPTION);		
		Carro obj2 = new Carro(auxModelo, auxAno, auxVel, false);

		/*
		 * obj2.modelo = "Corsa"; obj2.ano = 2017; obj2.velocidade = 0; obj2.motor =
		 * false;
		 */

		// chamar os métodos

		obj2.mostrar();
		obj2.ligar();
		obj2.mostrar();
		obj2.acelerar(60);
		obj2.mostrar();
		obj2.frear(20);
		obj2.mostrar();
		obj2.desligar();
		obj2.mostrar();

		Carro obj3 = new Carro(); // Exemplo de construtor sem parâmetro
		obj3.ano = 2016;
		obj3.modelo = "Onix";

	}
}
