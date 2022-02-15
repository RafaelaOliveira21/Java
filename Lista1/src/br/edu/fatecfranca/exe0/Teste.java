package br.edu.fatecfranca.exe0;

public class Teste {

	public static void main(String[] args) {
		// TODO code application logic here
		// criar objeto
		
		Carro obj1 = new Carro("Onix", 2019, 0, false);
		/* obj1.modelo = "Onix";
		obj1.ano = 2019;
		obj1.velocidade = 0;
		obj1.motor = false; */
		
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
		
		Carro obj2 = new Carro("Corsa", 2017, 0, false);
		/* obj2.modelo = "Corsa";
		obj2.ano = 2017;
		obj2.velocidade = 0;
		obj2.motor = false; */
		
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
	
	}
	
}
