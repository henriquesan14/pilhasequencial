import java.util.Scanner;

public class Menu {
	public static void menu(){
		int opc;
		String elemento;
		Scanner entrada=new Scanner(System.in);
		PilhaSequencial stack=new PilhaSequencial();
		do{
			System.out.println("Você está implementando uma pilha sequencial!");
			System.out.println("---------------------------------------------");
			System.out.println("O que deseja fazer? ");
			System.out.println("1-Push");
			System.out.println("2-Pop");
			System.out.println("3-Top");
			System.out.println("4-Exibir e sair");
			opc=entrada.nextInt();
				switch(opc){
				case 1: System.out.println("O que você quer inserir na pilha? ");
					elemento=entrada.next();
					stack.push(elemento);
					System.out.println("Elemento inserido! ");
					break;
				case 2:System.out.println("Elemento do topo removido! ");
						break;
				case 3:System.out.println("Elemento do topo: "+stack.elementoTopo());
						break;
				case 4: stack.exibirElementos();
						System.out.println("Programa Encerrado! ");
						break;
				default: System.out.println("Opção Inválida! ");menu();
				}
				
			}while(opc!=4);
	}
}
