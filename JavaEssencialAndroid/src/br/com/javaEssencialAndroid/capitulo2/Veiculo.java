package br.com.javaEssencialAndroid.capitulo2;

/**
 * @author Karen 22 de abr de 2018
 */
public class Veiculo implements IVeiculo {

	int velocidade = 0;
	int marcha = 1;

	public Veiculo(int v, int m) {
		velocidade = v;
		marcha = m;
	}

	public void trocarMarcha(int novaMarcha) {
		marcha = novaMarcha;
	}

	public void acelerar(int incremento) {
		velocidade = velocidade + incremento;
	}

	void mostrar() {
		System.out.println("Velocidade: " + velocidade + " Marcha: " + marcha);
	}

	/**
	 * @return the velocidade
	 */
	public int getVelocidade() {
		return velocidade;
	}

	/**
	 * @param velocidade
	 *            the velocidade to set
	 */
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	/**
	 * @return the marcha
	 */
	public int getMarcha() {
		return marcha;
	}

	/**
	 * @param marcha
	 *            the marcha to set
	 */
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

}
