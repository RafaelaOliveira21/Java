package br.edu.fatecfranca.ex2;

public class ItemCarrinho {

	private int codigo;
	private String descricao;
	private float valor;
	private int quantidade;

	public ItemCarrinho() {

	}

	public ItemCarrinho(int codigo, String descricao, float valor, int quantidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override // avisa que o método
	// herdado está sendo anulado
	public String toString() { //paraString
		
		return "ItemCarrinho (" + "código=" + codigo + ", "
				+ "descricao=" + descricao + ", valor=" + valor + ", quantidade=" + quantidade + ")";
	}

}
