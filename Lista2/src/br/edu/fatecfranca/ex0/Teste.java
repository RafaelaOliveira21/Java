package br.edu.fatecfranca.ex0;

public class Teste {

	public static void main(String[] args) {

		Niver teste1 = new Niver();

		teste1.setDia(3);
		teste1.setDia(80);
		teste1.setDia(-3);

		teste1.setMes("Janeiro");
		teste1.setMes("Outono");
		teste1.setMes("Fevereiro");

		System.out.println("Dia " + teste1.getDia() + " Mes " + teste1.getMes());
	}

	
}
