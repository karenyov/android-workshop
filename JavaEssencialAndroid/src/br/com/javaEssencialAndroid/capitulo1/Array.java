package br.com.javaEssencialAndroid.capitulo1;

/**
 * @author Karen 21 de abr de 2018
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Alocar mem�ria para 5 inteiros
		int[] umArray;
		umArray = new int[5];
		// inicializa elementos
		umArray[0] = 10;
		umArray[1] = 20;
		umArray[2] = 30;
		umArray[3] = 40;
		umArray[4] = 50;
		System.out.println("Valor no �ndice 0: " + umArray[0]);
		System.out.println("Valor no �ndice 1: " + umArray[1]);
		System.out.println("Valor no �ndice 2: " + umArray[2]);
		System.out.println("Valor no �ndice 3: " + umArray[3]);
		System.out.println("Valor no �ndice 4: " + umArray[4]);

	}

}
