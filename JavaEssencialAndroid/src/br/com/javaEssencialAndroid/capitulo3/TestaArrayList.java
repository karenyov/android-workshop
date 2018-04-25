package br.com.javaEssencialAndroid.capitulo3;

import java.util.ArrayList;

/**
 * @author Karen 23 de abr de 2018
 */
public class TestaArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criar uma lista
		ArrayList<String> androidList = new ArrayList<String>();
		// Adicionando elementos
		androidList.add("Donut");
		androidList.add("Eclair");
		androidList.add("Froyo");
		androidList.add("Gingerbread");
		androidList.add("Honeycomb");
		androidList.add("Ice Cream Sandwich");
		androidList.add("Jelly Bean");
		System.out.println("Tamanho da ArrayList: " + androidList.size());
		// Mostra o conteúdo da lista
		System.out.println("O ArrayList tem os seguintes elementos: " + androidList);
		// Remove elementos da lista
		System.out.println("Excluindo o segundo elemento...");
		androidList.remove(3);
		System.out.println("Tamanho após eliminações: " + androidList.size());
		System.out.println("Conteúdo após eliminações: " + androidList);

	}

}
