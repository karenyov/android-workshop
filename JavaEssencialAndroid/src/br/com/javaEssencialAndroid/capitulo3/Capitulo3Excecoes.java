package br.com.javaEssencialAndroid.capitulo3;

/**
 * @author Karen 23 de abr de 2018
 */
public class Capitulo3Excecoes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ola Mundo, AndroidPro!");

		String stringNula = null;

		try {

			System.out.println("Tentando executar...");

			String stringParcial = stringNula.substring(1);

			// A execução será parada antes dessa linha
			System.out.println("String parcial: " + stringParcial);

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		} finally {
			System.out.println("Essa linha sempre será executada");
		}
	}

}
