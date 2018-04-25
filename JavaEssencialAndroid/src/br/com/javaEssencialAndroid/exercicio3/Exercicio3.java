package br.com.javaEssencialAndroid.exercicio3;

import java.util.ArrayList;

/**
 * @author Karen 23 de abr de 2018
 */
public class Exercicio3 {

	/**
	 * Escreva um programa que adiciona dez Strings em um ArrayList. As Strings
	 * devem ter o seguinte formato: "Elemento - X", onde X é um número entre 1
	 * e 10 e demonstrar a utilização de métodos: add(), remove() e indexOf().
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayList = new ArrayList<>();

		// adicionado elementos
		for (int i = 1; i <= 10; i++) {
			arrayList.add("Elemento - " + i);
		}

		System.out.println("Índice do Elemento 7: " + arrayList.indexOf("Elemento - 7"));
		arrayList.remove(4);
		System.out.println("Índice do Elemento 7: " + arrayList.indexOf("Elemento - 7"));

	}

}
