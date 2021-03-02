package ArraysVetorMatriz;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try(Scanner leia = new Scanner(System.in)){
			
				int	a [] = new int [] {1,0,5,-2,-5,7} ,soma=0,cont=0;
				
				soma=a[0]+a[1]+a[5];
				System.out.printf("\nA soma de A[0] + A[1] + A[5] : %d ",soma,"\n");

				if(a[4]!=100) {
					
					a[4]=100;
					soma=a[0]+a[1]+a[5];
					System.out.printf("\n\nValor A[4] Foi atribuida por 100 ",a[4],"\n");
					
				}			
				for(int x=0;x<6;x++) {
				
					System.out.printf("\nO valores do vetor A: A[%d] %d ",cont,a[x]);
					cont++;
				}
			}
	}
}
			
				