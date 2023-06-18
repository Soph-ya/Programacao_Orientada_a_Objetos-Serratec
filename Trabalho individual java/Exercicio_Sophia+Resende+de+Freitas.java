package exercicio_nota;

// Sophia Resende de Freitas


import java.util.ArrayList;
import java.util.Scanner;

public class exercicio {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		menu();
	}
	
	public static void menu () {
	int opcao;
			
	do  {
		
		System.out.println("Escolha um exercicio 1 / 2 / 3 / 4 / 5 / 6 / 7 / 8 / 9 / 10 / 11 \nOu digite 0 para sair");
		
			opcao = input.nextInt();
			
			switch (opcao) {
			
			case 1: 
				System.out.println("Você selecionou: Calculos!\n");
				exercicio_1();
				break;
			case 2: 
				System.out.println("Você selecionou: Media da turma!");
				exercicio_2();
				break;
			case 3: 
				System.out.println("Você Selecionou: Concessionár CARANGO!");
				exercicio_3();
				break;
			case 4: 
				System.out.println("Você Selecionou: Tipos de triângulo");
				exercicio_4();
				break;
			case 5: 
				System.out.println("Você Selecionou: soma entre 5 números!");
				exercicio_5();
				break;
			case 6: 
				System.out.println("Você Selecionou: Lista de nomes!");
				exercicio_6();
				break;
			case 7: 
				System.out.println("Você Selecionou: Números em vetores multiplicados por 5");
				exercicio_7();
				break;
			case 8: 
				System.out.println("Você Selecionou: Calculo de potência");
				exercicio_8();
				break;
			case 9: 
				System.out.println("Você Selecionou: Tabuada!");
				exercicio_9();
				break;
			case 10: 
				System.out.println("Você Selecionou: Dados funcionários!");
				exercicio_10();
				break;				
			case 0:
				System.out.println("\n\nObrigada por utilizar nosso sistema (:");
				break;
			default:
				System.out.println("Opção inválida");
		} 
			} while (opcao < 0 || opcao > 11);
	

			
}
	public static void exercicio_1() {
				
			Scanner input = new Scanner(System.in);
			
			
			double primeiroDigito;
			double segundoDigito;
			double terceiroDigito;
			double resultado;
			int digito;
			String nome;
			boolean continuar = true;
			int resposta = 1;
			
			
			
			System.out.println("Olá, favor digite o seu nome: ");
			nome = input.nextLine();
			System.out.println("Bem vindo, " + nome);
			
			
			
			do {
				continuar = true;
				System.out.println("Selecione uma opção: \n1 para somar \n2 para dividir\n3 para subtrair \n4 para multiplicar \n5 para todas as opções \n0 para sair: ");
				digito = input.nextInt();
				
			
			switch (digito) {
			
			
				case 1:
					{
						System.out.println("Soma selecionado, digite os três numeros: ");
						primeiroDigito = input.nextInt();
						segundoDigito = input.nextInt();
						terceiroDigito = input.nextInt();
						resultado = primeiroDigito + segundoDigito + terceiroDigito;
						System.out.println(primeiroDigito + " + " + segundoDigito+ " + " + terceiroDigito + " = " + resultado + "\n\n");
						break;
					}
				
				case 2:
					{
						System.out.println("Divisão selecionado, digite os três numeros: ");
						primeiroDigito = input.nextInt();
						segundoDigito = input.nextInt();
						terceiroDigito = input.nextInt();
						resultado = primeiroDigito / segundoDigito / terceiroDigito;
						System.out.println(primeiroDigito + " / " + segundoDigito + " / " + terceiroDigito + " = " + resultado + "\n\n");
						break;
				}
				
				case 3: 
				{
						System.out.println("Subtração selecionado, digite os três numeros: ");
						primeiroDigito = input.nextInt();
						segundoDigito = input.nextInt();
						terceiroDigito = input.nextInt();
						resultado = primeiroDigito - segundoDigito - terceiroDigito;
						System.out.println(primeiroDigito + " - " + segundoDigito + "- " + terceiroDigito + " = " + resultado + "\n\n");
						break;
					
				}
				
				case 4:
				{
					System.out.println("Multiplicação selecionado, digite os três numeros: ");
					primeiroDigito = input.nextInt();
					segundoDigito = input.nextInt();
					terceiroDigito = input.nextInt();
					resultado = primeiroDigito * segundoDigito * terceiroDigito;
					System.out.println(primeiroDigito + " * " + segundoDigito + " * " + terceiroDigito + " = " + resultado + "\n\n");
					break;
					
				}
				
				case 5:
				{
					System.out.println("Digite os três numeros: ");
					primeiroDigito = input.nextInt();
					segundoDigito = input.nextInt();
					terceiroDigito = input.nextInt();
					double resultadoSoma = primeiroDigito + segundoDigito + terceiroDigito;
					double resultadoDivisao = primeiroDigito / segundoDigito / terceiroDigito;
					double resultadoSubtracao = primeiroDigito - segundoDigito - terceiroDigito;
					double resultadoMultiplicacao = primeiroDigito * segundoDigito * terceiroDigito;
					System.out.println("Resultado soma: " + resultadoSoma + "\nResultado Divisão: " + resultadoDivisao + 
							"\nResultado Subtração: " + resultadoSubtracao + "\nResultado Multiplicação: " + resultadoMultiplicacao + "\n\n");
					break;
				}
				
				case 0: 
				{
					System.out.println("Obrigada por utilizar nosso sistema, volte sempre");
					continuar = false;
					break;
					
				}
				default: {
					
					System.out.println("------------Opção inválida------------");
					continuar = true;
				}
				
			}	
			
			if (digito >= 0 || digito <=5 ) {
				System.out.println("Tecle 1 para continuar, tecle 0 para sair");
				resposta  = input.nextInt();
				if(resposta == 0) {
					continuar = false;
					System.out.println("Obrigada por utilizar nosso sistema! Retornaremos você para o menu principal :) \n\n");
					menu();
				} else if (resposta == 1){
					continuar = true;
					
				}
				
			}
	 } while (continuar == true);
		
			
	}
	public static void exercicio_2() {
		
		Scanner input = new Scanner(System.in);
		
		int numeroAluno;
		double nota;
		boolean continuar = true;
		int resposta = 1;
		
		
		do {
			System.out.println("Favor digitar o numero de alunos de sua turma: ");
			numeroAluno = input.nextInt();
			
			nota = 0;
			
			System.out.println("Digite a nota: ");
			
				for (int i = 1; i <= numeroAluno; i++) {
					System.out.println(i + "ª nota");
					nota += input.nextDouble();
				}
		

		double mediaFinal = nota / numeroAluno;
		System.out.println("Media da turma: " + mediaFinal + "\n\n");
		
		System.out.println("Deseja calcular a média de outra turma? Digite 1 para continuar e 0 para sair"); 
		resposta = input.nextInt();
		
			if(resposta == 0) {
				continuar = false;
				System.out.println("Obrigada por utilizar nosso sistema! Retornaremos você para o menu principal :) \n\n");
				menu();
			} else if (resposta == 1){
				continuar = true;
			} 		
		
	} while (continuar == true);
		
	}
	public static void exercicio_3() {
		double valorVeiculo;
		double descontoAlcool = 0.25;
		double descontoGasolina = 0.21;
		double DescontoDiesel = 0.14;
		int opcao;
		double valorDoDesconto = 0;
		double valorPago;
		boolean continuar = true;
		int resposta;
		
		
		do {
				valorVeiculo = 0;
				
				System.out.println("Digite, em reais, o valor do veiculo (ou 0 para encerrar): ");
				valorVeiculo = input.nextDouble();
			
			
				
				System.out.println("Informe a opcao do combustivel do carro: \n1 Alcool \n2 Gasolina \n3 Diesel");
				
				opcao = input.nextInt();
				
				switch (opcao) {
				
					case 1: 
						valorDoDesconto = valorVeiculo * descontoAlcool;
						valorPago = valorVeiculo - valorDoDesconto;
						System.out.println("Valor do desconto: R$" + valorDoDesconto + "\nValor total a pagar: " + valorPago + "\n\n");
						
						break;
					
					case 2:
						valorDoDesconto = (valorVeiculo * descontoGasolina);
						valorPago = valorVeiculo - valorDoDesconto;
						System.out.println("Valor do desconto: R$" + valorDoDesconto + "\nValor total a pagar: " + valorPago + "\n\n");
						
						break;
					
					case 3: 
						valorDoDesconto = valorVeiculo * DescontoDiesel;
						valorPago = valorVeiculo - valorDoDesconto;
						System.out.println("Valor do desconto: R$" + valorDoDesconto + "\nValor total a pagar: " + valorPago + "\n\n");
						
						break;
	
					default: 
						System.out.println("\n-----------Opcao inválida, tente novamente-----------\n");
						break;
				} 
				
				System.out.println("Deseja calcular o valor de outro automóvel? Digite 1 para continuar e 0 para sair"); 
				resposta = input.nextInt();
				
					if(resposta == 0) {
						continuar = false;
						System.out.println("Obrigada por utilizar nosso sistema! Retornaremos você para o menu principal :) \n\n");
						menu();
					} else if (resposta == 1){
						continuar = true;
					} 		
				
			} while (continuar == true);
					
		
	}
	public static void exercicio_4() {
		
		double num1;
		double num2;
		double num3;
		boolean continuar = true;
		int resposta;
		
		do {

			System.out.println("Escreva 3 numeros e lhe direi que tipo de triangulo é: ");
		
		
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		
		
		if(num1 * num2 * num3 == 0) {
		
			System.out.println("Não é possível formar um triangulo com esses números, tente novamente");
			continuar = true;
		
		} else if(num1 != num2 && num2 != num3 && num1 != num3) {
				
			System.out.println("Esses valores são de um triângulo Escaleno");

		} else if (num1 == num2 && num2 == num3) {
			
			System.out.println("Lados iguais formam um triângulo Equialtero");
			
			} else {
				
				System.out.println("Dois lados iguais e um diferente formam um triangulo Isósceles");
			
		}  
		
		System.out.println("Deseja saber outro tipo de triângulo? Digite 1 para continuar e 0 para sair"); 
		resposta = input.nextInt();
		
		if(resposta == 0) {
			continuar = false;
			System.out.println("Obrigada por utilizar nosso sistema! Retornaremos você para o menu principal :) \n\n");
			menu();
		} else if (resposta == 1){
			continuar = true;
		} 		
	
} while (continuar == true);
		

}
	public static void exercicio_5() {
		
		double soma = 0;
        double[] numeros = new double[5];
        int resposta;
        boolean continuar = true;
		
		do {
			System.out.println("Digite 5 números: ");
		
	        for (int i = 0; i < 5; i++) {
	            System.out.println((i+1) + "º número:");
	            numeros[i] = input.nextDouble();
	            soma += numeros[i];
	        }
	
	        System.out.println("A soma dos números é = " + soma);
	        
	        
	        System.out.println("Os números digitados foram:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println(numeros[i]);
	        }
	        
	        System.out.println("Deseja saber a soma de outros números? Digite 1 para continuar e 0 para sair"); 
			resposta = input.nextInt();
			
			if(resposta == 0) {
				continuar = false;
				System.out.println("Obrigada por utilizar nosso sistema! Retornaremos você para o menu principal :) \n\n");
				menu();
			} else if (resposta == 1){
				continuar = true;
			} 
		} while (continuar == true);
		

	}
	public static void exercicio_6() {
		
        String[] nome = new String[10];
        
        int resposta;
        boolean continuar = true;
        
        do {
        	
        	System.out.println("Digite 5 nomes: ");
        	
        	for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "º nome:");
            nome[i] = input.next();
	
	        }
	        
	        System.out.println("nomes digitados em ordem de entrada: ");
	
	        for (int i = 0; i < 5; i++) {
	            System.out.println(nome[i]);
	        }
	        
	        
	        System.out.println("nomes digitados em ordem contrária: ");
	
	        for (int i = 4; i >= 0; i--) {
	            System.out.println(nome[i]);
        } 
        System.out.println("Deseja digitar novos nomes? Digite 1 para continuar e 0 para sair"); 
		resposta = input.nextInt();
		
		if(resposta == 0) {
			continuar = false;
			System.out.println("Obrigada por utilizar nosso sistema! Retornaremos você para o menu principal :) \n\n");
			menu();
		} else if (resposta == 1){
			continuar = true;
		} 
	} while (continuar == true);
	

}
	public static void exercicio_7() {
		
        double[] numeros = new double[10];
        
        int resposta;
        boolean continuar = true;
        
       do {
	    	   System.out.println("Digite 10 números: ");
	       
	        for (int i = 0; i < 10; i++) {
	            System.out.println((i+1) + "º número:");
	            numeros[i] = input.nextDouble();
	
	        }
	        System.out.println("Valores digitados multiplicados por 5: ");
	
	        for (int i = 0; i < 10; i++) {
	            System.out.println(numeros[i] * 5);
	        }
	        System.out.println("Deseja digitar novos números? Digite 1 para continuar e 0 para sair"); 
			resposta = input.nextInt();
			
			if(resposta == 0) {
				continuar = false;
				System.out.println("Obrigada por utilizar nosso sistema! Retornaremos você para o menu principal :) \n\n");
				menu();
			} else if (resposta == 1){
				continuar = true;
			} 
		} while (continuar == true);
		
}
	public static void exercicio_8() {

        int base;
        int expoente;
        int resultado;
        int resposta;
        boolean continuar = true;

        
        do {
	        resultado = 1;
        	
	        System.out.print("Digite a base: ");
        	base = input.nextInt();
	
	        System.out.print("Digite o expoente: ");
	        expoente = input.nextInt();
	
	        for (int i = 0; i < expoente; i++) {
	            resultado *= base;
	        }
	
	        System.out.println("Resultado: " + resultado);
	        
	        System.out.println("Deseja calcular a potência de outro número? Digite 1 para continuar e 0 para sair"); 
			resposta = input.nextInt();
			
			if(resposta == 0) {
				continuar = false;
				System.out.println("Obrigada por utilizar nosso sistema! Retornaremos você para o menu principal :) \n\n");
				menu();
			} else if (resposta == 1){
				continuar = true;
			} 
		} while (continuar == true);
		
}
	public static void exercicio_9() {
	
		int numero;
		int multiplicador;
		int total;
		int resposta;
        boolean continuar = true;
        
        
		do {
			System.out.println("digite o numero que deseja saber a tabuada: ");
		
			numero = input.nextInt();
			
			
			multiplicador = 10;
			
			for(int i=1; i<=multiplicador;i++) {
				total = numero *i;
				System.out.println(numero + " * " + i + " = " + total + "\n");
			}
			
			System.out.println("Deseja saber a tabuada de outro número? Digite 1 para continuar e 0 para sair"); 
			resposta = input.nextInt();
			
			if(resposta == 0) {
				continuar = false;
				System.out.println("Obrigada por utilizar nosso sistema! Retornaremos você para o menu principal :) \n\n");
				menu();
			} else if (resposta == 1){
				continuar = true;
			} 
		} while (continuar == true);
		
}
	public static void exercicio_10() {

		Scanner input = new Scanner(System.in);
		
		String nome;
		int resposta;
        boolean continuar = true;
        
			ArrayList<String> nomes = new ArrayList<String>();
	        ArrayList<String> niveis = new ArrayList<String>();
	        ArrayList<Double> salarios = new ArrayList<Double>();
	        

	        nomes.add("Vincent");
	        niveis.add("Estagiário");
	        salarios.add(1500.0);
	        
	        nomes.add("Dalí");
	        niveis.add("Dev júnior");
	        salarios.add(2000.0);
	        
	        nomes.add("Portinari");
	        niveis.add("Dev júnior");
	        salarios.add(2000.0);
	        
	        nomes.add("Tarsila");
	        niveis.add("Dev Pleno");
	        salarios.add(6000.0);
	        
	        nomes.add("Michelangelo");
	        niveis.add("Dev Pleno");
	        salarios.add(6000.0);
	        
	        nomes.add("Klimt");
	        niveis.add("Dev Senior");
	        salarios.add(8000.0);
	        
	        nomes.add("Monet");
	        niveis.add("Dev Senior");
	        salarios.add(8000.0);
	        
	        nomes.add("Picasso");
	        niveis.add("Dev Senior");
	        salarios.add(8000.0);
	        
	        nomes.add("Leonardo");
	        niveis.add("Dev Senior");
	        salarios.add(8000.0);
	        
	        nomes.add("Caravaggio");
	        niveis.add("Dev Senior");
	        salarios.add(8000.0);
	        
	   do {
		   System.out.println("Funcionários: \nVincent \nDalí"
	   
	        		+ " \nPortinari \nTarsila \nMichelangelo \nKlimt \nMonet "
	        		+ "\nPicasso \nLeonardo \nCaravaggio\n");
	        System.out.println("Digite o nome do funcionário que deseja consultar: ");
	        nome = input.next();
	        
	        imprimirFuncionario(nome, nomes, niveis, salarios);
	        System.out.println("\nDeseja saber os dados de outro funcionário? Digite 1 para continuar e 0 para sair \n"); 
			resposta = input.nextInt();
			
			if(resposta == 0) {
				continuar = false;
				System.out.println("Obrigada por utilizar nosso sistema! Retornaremos você para o menu principal :) \n\n");
				menu();
			} else if (resposta == 1){
				continuar = true;
			} 
		} while (continuar == true);
		
}
	    public static void imprimirFuncionario(String nome, ArrayList<String> nomes, ArrayList<String> niveis, ArrayList<Double> salarios) {
	        
	        int index = nomes.indexOf(nome);
	        
	        if (index == -1) {
	            System.out.println("Funcionário não encontrado.");
	        } else {
	            System.out.println("Nome: " + nomes.get(index));
	            System.out.println("Nível: " + niveis.get(index));
	            System.out.println("Salário: " + salarios.get(index));
	        }
	    }
	}