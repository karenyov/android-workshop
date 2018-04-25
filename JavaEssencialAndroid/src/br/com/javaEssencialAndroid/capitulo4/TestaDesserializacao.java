package br.com.javaEssencialAndroid.capitulo4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Karen 25 de abr de 2018
 */
public class TestaDesserializacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();

		try {

			FileInputStream fileIn = new FileInputStream("c:\\Users\\karen\\Desktop\\funcionario.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			funcionario = (Funcionario) in.readObject();
			in.close();

		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Classe Funcionario não foi encontrada.");
			c.printStackTrace();
			return;
		} finally {
			if (funcionario instanceof Funcionario) {
				System.out.println("----------------");
				System.out.println("Desserializado objeto funcionario...");
				System.out.println("Nome: " + funcionario.getNome());
				System.out.println("Endereço: " + funcionario.getEndereco());
				System.out.println("Cargo: " + funcionario.getCargo());
				System.out.println("----------------");
			}
		}

	}

}
