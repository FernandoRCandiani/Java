package ProgramaSequencial;

import java.util.*;

public class Exercícios2 {
	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)){
			float num1, num2, num3;
			
			System.out.println("Adiciona o Primeiro numero: ");
			num1 = ler.nextFloat();//6
			System.out.println("Adiciona o Segundo numero: ");
			num2 = ler.nextFloat();//5
			System.out.println("Adiciona o Terceiro numero: ");
			num3 = ler.nextFloat();//4
			
			if (num1<num2 && num2<num3){ 
				System.out.printf("\n %2.2f \n %2.2f \n %2.2f ",num1,num2,num3);
			}
			else if(num1<num3 && num3<num2){
				System.out.printf("\n %2.2f \n %2.2f \n %2.2f ",num1,num3,num2);
			}
			else if (num2<num1 && num1<num3){
				System.out.printf("\n %2.2f \n %2.2f \n %2.2f ",num2,num1,num3);
			}
			else if (num2<num3 && num3<num1){
				System.out.printf("\n %2.2f \n %2.2f \n %2.2f ",num2,num3,num1);
			}
			else if (num3<num1 && num1<num2){
				System.out.printf("\n %2.2f \n %2.2f \n %2.2f ",num3,num1,num2);
			}
			else if (num3<num2 && num2<num1){
				System.out.printf("\n %2.2f \n %2.2f \n %2.2f ",num3,num2,num1);
			}
				
						
		}
	}
}
