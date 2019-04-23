package br.edu.up.testeequalidesoft.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.core.Is;
import org.junit.Test;

import br.edu.up.testeequalidesoft.servico.Calcula;
import br.edu.up.testeequalidesoft.servico.Delta;
import br.edu.up.testeequalidesoft.servico.ExceptionKalc;
import br.edu.up.testeequalidesoft.servico.Perim;


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
		deveriaCalcularPerimetroPoligono();
		deveriaCalcularHipotenusaTrianguloRetangulo();
	}
	
	
	private void deveriaCalcularHipotenusaTrianguloRetangulo() {
		// TODO Auto-generated method stub
double result = 0;
		int num1= 2;
		int num2 = 4;
				
		Calcula c = new Calcula();
		
		try {
			 
			 result =  c.hip(num1, num2);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Hipotenusa: "+ result);
		assertThat(Math.hypot(num1, num2), is(result));
		
	}


	private void deveriaCalcularPerimetroPoligono() {
		
		double result = 0;
		Perim p = new Perim();
		
		try {
			 
			double[] lados;
			int qtdLados =2;
			
			lados = new double[qtdLados ];
			lados[0]=4;
			lados[1]=4;
			//Perim p = new Perim();
			
			p.setQtdLados(qtdLados);
			p.setLados(lados );
			
			p.lerLados(qtdLados, lados);
			result = p.getPerimetro();
			
			
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Perimetro Teste: "+result);
		 assertThat(result, is(8.0));
		
		
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
			Object[] retorno = new Object[3];
				 
			result.setInput(input);
			
			 retorno = result.getResultHypot();
			 
			 assertThat(retorno[0], is(20.0));
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
				result = c.div(4, 0);
				 
					System.out.println("resultado da divisão é: "+ result);
					
			} catch (ExceptionKalc e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			 
		
			
		assertThat(result, is(0.0));
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
