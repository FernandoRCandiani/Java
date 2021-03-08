package Grupo4ProgetoJava;

public class Vacina {
	public Vacina() {
		
		this.infoLaboratorio();
		this.segundaDose();
		this.prioridades();

	}

	public void printVacina() {

	}

	public void infoLaboratorio() { // Tipos de Laboratorio e vacinas

		System.out.println("\n----- Vacinas Disponíveis -----\n-AstraZeneca/Oxford - Fundação Oswaldo Cruz (Fiocruz)"
				+ "\n-Coronavac/Sinovac - Fundação Butantan");

	}

	public void prioridades() { // Mostrar a idade para restricao

		System.out.println(
				"\n----- Grupos Prioritários -----\n-Pessoas com 60 anos ou mais residentes em instituições de longa permanência"
						+ "\n-Pessoas com 18 anos ou mais com deficiência\n-População indígena vivendo em terras indígenas\n-Quilombolas"
						+ "\n-Idosos com 77anos ou mais\n-Profissionais de saúde com 55 anos ou mais\n-Pessoas em situação de rua com 60 anos ou mais"
						+ "\n-Profissonais Sepultadores, Velorista, Cremadores e Condutores de Veículos \ndos cemitério público e privados do município de São Paulo"
						+ "\n-Trabalhadores dos serviços público: CDI, SEAS, Centros de Acolhida Adulto e POP RUA.\n\n\n\n\n\n\n\n\n\n\n\n");

	}

	public void segundaDose() { // Mostrar as Segundas Doses

		System.out.println("\n----- Dados da segunda dose -----\n-Coranavac:"
				+ "\n\nO intervalo entre a primeira e a segunda deve ser de 14 a 28 dias \npara aplicação da segunda dose."
				+ "\n\n-AstraZeneca: \nA segunda dose deve ser admistrada 12 semanas após a primeira.");

	}
}