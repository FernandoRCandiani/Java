package ExerciciosRepeticao;

import java.util.Scanner; 	

public class AtividadeFor1 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)) {	
			int num=0;
			
			for(num=1000;num<1999;num++){			
				
				if(num%11==5) {
					
					System.out.printf("\nNúmeros : %d",num);
				}
			}
		}
	}
}