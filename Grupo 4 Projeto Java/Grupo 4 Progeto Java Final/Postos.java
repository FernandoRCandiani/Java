package Grupo4ProgetoJava;

import java.util.Scanner;

public class Postos extends Pessoas {
	
	private String região;
	private String senha;
		
	private String posto1N = "1 - Drive Thru Jaçanã";
	private String posto2N = "2 - Drive Thru Tremembé";
	private String posto3N = "3 - Drive Thru Vila Maria";
	private String posto1S = "4 - Drive Thru Cambuci";
	private String posto1L = "5 - Drive Thru Cidade Tiradentes";
	private String posto2L = "6 - Drive Thru Itaim Paulista";
	private String posto3L = "7 - Drive Thru São Mateus";
	private String posto1O = "8 - Mega Drive Clube Hebraica";
	
	private int Estoque1N = 0;
	private int Capacidade1N = 100;
	
	private int Estoque2N = 200;
	private int Capacidade2N= 50;

	private int Estoque3N = 250;
	private int Capacidade3N= 50;
	
	private int Estoque1S = 300;
	private int Capacidade1S= 150;
	 
	private int Estoque1L = 0;
	private int Capacidade1L= 50;
	  
	private int Estoque2L = 100;
	private int Capacidade2L= 20;
	
	private int Estoque3L = 200;
	private int Capacidade3L= 50;
	  
	private int Estoque1O = 700;	
	private int Capacidade1O= 100;
	
	
	
	Scanner leia = new Scanner(System.in);
	
	
	public Postos() {
		
	}
		
	
			
	@Override
	public void cadastrarPessoa() { // método para cadastrar a pessoa

		System.out.println("\nEntre com o primeiro nome:");
		super.setPrimeiroNome(leia.nextLine());

		System.out.println("\nEntre com o nome do meio (digite 0 caso não exista nome do meio): ");
		super.setMeioNome(leia.nextLine());

		System.out.println("\nEntre com o ultimo nome:");
		super.setUltimoNome(leia.nextLine());
					
		System.out.println("\nEntre com o ano de nascimento(AAAA):");
		super.setAnoNasc(leia.nextInt());
		
		System.out.println("\nEntre com a idade:");
		super.setIdade(leia.nextInt());
		leia.nextLine();
		
		if(super.getIdade()<18) {
			
			System.out.println("\nVocê não tem idade mínima para tomar a vacina! Favor iniciar o próximo cadastro");
			cadastrarPessoa();
			
		} else {
			if(super.getPrimeiroNome().equals(null)) {
				System.out.println("\nPessoa não cadastrada, favor iniciar o cadastro:");
				cadastrarPessoa();
			} else {
				if(super.getMeioNome().equals("0")) {
					setSenha();
					System.out.println("A pessoa "+super.getPrimeiroNome()+" "+super.getUltimoNome()+" está cadastrada com a senha "+getSenha());
				}else {
					setSenha();
					System.out.println("A pessoa "+super.getPrimeiroNome()+" "+super.getMeioNome()+" "+super.getUltimoNome()+" está cadastrada com a senha "+getSenha());
				}
			}
			
		}
		
		
		
	}
	
	
	public void calendario() {
		
		
			
		if  (getIdade()<=79 && getIdade()>75)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 03 e 11 de março de 2021.");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 31 de março e 10 de abril de 2021.");
		}
		else if (getIdade()<=75 && getIdade()>=70)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 12 e 25 de março de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 11 e 24 de abril de 2021");
		}
		else if (getIdade()<70 && getIdade()>=65)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 26 e 10 de abril de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 25 de abril e 11 de maio de 2021");
		}
		else if (getIdade()<65 && getIdade()>=60)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 11 de abril e 03 de maio de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 12 de maio e 2 de junho de 2021");
		}
		else if (getIdade()<60 && getIdade()>=55)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 04 de maio e 02 de junho de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 03 de junho e 1 de julho de 2021");
		}
		else if (getIdade()<55 && getIdade()>=50)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 03 de junho e 08 de julho de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 02 julho e 8 de agosto de 2021");
		}
		else if (getIdade()<50 && getIdade()>=45)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 09 de julho e 17 de agosto de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 09 de agosto e 17 de setembro de 2021");
		}
		else if (getIdade()<45 && getIdade()>=40)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 18 de agosto e 29 de setembro de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 18 de setembro e 29 de outubro de 2021");
		}
		else if (getIdade()<40 && getIdade()>=35)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 30 de setembro e 15 de novembro de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 30 de outubro e 15 de novembro de 2021");
		}
		else if (getIdade()<35 && getIdade()>=30)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 16 de novembro de 2021 e 06 de janeiro de 2022");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 14 de dezembro de 2021 e 4 de fevereiro de 2022");
		}
		else if (getIdade()<=30 && getIdade()>25)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 07 de janeiro e 04 de março de 2022");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 05 de fevereiro e 01 de abril de 2022");
		}
		else if (getIdade()<=25 && getIdade()>=18)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 04 de março e 08 de maio de 2022");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 02 de abril e 14 de junho de 2022");
		}
		else if  (getIdade()<18)
		{
			System.out.printf("\n Você não pode ser vacinado ");
		}
		else if (getIdade()>79)
		{
			System.out.printf("\n Você já foi Vacinado");
		}
	
}
	
	public void setSenha() { // método para concatenar strings e criar a senha

		StringBuilder senha = new StringBuilder();

		senha.append(super.getPrimeiroNome().charAt(0)).append(super.getAnoNasc())
				.append(super.getUltimoNome().charAt(0));

		this.senha = senha.toString();

	}
	
	
	public void listaPostos() {
		System.out.println("Relação Completa dos Postos: \n"+posto1N+"\n"+posto2N+"\n"+posto3N+"\n"+posto1S
				+"\n"+posto1L+"\n"+posto2L+"\n"+posto3L+"\n"+posto1O+"\n");
	}
	
	
	public void escolhaPosto() {
			leia.nextLine();
			
			System.out.println("Entre com a zona da cidade de SP onde a pessoa mora(ZN/ZL/ZS/ZO):");
			super.setZonaCidade(leia.next().toUpperCase());
					
			if(super.getZonaCidade().equals("ZN")) {
				System.out.println("Escolha o posto desejado na sua região: \n"+posto1N+"\n"+posto2N+"\n"+posto3N);
				mostraEndereco(leia.nextInt());
				}
			else if(super.getZonaCidade().equals("ZS")) {
				System.out.println("Escolha o posto desejado na sua região: \n"+posto1S);			
				mostraEndereco(leia.nextInt());
				}
			else if(super.getZonaCidade().equals("ZL")) {
				System.out.println("Escolha o posto desejado na sua região: \n"+posto1L+"\n"+posto2L+"\n"+posto3L);
				mostraEndereco(leia.nextInt());
				}
			else if(super.getZonaCidade().equals("ZO")) {
				System.out.println("Escolha o posto desejado na sua região: \n"+posto1O);
				mostraEndereco(leia.nextInt());
				}
		
	}
	
	public void mostraEndereco(int endereco) {
		if (endereco == 1) {
			System.out.println("R: Carlos Dos Santos  S/N");
			controleEstoque(1);
			capacidade(1);
		}
		if (endereco == 2) {
			System.out.println("R: Dos Passaros Jd Labitary");
			controleEstoque(2);
			capacidade(2);
		}
		if (endereco == 3) {
			System.out.println("Rua Antonio M.De Camargo Soldado,87");
			controleEstoque(3);
			capacidade(3);
		}
		if (endereco == 4) {
			System.out.println("Avenida Lacerda Franco, 795");
			controleEstoque(4);
			capacidade(4);
		}
		if (endereco == 5) {
			System.out.println("Rua Cabocla Da Lua Nova");
			controleEstoque(5);
			capacidade(5);
		}
		if (endereco == 6) {
			System.out.println("Rua Cabocla Da Lua Nova");
			controleEstoque(6);
			capacidade(6);
		}
		if (endereco == 7) {
			System.out.println("Rua: Angelo De Candia,1058");
			controleEstoque(7);
			capacidade(7);
		}
		if (endereco == 8) {
			System.out.println("Rua Ibiapinóplis, 781");
			controleEstoque(8);
			capacidade(8);
		}		
	}

	public void controleEstoque(int posto) {
		 //se a pessoa escolhe o posto tal, é feito um decremento do estoque do posto tal
		if(posto == 1) {
			if(this.Estoque1N!=0) {
				getPosto1N();
				this.Estoque1N--;
			    System.out.println("Estoque Atual está em : "+getEstoque1N());
			}else {
				System.out.println("Está sem vacina, favor voltar outro dia");
				escolhaPosto();
			}
		}	
		if(posto == 2) {
			if(this.Estoque2N!=0) {
				getPosto2N();
				this.Estoque2N--;
				System.out.println("Estoque Atual está em : "+getEstoque2N());
			}else {
				System.out.println("Está sem vacina, favor voltar outro dia");
				escolhaPosto();
			}
		}
			
		if(posto == 3) {
			if(this.Estoque3N != 0) {
				getPosto3N();
				this.Estoque3N--;
				System.out.println("Estoque Atual está em : "+getEstoque3N());
			}else {
				System.out.println("Está sem vacina, favor voltar outro dia");
				escolhaPosto();
			}
		}
		
		if(posto == 4) {
			if(this.Estoque1S != 0) {
				getPosto1S();
				this.Estoque1S--;
				System.out.println("Estoque Atual está em : "+getEstoque1S());
			}else {
				System.out.println("Está sem vacina, favor voltar outro dia");
			}
		}
		
		if(posto == 5) {
			if(this.Estoque1L != 0) {
				getPosto1L();
				this.Estoque1L--;
				System.out.println("Estoque Atual está em : "+getEstoque1L());
			}else {
				System.out.println("Está sem vacina, favor voltar outro dia");
				escolhaPosto();
			}
		}
		
		if(posto == 6) {
			if(this.Estoque2L != 0) {
				getPosto2L();
				this.Estoque2L--;
				System.out.println("Estoque Atual está em : "+getEstoque2L());
			}else {
				System.out.println("Está sem vacina, favor voltar outro dia");
				escolhaPosto();
			}
		}
		
		if(posto == 7) {
			if(this.Estoque3L != 0) {
				getPosto3L();
				this.Estoque3L--;
				System.out.println("Estoque Atual está em : "+getEstoque3L());
			}else {
				System.out.println("Está sem vacina, favor voltar outro dia");
				escolhaPosto();
			}	
		}
		
		if(posto == 8) {
			if(this.Estoque1O != 0) {
				getPosto1O();
				this.Estoque1O--;
				System.out.println("Estoque Atual está em : "+getEstoque1O());
			}		
		}
	}
	
	public void capacidade(int posto) {
		//se a pessoa é direcionada para o posto tal, é feito um decremento da capacidade para aquele dia
	if(this.Estoque1N != 0) {
			if(posto == 1) {
			getPosto1N();
			this.Capacidade1N--;
			System.out.println("Capacidade Atual está em : "+getCapacidade1N());
				}
	}
	if(this.Estoque2N != 0) {
		if(posto == 2) {
			getPosto2N();
			this.Capacidade2N--;
			System.out.println("Capacidade Atual está em : "+getCapacidade2N());
			}
	}
	if(this.Estoque3N != 0) {
		if(posto == 3) {
			getPosto3N();
			this.Capacidade3N--;
			System.out.println("Capacidade Atual está em : "+getCapacidade3N());
			}
	}
	if(this.Estoque1S != 0) {
		if(posto == 4) {
			getPosto1S();
			this.Capacidade1S--;
			System.out.println("Capacidade Atual está em : "+getCapacidade1S());
			}
	}
	if(this.Estoque1L != 0) {
		if(posto == 5) {
			getPosto1L();
			this.Capacidade1L--;
			System.out.println("Capacidade Atual está em : "+getCapacidade1L());
			}
	}
	if(this.Estoque2L != 0) {
		if(posto == 6) {
			getPosto2L();
			this.Capacidade2L--;
			System.out.println("Capacidade Atual está em : "+getCapacidade2L());
			}
	}
	if(this.Estoque3L != 0) {
		if(posto == 7) {
			getPosto3L();
			this.Capacidade3L--;
			System.out.println("Capacidade Atual está em : "+getCapacidade3L());
			}
	}
	if(this.Estoque1O != 0) {
		if(posto == 8) {
			getPosto1O();
			this.Capacidade1O--;
			System.out.println("Capacidade Atual está em : "+getCapacidade1O());
			}
	}
	}


	public String getRegião() {
		return região;
	}


	public void setRegião(String região) {
		this.região = região;
	}


	public String getPosto1N() {
		return posto1N;
	}


	public void setPosto1N(String posto1n) {
		posto1N = posto1n;
	}


	public String getPosto2N() {
		return posto2N;
	}


	public void setPosto2N(String posto2n) {
		posto2N = posto2n;
	}


	public String getPosto3N() {
		return posto3N;
	}


	public void setPosto3N(String posto3n) {
		posto3N = posto3n;
	}


	public String getPosto1S() {
		return posto1S;
	}


	public void setPosto1S(String posto1s) {
		posto1S = posto1s;
	}


	public String getPosto1L() {
		return posto1L;
	}


	public void setPosto1L(String posto1l) {
		posto1L = posto1l;
	}


	public String getPosto2L() {
		return posto2L;
	}


	public void setPosto2L(String posto2l) {
		posto2L = posto2l;
	}


	public String getPosto3L() {
		return posto3L;
	}


	public void setPosto3L(String posto3l) {
		posto3L = posto3l;
	}


	public String getPosto1O() {
		return posto1O;
	}


	public void setPosto1O(String posto1o) {
		posto1O = posto1o;
	}


	public int getEstoque1N() {
		return Estoque1N;
	}


	public void setEstoque1N(int estoque1n) {
		Estoque1N = estoque1n;
	}


	public int getCapacidade1N() {
		return Capacidade1N;
	}


	public void setCapacidade1N(int capacidade1n) {
		Capacidade1N = capacidade1n;
	}


	public int getEstoque2N() {
		return Estoque2N;
	}


	public void setEstoque2N(int estoque2n) {
		Estoque2N = estoque2n;
	}


	public int getCapacidade2N() {
		return Capacidade2N;
	}


	public void setCapacidade2N(int capacidade2n) {
		Capacidade2N = capacidade2n;
	}


	public int getEstoque3N() {
		return Estoque3N;
	}


	public void setEstoque3N(int estoque3n) {
		Estoque3N = estoque3n;
	}


	public int getCapacidade3N() {
		return Capacidade3N;
	}


	public void setCapacidade3N(int capacidade3n) {
		Capacidade3N = capacidade3n;
	}


	public int getEstoque1S() {
		return Estoque1S;
	}


	public void setEstoque1S(int estoque1s) {
		Estoque1S = estoque1s;
	}


	public int getCapacidade1S() {
		return Capacidade1S;
	}


	public void setCapacidade1S(int capacidade1s) {
		Capacidade1S = capacidade1s;
	}


	public int getEstoque1L() {
		return Estoque1L;
	}


	public void setEstoque1L(int estoque1l) {
		Estoque1L = estoque1l;
	}


	public int getCapacidade1L() {
		return Capacidade1L;
	}


	public void setCapacidade1L(int capacidade1l) {
		Capacidade1L = capacidade1l;
	}


	public int getEstoque2L() {
		return Estoque2L;
	}


	public void setEstoque2L(int estoque2l) {
		Estoque2L = estoque2l;
	}


	public int getCapacidade2L() {
		return Capacidade2L;
	}


	public void setCapacidade2L(int capacidade2l) {
		Capacidade2L = capacidade2l;
	}


	public int getEstoque3L() {
		return Estoque3L;
	}


	public void setEstoque3L(int estoque3l) {
		Estoque3L = estoque3l;
	}


	public int getCapacidade3L() {
		return Capacidade3L;
	}


	public void setCapacidade3L(int capacidade3l) {
		Capacidade3L = capacidade3l;
	}


	public int getEstoque1O() {
		return Estoque1O;
	}


	public void setEstoque1O(int estoque1o) {
		Estoque1O = estoque1o;
	}


	public int getCapacidade1O() {
		return Capacidade1O;
	}


	public void setCapacidade1O(int capacidade1o) {
		Capacidade1O = capacidade1o;
	}

	public String getSenha() {
		return senha;
	}

	
}