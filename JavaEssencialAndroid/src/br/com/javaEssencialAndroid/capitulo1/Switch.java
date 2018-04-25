package br.com.javaEssencialAndroid.capitulo1;

/**
 * @author Karen 21 de abr de 2018
 */
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diaDaSemana = 1;
		String diaString = "";

		switch (diaDaSemana) {
		case 1:
			diaString = "Segunda-feira";
			break;
		case 2:
			diaString = "Terça-feira";
			break;
		case 3:
			diaString = "Quarta-feira";
			break;
		case 4:
			diaString = "Quinta-feira";
			break;
		case 5:
			diaString = "Sexta-feira";
			break;
		default:
			break;
		}
		System.out.println(diaString);
	}

}
