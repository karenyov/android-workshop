package br.com.javaEssencialAndroid.capitulo2;

/**
 * @author Karen 22 de abr de 2018
 */
public class Carro extends Veiculo {

	private int numeroLugares;

	public static int numeroCarros;

	/**
	 * @param v
	 * @param m
	 */
	public Carro(int v, int m, int n) {
		super(v, m);
		// TODO Auto-generated constructor stub
		this.numeroLugares = n;
	}

	void mostrar() {
		super.mostrar();
		System.out.println("Numero de Lugares: " + numeroLugares);
	}

	public void acelerar(int incremento) {
		velocidade = velocidade + incremento;
	}

	/**
	 * @return the numeroCarros
	 */
	public static int getNumeroCarros() {
		return numeroCarros;
	}

}
