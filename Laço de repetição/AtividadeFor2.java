package ExerciciosRepeticao;

import java.util.Scanner;

public class AtividadeFor2 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)) {

			int cont=0,contpar=0, contimpar=0, num;
			
			System.out.println("Digite um valo: ");
			num = ler.nextInt();
		
			for(cont=0;cont<10;num++){
			
				cont++;
				
				if(num%2==0){
					contpar++;
				}
				else {
					contimpar++;
				}
				
				if(cont<=9) {

				System.out.println("Digite um valo: ");
				num = ler.nextInt();
				}
			}
			System.out.printf("\nQuantidade de pares %d \nquantidade de impares %d",contpar,contimpar);
		}
	}
}
