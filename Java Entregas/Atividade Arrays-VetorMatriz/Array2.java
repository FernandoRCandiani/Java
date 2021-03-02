package ArraysVetorMatriz;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try(Scanner leia = new Scanner(System.in)){
			
				int	num [] = new int [6] ,somapar=0, contimpar=0;
				int par [] = new int [6], impar [] = new int[6];
				
				for (int x=0;x<6;x++) {
				System.out.println("\nDigite valores :");
				num[x] = leia.nextInt();
				}

				for(int x=0;x<6;x++) {
					if(num[x]%2==0) {
					
						par [x] = num[x];
						somapar = somapar +num[x];					
					}
					else {
						
						impar[x] = num[x];
						contimpar++;
					}
				}
				for(int x=0;x<6;x++) {
					
					if(par[x]!=0) {
					System.out.println("\nO número: "+par[x]+" é par: ");
					}
					if(impar[x]!=0) {
					System.out.println("\nO número: "+impar[x]+" é impar: ");
					}
					
				}
				System.out.printf("\nAs somas dos números pares: %d",somapar);
				System.out.printf("\nA quantidade de números impares: %d",contimpar);
		}
	}
}
				