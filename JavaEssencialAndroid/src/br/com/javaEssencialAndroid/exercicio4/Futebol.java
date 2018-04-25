package br.com.javaEssencialAndroid.exercicio4;

import java.io.Serializable;

/**
 * @author Karen 25 de abr de 2018
 */
public class Futebol implements Serializable {

	private static final long serialVersionUID = 1510538078824059888L;

	private float peso;
	private float altura;
	private int idade;
	private Posicao posicao;

	public static int quantidaGols = 0;

	/**
	 * 
	 */
	public Futebol(float peso, float altura, int idade, Posicao posicao) {
		// TODO Auto-generated constructor stub
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.posicao = posicao;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * @param peso
	 *            the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade
	 *            the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the posicao
	 */
	public Posicao getPosicao() {
		return posicao;
	}

	/**
	 * @param posicao
	 *            the posicao to set
	 */
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	/**
	 * @return the quantidaGols
	 */
	public static int getQuantidaGols() {
		return quantidaGols;
	}

	/**
	 * @param quantidaGols
	 *            the quantidaGols to set
	 */
	public static void setQuantidaGols(int quantidaGols) {
		Futebol.quantidaGols = quantidaGols;
	}

}
