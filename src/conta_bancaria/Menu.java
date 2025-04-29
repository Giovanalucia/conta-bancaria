package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		//Criar (instanciar) um Objeto da Classe Conta
		Conta c1 = new Conta(1, 123, 1, "Aylla", 500000);
		c1.visualizar();
		
		//Sacar
		c1.sacar(100);
		c1.visualizar();
		
		//Depositar
		c1.depositar(1000);
		c1.visualizar();
		
		//Alterar a propriedade titular
		c1.setTitular("Aylla Scaglia");
		c1.visualizar();
		
		//Instanciando um Objeto da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(2, 456, 1, "Renata Negrini", 600000, 60000);
		cc1.visualizar();
		
		cc1.sacar(659000);
		cc1.visualizar();
		
		cc1.depositar(50000);
		cc1.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca(3, 378, 1, "Giovana Lucia", 1000000, 15);
		cp1.visualizar();
		cp1.sacar(100);
		cp1.visualizar();
		cp1.depositar(5000);
		cp1.visualizar();
		
		while (true) {

			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
				
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
				
			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
				
                    		break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
					
                    		break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
	
                    		break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
					
                    		break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
		
                   	 	break;
				case 6:
					System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

                   	 	break;
				case 7:
					System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
					
                    		break;
				case 8:
					System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
					
                    		break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                    		break;
			}
		}	
    }

    public static void sobre() {
	System.out.println("\n*********************************************************");
	System.out.println("Projeto Desenvolvido por: Giovana");
	System.out.println("Generation Brasil - giovanalucia835@gmail.com");
	System.out.println("github.com/Giovanalucia");
	System.out.println("*********************************************************");
   }

}