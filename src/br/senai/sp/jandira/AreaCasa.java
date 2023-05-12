package br.senai.sp.jandira;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AreaCasa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String resposta, nomeComodo;
		double larg, comp, areaTotal, areaComodo;
		areaComodo = larg * comp;
		
		System.out.println("***************************");
		System.out.println("DESCUBRA A ÁREA DE SUA CASA");
		System.out.println("***************************");

		System.out.println("Deseja calcular um cômodo? (s/n");
		resposta = teclado.next();

		for (; resposta.equals("s");) {

			System.out.println("Qual é o nome deste cômodo?");
			nomeComodo = teclado.next();

			System.out.println("Insira a LARGURA de " + nomeComodo+ ".");
			larg = teclado.nextDouble();
			System.out.println("Agora, insira o COMPRIMENTO de " +nomeComodo+ ".");
			comp = teclado.nextDouble();
			
			System.out.println("");
			System.out.println("Certo! A área deste cômodo é de: " + areaComodo + "m2");
		}
		
		System.out.println("Deseja adicionar mais um cômodo?");
		
		if (resposta.equals("s")) {
			
			System.out.println("Qual é este cômodo?");
			nomeComodo = teclado.next();

			System.out.println("Insira a LARGURA de " + nomeComodo+ ".");
			larg = teclado.nextDouble();
			System.out.println("Agora insira o COMPRIMENTO de " +nomeComodo+ ".");
			comp = teclado.nextDouble();

			System.out.println("");
			System.out.println("A área deste cômodo é de: " + areaComodo + "m2");
		
			resposta = teclado.next();
			
		} else {
			System.out.println("A área total da sua casa é: " +areaTotal+ ".");
			
		}

	}

}
