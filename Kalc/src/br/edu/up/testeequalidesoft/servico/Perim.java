package br.edu.up.testeequalidesoft.servico;


import java.util.Scanner;

public class Perim {
	Scanner read = new Scanner(System.in);
	 
	 Calcula cal = new Calcula();
	
	 int qtdLados;
	 double[] lados;
	 double perimetro;
	 
	public Perim() {
		
		qtdLados = 0;
		lerLados();
		
	}

	private void lerLados() {
		// TODO Auto-generated method stub
		
		System.out.println("Digite a quantidade de lados do poligono:");
		qtdLados = read.nextInt();
		lados = new double[qtdLados];
		
		for(int i = 0;i < qtdLados;i++) {
			System.out.println("digite o tamaho da reta " +i);
			lados[i] = read.nextDouble();
			
		}
	}
}
