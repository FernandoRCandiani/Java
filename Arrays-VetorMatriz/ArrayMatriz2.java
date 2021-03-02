package ArraysVetorMatriz;

import java.util.Scanner;

public class ArrayMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner leia = new Scanner(System.in)){
			
			float ma1[][]= new float [2][2], ma2[][]= new float [2][2], ma3[][]= new float [2][2];
			int constante;
			
			
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					System.out.println("\nA diciona valor para matriz M1: ");
					ma1[l][c]=leia.nextFloat();
				}
			}
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					System.out.println("\nA diciona valor para matriz M2:");
					ma2[l][c]=leia.nextFloat();
				}
			}
			System.out.println("\nAdiciona uma constate: ");
			constante = leia.nextInt();
			
			System.out.println("\t\tEscolha um opção.");
			System.out.println("( 1 ) - Somar as duas matrizes M1 e M2.");
			System.out.println("( 2 ) - Subtraia a primeira matriz da segunda.");
			System.out.println("( 3 ) - Adicionar uma costante as duas matrizes.");
			System.out.println("( 4 ) - Somar as duas matrizes M1 e M2.");
			int num=leia.nextInt();
		
			while(num<1 || num>4) {

				System.out.println("\t\tEscolha um opção.");
				System.out.println("( 1 ) - Somar as duas matrizes M1 e M2.");
				System.out.println("( 2 ) - Subtraia a primeira matriz da segunda.");
				System.out.println("( 3 ) - Adicionar uma costante as duas matrizes.");
				System.out.println("( 4 ) - Somar as duas matrizes M1 e M2.");
				num=leia.nextInt();
			}
			switch(num) {
				case 1:
					for(int l=0;l<2;l++) {
						for(int c=0;c<2;c++) {
							ma3[l][c] = ma1[l][c] + ma2[l][c];
							System.out.println("\nA soma da matriz e M: "+ma3[l][c]);
						}
					}
					break;
				case 2:
					for(int l=0;l<2;l++) {
						for(int c=0;c<2;c++) {
							ma3[l][c] = ma1[l][c] - ma2[l][c];
							System.out.println("\nA Subtação da matriz e M: "+ma3[l][c]);
						}
					}
					break;
				case 3:
					for(int l=0;l<2;l++) {
						for(int c=0;c<2;c++) {
							ma3[l][c] = ma1[l][c] + constante;
							System.out.println("\nA constante da matriz e M1: "+ma3[l][c]);
						}
					}
					for(int l=0;l<2;l++) {
						for(int c=0;c<2;c++) {
							ma3[l][c] = ma2[l][c] + constante;
							System.out.println("\nA constante da matriz e M2  "+ma3[l][c]);
						}
					}
					break;
				case 4:
					for(int l=0;l<2;l++) {
						for(int c=0;c<2;c++) {
							ma3[l][c] = ma1[l][c] + constante;
							System.out.println("\nImprime M1: "+ma1[l][c]);
						}
					}
					for(int l=0;l<2;l++) {
						for(int c=0;c<2;c++) {
							ma3[l][c] = ma2[l][c] + constante;
							System.out.println("\nImprime M2: "+ma2[l][c]);
						}
					}
					break;
			}
		}
	}
}
