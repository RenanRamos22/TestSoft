package br.edu.up.testeequalidesoft.servico;

import java.util.Scanner;

public class Delta {

	Object[] result = new Object[3];
	Scanner read = new Scanner(System.in);




	double delta, x1, x2;
	
	public  Delta() { 
	
		//inputDados();
		
		return; 
	}
	
	

	private void inputDados() {
		// TODO Auto-generated method stub
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Digite o  valor de A, B e C respectivamente: "); int a =
		 * Integer.parseInt(input.next()); int b = Integer.parseInt(input.next()); int c
		 * = Integer.parseInt(input.next());
		 */
	   // deltaCalculo(a,b,c);
	 //   return;
	}



	public void setInput(Object[] input) {
		int a = (int) input[0];
		int b = (int) input[1];
		int c = (int) input[2];
		deltaCalculo(a,b,c);
	}

	public Object[] getResultHypot() {
		return result;
	}

	public void deltaCalculo(int a, int b, int c) {
		

		delta = (b * b) + (-4 * (a * c));
		result[0] = delta;

		System.out.println("Delta: " + delta);

		if (delta >= 0) { 
			calculaX(a,b,c); 
		} 
		else {
			System.out.println("Delta não possui raiz!"); //System.exit(0);

		}

	}

	private void calculaX(int a, int b, int c) {

		x1 = (double) ((-(b) + Math.sqrt(delta)) / 2 *a);
		x2 = (double) ((-(b) - Math.sqrt(delta)) / 2 *a);

		System.out.println("x1 = " + x1); 
		System.out.println("x2 = " + x2);
		System.out.println("---------------------");
		result[1] = x1;
		result[2] = x2;
		
		return;
		
	}





	

}
