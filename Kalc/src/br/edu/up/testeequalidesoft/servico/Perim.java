package br.edu.up.testeequalidesoft.servico;


import java.util.Scanner;

public class Perim {
	Scanner read = new Scanner(System.in);
	 
	 Calcula cal = new Calcula();
	
	 int qtdLados = 0;
	 double[] lados;
	 
	 double perimetro;
	 


	public double Perim(int qtdLados, double[] lados) {
		
		
		lerLados(qtdLados,lados);
		somaPerim();
		return perimetro;
	}

	private void somaPerim() {
		// TODO Auto-generated method stub
		
		for(double lado : lados) {
			perimetro += lado;
		}
		
		//System.out.println("O Perimetro é igual a:"+ perimetro);
	
		
	}

	public void lerLados(int qtdLados, double[] lados) {
		// TODO Auto-generated method stub
		/*
		System.out.println("Digite a quantidade de lados do poligono:");
		qtdLados = read.nextInt();
		lados = new double[qtdLados];
		
		for(int i = 0;i < qtdLados;i++) {
			System.out.println("digite o tamaho da reta " +i);
			lados[i] = read.nextDouble();
			
		}*/
		setQtdLados(qtdLados);
		setLados(lados);
				
	}
	public int getQtdLados() {
		return qtdLados;
	}

	public void setQtdLados(int qtdLados) {
		this.qtdLados = qtdLados;
		
		
	}

	public double[] getLados() {
		return lados;
	}

	public void setLados(double[] lados) {
		this.lados = lados;
		//somaPerim();
	}

	public double getPerimetro() {
		return perimetro;
	}

	
}
