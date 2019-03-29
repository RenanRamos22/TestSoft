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
	public double div(int num1,int num2){
		return num1 / num2;
	}  
	public int mult(int num1, int num2){
		return num1 * num2;
	}  
	public double basc(int num1, int num2){
		return num1 * num2;
	}  
	public double pot(int num1, int num2){
		return Math.pow(num1, num2);
	} 
	public double raiz(int num1) {
		return Math.sqrt(num1);	
	}
	public void bhask() {
		 new Delta();	
	}
	public void periPoli() {
		 new Perim();	
	}

	// --------------- Metodo principal
	public static void main (String args[]){ 

		//criando um objeto c a apartir do metodo calc  
		Calcula c = new Calcula();  

		//declarando as var�aveis  
		int opcao = 6546949;  
		int num1;  
		int num2;  

		Scanner input = new Scanner(System.in);
		opcao = c.escolha();  

		while (opcao != 0) {


			//Opção soma
			if ( opcao == 1 ) {
				System.out.println("--------------");
				System.out.println("+++ SOMA:  +++");

				//scanner para ler informação da tela
				Scanner input1 = new Scanner(System.in);    
				System.out.println("Qual o primeiro numero: ");  
				num1 = input1.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input1.nextInt();

				int operacao = c.som(num1, num2);
				System.out.printf("\nO resultado da soma é: %d\n", operacao);  
				System.out.println("---------------------");

				opcao = c.escolha();
			}  
			//Opção subtração
			else if (opcao == 2) { 
				System.out.println("-------------------");
				System.out.println("--- SUBTRACAO:  ---");

				//scanner para ler informação da tela
				Scanner input1 = new Scanner(System.in);    
				System.out.println("Qual o primeiro numero: ");  
				num1 = input1.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input1.nextInt();

				int operacao = c.sub(num1, num2);
				System.out.printf("\nO resultado da subtração é: %d\n", operacao); 
				System.out.println("---------------------");

				opcao = c.escolha();
			}  
			//Op��o multiplica��o
			else if (opcao == 3) {
				System.out.println("-----------------------");
				System.out.println("*** MULTIPLICACAO:  ***");

				//scanner para ler informação da tela
				Scanner input1 = new Scanner(System.in);    
				System.out.println("Qual o primeiro numero: ");  
				num1 = input1.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input1.nextInt();

				int operacao = c.mult(num1, num2); 
				System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);   
				System.out.println("---------------------");

				opcao = c.escolha();
			}  

			//Op��o divis�o
			else if (opcao == 4) { 
				System.out.println("-----------------");
				System.out.println("/// DIVISAO:  ///");

				//scanner para ler informação da tela
				Scanner input1 = new Scanner(System.in);    
				System.out.println("Qual o primeiro numero: ");  
				num1 = input1.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input1.nextInt();

				DecimalFormat sdf = new DecimalFormat("##0.00");
				double operacao = c.div(num1, num2);  
				System.out.println("O resultado da divisão é:"+ sdf.format(operacao)); 
				System.out.println("---------------------");

				opcao = c.escolha();
			}  
			else if (opcao == 5) {  
				System.out.println("---------------------");
				System.out.println("^^^ POTENCIACAO:  ^^^");

				//scanner para ler informação da tela
				Scanner input1 = new Scanner(System.in);    
				System.out.println("Qual o primeiro numero: ");  
				num1 = input1.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input1.nextInt();

				double operacao = c.pot(num1, num2);  
				System.out.println("O resultado é:"+ operacao);   
				System.out.println("---------------------");

				opcao = c.escolha();
			}  
			else if (opcao == 6) {  
				System.out.println("---------------------");
				System.out.println("^^^ Raiz Quadrada:  ^^^");

				//scanner para ler informação da tela
				Scanner input1 = new Scanner(System.in);    
				System.out.println("A Raiz quadrada de: ");  
				num1 = input1.nextInt();  
			

				double operacao = c.raiz(num1);  
				System.out.println("O resultado é:"+ operacao);   
				System.out.println("---------------------");

				opcao = c.escolha();
			}  
			else if (opcao == 7) {  
				System.out.println("---------------------");
				System.out.println("--- Bhaskara: ---");

				c.bhask();
			}  
			else if (opcao == 8) {  
				System.out.println("---------------------");
				System.out.println("--- Perimetro de um Poligono ---");

				new Perim();
			}  
			else{  
				System.out.println("????");  
				break;
			}      
		} // fim do while - usuario optou por sair
	}  // fim do metodo principal 

	
}
