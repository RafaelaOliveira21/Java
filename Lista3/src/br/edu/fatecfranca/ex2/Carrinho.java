package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import java.util.Date;

public class Carrinho {

	private int codigo;
	private Date data;
	private float valor;
	// vetor de objetos-parte
	private ArrayList<ItemCarrinho> itens;

	public Carrinho() {
		// Inicia o ArrayList
		itens = new ArrayList();

	}

	public Carrinho(int codigo, Date data, float valor, ArrayList<ItemCarrinho> itens) {
		this.codigo = codigo;
		this.data = data;
		this.valor = valor;
		this.itens = itens;

	}

	public Carrinho(int codigo, Date data) {
		this.codigo = codigo;
		this.data = data;
		this.itens = new ArrayList();
		this.valor = 0;
	}

	// TODO criar métodos para adicionar e remover itens do carrinho

	// Pesquisar como adicionar e remover em um ArrayList

	public void addItem(ItemCarrinho item) {
		this.itens.add(item);
		this.valor += this.valor + item.getValor() * item.getQuantidade();
		System.out.println("Item adicionado com sucesso");
	}

	public void removeItem(ItemCarrinho item) {
		if (this.itens.remove(item)) {
			this.valor -= this.valor - item.getValor() * item.getQuantidade();
			System.out.println("Item removido com sucesso");
		} else {
			System.out.println("Item não existe");
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public ArrayList<ItemCarrinho> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemCarrinho> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Carrinho [codigo = " + codigo + ", data = " + data.getDate() + ", valor = " + valor + ", itens = " + itens + "]";
		// chama toString() de cada item
	}

}
