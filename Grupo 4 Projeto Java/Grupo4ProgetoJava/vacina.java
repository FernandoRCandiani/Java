package Grupo4ProgetoJava;

import java.util.Scanner;

public class vacina {
	
	public String laboratorio; 
	public int estoqueGeral;
	public String prioridades;
	public int segundaDose;

	
	
	Scanner ler = new Scanner(System.in);

	
		public vacina (String laboratorio, int estoqueGeral, String prioridades, int segundaDose) {
			this.laboratorio=laboratorio;
			this.estoqueGeral=estoqueGeral;
			this.prioridades=prioridades;
			this.segundaDose=segundaDose;
		}
	
		public void Imfolaboratorio() {		//Tipos de Laboratorio e vacinas
			
			System.out.println("\n----- Vacinas -----\n-AstraZeneca/Oxford - Funda��o Oswaldo Cruz (Fiocruz)"
					+ "\n-Coronavac/Sinovac - Funda��o Butantan");
			
		}
		
	/*	public void estoqueGeral() {		//Para indicar quantidade de vacinas
			
			System.out.println();
			
		}
	*/	
		public void prioridades () { 		//Mostrar a idade para restricao
		
			System.out.println("\n----- Grupos Priorit�rios -----\n-Pessoas com 60 anos ou mais residentes em institui��es de longa perman�ncia"
					+ "\n-Pessoas com 18 anos ou mais com defici�ncia\n-Popula��o ind�gena vivendo em terras ind�genas\n-Quilombolas"
					+ "\n-Idosos com 77anos ou mais\n-Profissionais de sa�de com 55 anos ou mais\n-Pessoas em situa��o de rua com 60 anos ou mais"
					+ "\n-Profissonais Sepultadores, Velorista, Cremadores e Condutores de Ve�culos \ndos cemit�rio p�blico e privados do munic�pio de S�o Paulo"
					+ "\n-Trabalhadores dos servi�os p�blico: CDI, SEAS, Centros de Acolhida Adulto e POP RUA.");
			
		}
		
		public void segundaDose() {			//Mostrar as Segundas Doses
					
				System.out.println("\n----- Dados da segunda dose -----\n-Coranavac:"
						+ "\n\nO intervalo entre a primeira e a segunda deve ser de 14 a 28 dias \npara aplica��o da segunda dose."
						+ "\n\n-AstraZeneca: \nA segunda dose deve ser admistrada 12 semanas ap�s a primeira.");
				
		}
		
}
