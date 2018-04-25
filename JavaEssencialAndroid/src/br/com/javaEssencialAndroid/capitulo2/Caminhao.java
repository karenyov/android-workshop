package br.com.javaEssencialAndroid.capitulo2;

/**
 * @author Karen 22 de abr de 2018
 */
public class Caminhao extends Veiculo {

	int capacidadeCarga;

	/**
	 * @param v
	 * @param m
	 */
	public Caminhao(int v, int m, int c) {
		super(v, m);
		// TODO Auto-generated constructor stub
		this.capacidadeCarga = c;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("Caminhão: Capacidade de Carga " + this.capacidadeCarga);
	}
}
