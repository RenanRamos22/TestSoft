package br.edu.up.testeequalidesoft.servico;
import java.text.DecimalFormat;
import java.util.Scanner;




public class Calcula {
	
	/*Declaraçãoo dos métodos*/  
	public int escolha(){
		Scanner input1 = new Scanner(System.in);
		int opc;
		
		System.out.println("");
		System.out.println("-Escolha uma opção-");  
		System.out.println("1. Soma");    
		System.out.println("2. Subtracao");    
		System.out.println("3. Multiplicacao");    
		System.out.println("4. Divisao");
		System.out.println("5. Potenciação");
		System.out.println("6. Raiz Quadrada");
		System.out.println("7. Bhaskara");
		System.out.println("8. Perimetro de poligono");
		System.out.println("9. hipotenusa de triángulo rectángulo");
		System.out.println("0. Sair");    
		System.out.println("Operação: ");   

		return  opc = input1.nextInt();
	}

	public int som(int num1, int num2) {
		return num1 + num2;
	}  
	public int sub(int num1, int num2){
		return num1 - num2;
	}  
	public  double div(double num1,double num2) throws ExceptionKalc {
		
	if (num2 != 0) {
		double result = (num1 / num2);
		     
			 return result;
	}
	else {
	 throw new	ExceptionKalc("Divisão por 0 não existe");
		
	}
	}  
	public int mult(int num1, int num2){
		return num1 * num2;
	}  
	public double basc(int num1, int num2){
		return num1 * num2;
	}  
	public int pot(int num1, int num2){
		return (int) Math.pow(num1, num2);
	} 
	public double raiz(double num1) {
		return Math.sqrt(num1);	
	}
	
	public void bhask() {
		// TODO Auto-generated method stub
		new Delta();
        
	}




	/*
	 * public void periPoli() { new Perim(); }
	 */
	
	public double hip(int num1, int num2) {
		
		return Math.hypot(num1,num2);
	}

	// --------------- Metodo principal
	public static void main  (String args[]){ 

		//criando um objeto c a apartir do metodo calc  
		Calcula calcula = new Calcula();  

		//declarando as var�aveis  
		int opcao;  
		int num1;  
		int num2;  

		Scanner input = new Scanner(System.in);
		opcao = calcula.escolha();  

		while (opcao != 0) {
			

			//Opção soma
			if ( opcao == 1 ) {
				System.out.println("--------------");
				System.out.println("+++ SOMA:  +++");

			  
				System.out.println("Qual o primeiro numero: ");  
				num1 = input.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input.nextInt();

				int operacao = calcula.som(num1, num2);
				System.out.printf("\nO resultado da soma é: %d\n", operacao);  
				System.out.println("---------------------");

				opcao = calcula.escolha();
				
			}  
			//Opção subtração
			else if (opcao == 2) { 
				System.out.println("-------------------");
				System.out.println("--- SUBTRACAO:  ---");

				   
				System.out.println("Qual o primeiro numero: ");  
				num1 = input.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input.nextInt();

				int operacao = calcula.sub(num1, num2);
				System.out.printf("\nO resultado da subtração é: %d\n", operacao); 
				System.out.println("---------------------");

				opcao = calcula.escolha();
			}  
			//Op��o multiplica��o
			else if (opcao == 3) {
				System.out.println("-----------------------");
				System.out.println("*** MULTIPLICACAO:  ***");

				System.out.println("Qual o primeiro numero: ");  
				num1 = input.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input.nextInt();

				int operacao = calcula.mult(num1, num2); 
				System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);   
				System.out.println("---------------------");

				opcao = calcula.escolha();
			}  

			//Op��o divis�o
			else if (opcao == 4) { 
				System.out.println("-----------------");
				System.out.println("/// DIVISAO:  ///");
  
				System.out.println("Qual o primeiro numero: ");  
				num1 = input.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input.nextInt();

				
				double operacao=0;
				
				try {
					operacao = calcula.div(num1, num2);
					System.out.println("O resultado da divisão é:"+ operacao); 
					System.out.println("---------------------");
					opcao = calcula.escolha();
				} catch (ExceptionKalc e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
					
					opcao = calcula.escolha();
				
			}  
			else if (opcao == 5) {  
				System.out.println("---------------------");
				System.out.println("^^^ POTENCIACAO:  ^^^");

				//scanner para ler informação da tela    
				System.out.println("Digite o numero que voce deseja calcular: ");  
				num2 = input.nextInt();  
				System.out.println("Elevado a potencia de: ");  
				num1 = input.nextInt();

				double operacao = calcula.pot(num1, num2);  
				System.out.println("O resultado é:"+ operacao);   
				System.out.println("---------------------");

				opcao = calcula.escolha();
			}  
			else if (opcao == 6) {  
				System.out.println("---------------------");
				System.out.println("^^^ Raiz Quadrada:  ^^^");
 
				System.out.println("A Raiz quadrada de: ");  
				num1 = input.nextInt();  
			

				double operacao = calcula.raiz(num1);  
				System.out.println("O resultado é:"+ operacao);   
				System.out.println("---------------------");

				opcao = calcula.escolha();
			}  
			else if (opcao == 7) {  
				System.out.println("---------------------");
				System.out.println("--- Bhaskara: ---");
				 Delta d = new Delta();
				 
					System.out.println("Digite o valor de A, B e C respectivamente: ");
				       int a = Integer.parseInt(input.next());
				       int b = Integer.parseInt(input.next());
				       int c = Integer.parseInt(input.next());
				 d.deltaCalculo(a, b, c);
		      
		       
		        System.out.println("---------------------");
		        
				opcao = calcula.escolha();
			}  
			else if (opcao == 8) {  
				System.out.println("---------------------");
				System.out.println("--- Perimetro de um Poligono ---");
			
				int qtdLados = 0;
				double[] lados;
				Scanner read = new Scanner(System.in);
				
				System.out.println("Digite a quantidade de lados do poligono:");
				  qtdLados = read.nextInt();
				  
				lados = new double[qtdLados];
				
				for(int i = 0;i < qtdLados;i++) {
					System.out.println("digite o tamaho da reta " +i);
					lados[i] = read.nextDouble();
					
				}

				Perim p = new Perim();
				p.lerLados(qtdLados, lados);
				
				double result = p.getPerimetro();
				
				System.out.println("O Perimetro é igual a: "+ result);
				opcao = calcula.escolha();
			}  
			else if (opcao == 9) {  
				System.out.println("---------------------");
				System.out.println("--- Hipotenusa Trinagulo retangulo ---");
				System.out.println("Digite o Primeiro Cateto:");
				num1 = input.nextInt();
				
				System.out.println("Digite o Segundo Cateto:");
				num2 = input.nextInt();
				
				double hipotenusa = calcula.hip(num1,num2);
				
				System.out.println("A Hipotenusa é igual a:"+ hipotenusa);
				
				opcao = calcula.escolha();
			} 
			else{  
				System.out.println("escolha uma opção entre 1 e 9");  
				opcao = calcula.escolha();
			}      
		} // fim do while - usuario optou por sair
		System.out.println("Adeus!");
	}  // fim do metodo principal 

	

	

	
}
