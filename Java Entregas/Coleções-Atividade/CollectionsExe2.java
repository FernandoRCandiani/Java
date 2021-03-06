package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsExe2 {
	public static void main(String[] args) {
		int op;
		try (Scanner ler = new Scanner(System.in)) {
			ArrayList<String> estoque = new ArrayList<String>(); //esta Array posso colocar quantos dados quiser
				
			do
			{
				System.out.println("\nDigite uma opção: ");
				System.out.println("********************************");
				System.out.println("1- Deseja adicionar produtos ao estoque\n2- Deseja remover\n3- Atualizar"
						+ "\n4- Mostrar todos os produtos do estoque\n0- Encerrar o programa");
				System.out.println("********************************");
				op = ler.nextInt();
				switch(op){
				case 1:					//Função de adicionar valores
					ler.nextLine();
					System.out.println("Digite o produto para adicionar ao estoque: ");
					String produto = ler.nextLine();
					estoque.add(produto);
					break;
				case 2:					//Função de remover valores
					ler.nextLine();
					System.out.println("Digite o produto para remover do estoque: ");
					String produtor = ler.nextLine();
					if(estoque.contains(produtor)) {
						estoque.remove(produtor);
					}
					else {
						System.out.println("Produto não existe!");
					}
					break;
				case 3:					//Função de atualizar valores
					ler.nextLine();
					System.out.println("Digite o produto que quer atualizar:");
					String verifica = ler.nextLine();
					System.out.println("Digite o nome do produto que entrara no lugar de "+verifica+":");
					String novo = ler.nextLine();
					if(estoque.contains(verifica)) {	//indicar se tem valor para mudar
						estoque.remove(verifica);
						estoque.add(novo);
					}
					else {
						System.out.println("Produto nao existe!");
					}
						System.out.println(estoque);
						break;
				case 4:						//Função para indicar estoque
					System.out.println("\nOs produtos do estoque: ");
					System.out.println(estoque);
					break;
					default:
						System.out.println("Finalizou o programa");
				}
			}while(op!=0); //para indicar quando finaliza o programa
		}
	}
}
