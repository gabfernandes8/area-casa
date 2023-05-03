package br.senai.sp.jandira;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AreaCasa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome, resposta, nomeComodo;
		double larg, comp, areaTotal, areaComodo;
		areaComodo = larg * comp;
		
		nome = JOptionPane.showInputDialog("Olá! Qual é o seu nome?");
		
		JOptionPane.showMessageDialog(null, "Certo, " + nome + ", vamos começar!");
		
		System.out.println("Deseja calcular um cômodo? (s/n");
		resposta = teclado.next();
		
		//while (resposta.equals(s)) {
			
			// SALA
			System.out.println("Qual é este cômodo?");
			
			System.out.println("Insira a LARGURA de sua sala: ");
			larg = teclado.nextDouble();
			System.out.println("Agora insira o COMPRIMENTO de sua sala: ");
			comp = teclado.nextDouble();
			
			System.out.println("");
			System.out.println("A área de sua sala é: " +areaComodo+ "m2");
			
			// COZINHA
			System.out.println("");
			System.out.println("Certo! Insira a LARGURA de sua cozinha: ");
			larg = teclado.nextDouble();
			System.out.println("Agora insira o COMPRIMENTO de sua cozinha: ");
			comp = teclado.nextDouble();
		
			System.out.println("");
			System.out.println("A área de sua cozinha é: " +areaComodo+ "m2");
			
		}
		
	}

}
