package br.com.javaEssencialAndroid.capitulo4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Karen 25 de abr de 2018
 */
public class TestaSerializacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Fillipe Cordeiro");
		funcionario.setEndereco("São Paulo - SP");
		funcionario.setCargo(Cargo.CEO);
		try {
			FileOutputStream fileOut = new FileOutputStream("c:\\Users\\karen\\Desktop\\funcionario.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(funcionario);
			System.out.println("Serializando...");
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
