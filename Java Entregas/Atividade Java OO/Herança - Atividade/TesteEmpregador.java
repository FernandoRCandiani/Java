package HerançaEncapsulamento;

public class TesteEmpregador {
	public static void main(String[] args) {

			
			Empregado emp1 = new Empregado ("Fernando","Embu Guaçu","99999-9999",5642,6000,5);
			Empregado emp2 = new Empregado ("Ana","Embu","99999-9999",5643,10000,6);
			Empregado emp3 = new Empregado ("Felipe","São Paulo","99999-9999",5644,6500,3);
			
			emp1.imprimirInfo();
			emp2.imprimirInfo();
			emp3.imprimirInfo();
			
	}
}
