package HerancaPolimorfismo;

import java.util.Scanner;

public class TesteAnimal {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		Animal animal = null;
		int x=0;
		do
		{
			System.out.println("Qual tipo do seu animal?\n\n1 - Cachorro |2 - Cavalo |"
					+ "3 - Preguiça |\n");
		x = ler.nextInt();
		if (x==1) {
		
				animal = cachorro;
				System.out.println("O nome do Dog? ");
				String nome = ler.next();
				System.out.println("Quantos anos seu Dog tem? ");
				int idade = ler.nextInt();
				System.out.println("Que som seu Dog faz? ");
				String som = ler.next();
				System.out.println("***************************************");
				cachorro.nome(nome);
				cachorro.idade(idade);
				cachorro.som(som);
				cachorro.corre();
			
			}
		else if(x==2) {
			
				animal = cavalo;
				System.out.println("O nome do cavalo? ");
				String nome = ler.nextLine();
				System.out.println("Quantos anos seu cavalo tem? ");
				int idade = ler.nextInt();
				System.out.println("Que som seu cavalo faz? ");
				String som = ler.next();
				System.out.println("***************************************");
				cavalo.nome(nome);
				cavalo.idade(idade);
				cavalo.som(som);
				cavalo.corre();
		}
		else if(x==3) {

				animal = preguica;
				System.out.println("O nome do preguica? ");
				String nome = ler.next();
				System.out.println("Quantos anos seu preguica tem? ");
				int idade = ler.nextInt();
				System.out.println("Que som seu preguica faz? ");
				String som = ler.next();
				System.out.println("***************************************");
				preguica.nome(nome);
				preguica.idade(idade);
				preguica.som(som);
				preguica.corre();
			}
		else {
			System.out.println("\nOpss... Testa novamente...");
		}
		}while(x<=0 || x >=4);
	}
}
