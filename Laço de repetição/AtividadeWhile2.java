package ExerciciosRepeticao;

import java.util.Scanner;

public class AtividadeWhile2 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)) {
			int x=1,idade,sexo,psic,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0;
	
			while(x<=6) {
				System.out.println("Adiciona sua idade: ");
				idade = ler.nextInt();
				
				while( idade<1 || idade>120) {
					System.out.println("Adiciona seu idade novamente: ");
					idade = ler.nextInt();
					
				}
				System.out.println("Adiciona seu sexo:\n 1 - Feminino\n 2 - Masculino\n 3 - Outros");
				sexo = ler.nextInt();
								
				while(sexo<1 || sexo>3) {
					System.out.println("Adiciona novamente seu sexo:\n 1 - Feminino\n 2 - Masculino\n 3 - Outros");
					sexo = ler.nextInt();
				}
				
				System.out.println("Adiciona sua opção:\n 1 - Calmo(a)\n 2 - Nervoso(a)\n 3 - Agressivo(a) ");
				psic = ler.nextInt();
					
					while(psic<0 || psic>3){
						System.out.println("Adiciona sua opção:\n 1 - Calmo(a)\n 2 - Nervoso(a)\n 3 - Agressivo(a) ");
						psic = ler.nextInt();
				}
					if(psic==1){
						contpc++;
					}
					
					if(sexo==1 && psic==2){
						contmn++;
					}
					
					if(sexo==2 && psic==3){
						contha++;
					}
					
					if(sexo==3 && psic==1){
						contoc++;
					}
					
					if(psic==2 && idade>40){
						contpn40++;
					}
					
					if(psic==1 && idade<18){
						contpc18++;
					}
				x++;
				}
				System.out.println("\nPessoas calmas: "+contpc);
				System.out.println("\nMulheres nervosas: "+contmn);
				System.out.println("\nHomens Agressivos: "+contha);
				System.out.println("\nOutros calmos: "+contoc);
				System.out.println("\nNervosos com mais de 40 anos: "+contpn40);
				System.out.println("\nCalmas com menos de 18 anos: "+contpc18);
		}									
	}
}