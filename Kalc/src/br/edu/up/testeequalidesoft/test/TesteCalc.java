package br.edu.up.testeequalidesoft.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.core.Is;
import org.junit.Test;

import br.edu.up.testeequalidesoft.servico.Calcula;
import br.edu.up.testeequalidesoft.servico.Delta;


public class TesteCalc {
	
	@Test
	public void deveriaCalcular() {
		
		deveriaSomar();
		deveriaSubtrair();
		deveriaMultiplicar();
		deveriaDividir();
		deveriaCalcularUmNumElevadoaPotencia();
		deveriaCalcularRaizQuadrada();
		deveriaCalcularEquacaoDoSegundoGrau();
		//deveriaCalcularPerimetroPoligono();
		//deveriaCalcularHipotenusaTrianguloRetangulo();
	}
	
	
	private void deveriaCalcularEquacaoDoSegundoGrau() {
		// TODO Auto-generated method stub
		    
			Delta result = new Delta();
		    
			//double result = 0;
			//Calcula c = new Calcula();
			
			Object[] input = new Object[3];
			input[0]= 10;
			input[1]= 10;
			input[2]= 2;
			Object[] prova = new Object[3];
			
			try {
				 
			result.setInput(input);
				 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			 prova = result.getResultHypot();
			 
			Integer a= (Integer) input[0];
			Integer b= (Integer) input[1];
			Integer ce=  (Integer) input[2];
			Double x = (Double) prova[1];
			
			double r = ((a*(x*x))+((b*x)+(ce)));
			
			System.out.println(r+""+""+x);
			//assertEquals(true, );
	}


	private void deveriaCalcularRaizQuadrada() {
		// TODO Auto-generated method stub
		double result = 0;
		
		int input = 2;
		
		Calcula c = new Calcula();
		
		try {
			 
			 result =  c.raiz(input);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		int compara = (int) (result*result);
		System.out.println("A raiz Quadrada de "+input +" é: " + result);
		assertThat(input, is(compara));
	}

	private void deveriaCalcularUmNumElevadoaPotencia() {
		// TODO Auto-generated method stub
		int result = 0;
		Calcula c = new Calcula();
		
		try {
			 
			 result = c.pot(2, 2);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("resultado da Potenciação: "+ result);
		assertThat(result, is(4));
	}

	private void deveriaDividir() {
		// TODO Auto-generated method stub
		double result = 0;
		Calcula c = new Calcula();
		
		try {
			 
			 result = c.div(3, 0);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("resultado da divisão é: "+ result);
		assertThat(result, is(1.5));
	}

	private void deveriaMultiplicar() {
		// TODO Auto-generated method stub
		
		int result = 0;
		Calcula c = new Calcula();
		
		try {
			 
			 result = c.mult(2, 2);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("resultado da multiplicação é: "+result);
		assertThat(result, is(4));
	}

	private void deveriaSubtrair() {
		// TODO Auto-generated method stub
		int result = 0;
		Calcula c = new Calcula();
		
		try {
			 
			 result = c.sub(1, 1);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("resultado da subtração é: "+result);
		assertThat(result, is(0));
	}

	private void deveriaSomar() {
		// TODO Auto-generated method stub
		
	int result = 0;
		Calcula c = new Calcula();
		
		try {
			 
			 result = c.som(1, 1);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("resultado da soma é: "+result);
		//assertEquals(true, result == 2);
		assertThat(result, is(2));
		
		
		
	}
}
