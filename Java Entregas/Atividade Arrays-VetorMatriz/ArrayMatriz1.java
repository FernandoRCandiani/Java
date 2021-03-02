package ArraysVetorMatriz;

import java.util.Scanner;

public class ArrayMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try(Scanner leia = new Scanner(System.in)){

			int matriz [][] = new int [3][3], contmaior=0;
			
			for(int l=0;l<3;l++) {
				for(int c=0;c<3;c++) {
					System.out.println("\nDigite um valor: ");
					matriz [l][c] = leia.nextInt();
					
					if(matriz[l][c]>=10) {
						
						contmaior++;
					}
				}
			}
			System.out.printf("\nTem: %d ,valores maiores que 10 ",contmaior++);
		}
	}
}