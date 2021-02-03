package br.com.criscorp.hello.model;

public class Produto {
	private int 	id;
	private String 	descricao;
	private double 	preco;
	private int 	qtEstoque;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtEstoque() {
		return qtEstoque;
	}
	public void setQtEstoque(int qtEstoque) {
		this.qtEstoque = qtEstoque;
	}

}
