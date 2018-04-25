package br.com.javaEssencialAndroid.capitulo3;

import java.util.HashSet;

/**
 * @author Karen 23 de abr de 2018
 */
public class TestaHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criação de um HashSet
		HashSet<String> androidHash = new HashSet<>();
		// Adcionando elementos
		androidHash.add("Eclair");
		androidHash.add("Eclair");
		androidHash.add("Gingerbread");
		androidHash.add("Gingerbread");
		androidHash.add("Honeycomb");
		androidHash.add("Ice Cream Sandwich");
		androidHash.add("Jelly Bean");
		androidHash.add("Jelly Bean");

		System.out.println("O conteúdo do HashSet:" + androidHash);
	}

}
