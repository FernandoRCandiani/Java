package AtividadePOO;

public class Cliente {
	
	//Declaração dos atributos da classe
	
	private String nomeCliente;
	private String sobrenome;
	private String dataNacimento;
	private String cpf;
	
	//Criação do metodo especial construtor
	
	public Cliente(String nomeCliente,String sobrenome,String dataNacimento,String cpf) {
		
		this.nomeCliente=nomeCliente;
		this.sobrenome=sobrenome;
		this.dataNacimento=dataNacimento;
		this.cpf=cpf;		
	}
	//Declara;'ao dos metodos da classe Cliente
	
	public void infoCliente() {
		System.out.println(nomeCliente+" "+sobrenome+" ,nacido no dia: "+dataNacimento+" portador do CPF: "+cpf);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
	
