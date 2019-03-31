package br.edu.up.testeequalidesoft.servico;

import java.util.Scanner;

public class Delta {
	 Scanner read = new Scanner(System.in);
	 
	 Calcula cal = new Calcula();
	 
	   
	    double delta, x1, x2;
	 
	    public Delta(int a, int b, int c) {
	        deltaCalculo(a,b,c);
	        return;
	    }

		private void deltaCalculo(int a, int b, int c) {
			
			
	 
	        delta = (b * b) + (-4 * (a * c));
	 
	        System.out.println("Delta: " + delta);
	 
	        if (delta >= 0) {
	            calculaX(a,b,c);
	        } else {
	            System.out.println("Delta não possui raiz!");
	            //System.exit(0);
	            
	        }
			
		}

		private void calculaX(int a, int b, int c) {
			x1 = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
	        x2 = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);
	 
	        System.out.println("x1 = " + x1);
	        System.out.println("x2 = " + x2);
	        System.out.println("---------------------");
	        
	        cal.escolha();
		}
}
