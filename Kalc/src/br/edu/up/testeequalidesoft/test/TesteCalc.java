package br.edu.up.testeequalidesoft.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.edu.up.testeequalidesoft.servico.Calcula;


public class TesteCalc {

	@Test
	public void deveriaCalcular() {
		deveriaSomar();
		deveriaSubtrair();
		deveriaMultiplicar();
		deveriaDividir();
		deveriaCalcularUmNumElevadoaPotencia();
		deveriaCalcularRaizQuadrada();
		DeveriaCalcularEquacaoDoSegundoGrau();
	}
	
	
	private void DeveriaCalcularEquacaoDoSegundoGrau() {
		// TODO Auto-generated method stub
		
			double result = 0;
			Calcula c = new Calcula();
			
			try {
				 
			c.bhask(2, 2, 2);
				 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			System.out.println("resultado da Potenciação: "+ result);
			assertEquals(true, result == 4);
	}


	private void deveriaCalcularRaizQuadrada() {
		// TODO Auto-generated method stub
		double result = 0;
		Calcula c = new Calcula();
		
		try {
			 
			 result = c.raiz(4);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		double compara = result*result;
		System.out.println("resultado da divisão é: "+ result);
		assertEquals(true, compara == 4);
	}

	private void deveriaCalcularUmNumElevadoaPotencia() {
		// TODO Auto-generated method stub
		double result = 0;
		Calcula c = new Calcula();
		
		try {
			 
			 result = c.pot(2, 2);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("resultado da Potenciação: "+ result);
		assertEquals(true, result == 4);
	}

	private void deveriaDividir() {
		// TODO Auto-generated method stub
		double result = 0;
		Calcula c = new Calcula();
		
		try {
			 
			 result = c.div(3, 2);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("resultado da divisão é: "+ result);
		assertEquals(true, result == 1.5);
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
		assertEquals(true, result == 4);
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
		assertEquals(true, result == 0);
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
		assertEquals(true, result == 2);
		
	}
}
