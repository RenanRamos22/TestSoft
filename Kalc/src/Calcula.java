import java.util.Scanner;

public class Calcula {
		
		 /*Declara��o dos m�todos*/  
	   public int som(int num1, int num2) {
	        return num1 + num2;
	    }  
	    public int sub(int num1, int num2){
	        return num1 - num2;
	    }  
	    public int div(int num1,int num2){
	        return num1 / num2;
	    }  
	    public int mult(int num1, int num2){
	        return num1 * num2;
	    }  
	    // --------------- Metodo principal
	    public static void main (String args[]){ 
	        //criando um objeto c a apartir do metodo calc  
	        Calcula c = new Calcula();  
	        //declarando as var�aveis  
	        int opcao = 5;  
	        int num1;  
	        int num2;  
			Scanner input = new Scanner(System.in);
	        System.out.println("-Escolha uma op��o-");  
	        System.out.println("1. Soma");    
	        System.out.println("2. Subtracao");    
	        System.out.println("3. Multiplicacao");    
	        System.out.println("4. Divisao");    
	        System.out.println("0. Sair");    
	        System.out.println("Opera��o: ");   
	        
	        opcao = input.nextInt();  
	        
	        while (opcao != 0) {
	        	//scanner para ler informa��o da tela
				Scanner input1 = new Scanner(System.in);    
				System.out.println("Qual o primeiro numero: ");  
				num1 = input1.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input1.nextInt();
				
				//Op��o soma
				if ( opcao == 1 ) {
					int operacao = c.som(num1, num2);
	                System.out.printf("\nO resultado da soma �: %d\n", operacao);  
	                
	                System.out.println("");
	                System.out.println("-Escolha uma op��o-");  
	    	        System.out.println("1. Soma");    
	    	        System.out.println("2. Subtracao");    
	    	        System.out.println("3. Multiplicacao");    
	    	        System.out.println("4. Divisao");    
	    	        System.out.println("0. Sair");    
	    	        System.out.println("Opera��o: ");   
	    	        
	    	        opcao = input.nextInt();
	            }  
				//Op��o subtra��o
	            else if (opcao == 2) { 
					int operacao = c.sub(num1, num2);
					System.out.printf("\nO resultado da subtra��o �: %d\n", operacao);  
					
					System.out.println("");
	                System.out.println("-Escolha uma op��o-");  
	    	        System.out.println("1. Soma");    
	    	        System.out.println("2. Subtracao");    
	    	        System.out.println("3. Multiplicacao");    
	    	        System.out.println("4. Divisao");    
	    	        System.out.println("0. Sair");    
	    	        System.out.println("Opera��o: ");   
	    	        
	    	        opcao = input.nextInt();
				}  
				//Op��o multiplica��o
				else if (opcao == 3) {
					int operacao = c.mult(num1, num2); 
					System.out.printf("\nO resultado da multiplica��o �: %d\n", operacao);    
					
					System.out.println("");
	                System.out.println("-Escolha uma op��o-");  
	    	        System.out.println("1. Soma");    
	    	        System.out.println("2. Subtracao");    
	    	        System.out.println("3. Multiplicacao");    
	    	        System.out.println("4. Divisao");    
	    	        System.out.println("0. Sair");    
	    	        System.out.println("Opera��o: ");   
	    	        
	    	        opcao = input.nextInt();
				}  
				
				//Op��o divis�o
				else if (opcao == 4) {  
					int operacao = c.div(num1, num2);  
					System.out.printf("\nO resultado da divis�o �: %d\n", operacao);   
					
					System.out.println("");
	                System.out.println("-Escolha uma op��o-");  
	    	        System.out.println("1. Soma");    
	    	        System.out.println("2. Subtracao");    
	    	        System.out.println("3. Multiplicacao");    
	    	        System.out.println("4. Divisao");    
	    	        System.out.println("0. Sair");    
	    	        System.out.println("Opera��o: ");   
	    	        
	    	        opcao = input.nextInt();
				}  
				else{  
					System.out.println("????");  
					break;
				}      
	        } // fim do while - usuario optou por sair
	    }  // fim do metodo principal 
	}
