package farmacia_java;

import java.io.IOException;
import java.util.Scanner;

import farmacia_java.util.Cores;

public class Menu {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
		
		int opcao;
				
		while(true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					          +"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todas os Produtos             ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Dados da Produto           ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
				
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nFarmacia Bem Estar - Medicamento barato é aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
				
			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Produto\n\n");
						keyPress();
                    	break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Listar todas as Produtos\n\n");
						keyPress();
                    	break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Produto - por número\n\n");
						keyPress();
                    	break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Produto\n\n");
						keyPress();
                    	break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Apagar a Produto\n\n");
						keyPress();
                   	 	break;
				case 6:
					System.out.println(Cores.TEXT_WHITE + "Sair\n\n");
						sobre();
						leia.close();
						System.exit(0);
						keyPress();
						break;
				
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                    		break;
			}
		}	
    }

    public static void sobre() {
        System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
        System.out.println("╔═════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                       SOBRE O PROJETO                                   ║");
        System.out.println("╠═════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ Desenvolvido por: Pablo Furtado Casagrande                              ║");
        System.out.println("║ Email: furtadocasagrandepablo@gmail.com                                 ║");
        System.out.println("║ GitHub: https://github.com/Pablo-Casagrande                             ║");
        System.out.println("║ LinkedIn: linkedin.com/in/pablo-furtado-casagrande-08663434a/           ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════════╝");
        System.out.println(Cores.TEXT_RESET);
    }

    public static void keyPress() {

    	try {
    		 
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
 
		} catch (IOException e) {
 
			System.err.println("Ocorreu um erro ao tentar ler o teclado");
 
		}
	}
}
