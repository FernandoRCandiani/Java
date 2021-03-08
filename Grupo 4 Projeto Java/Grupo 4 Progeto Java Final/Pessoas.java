package Grupo4ProgetoJava;

public abstract class Pessoas {
	private String primeiroNome;
	private String meioNome;
	private String ultimoNome;
	private String zonaCidade;
	private String dataNasc;
	private int anoNasc;
	private int idade;


	// construtores para os dados mais relevantes
	public Pessoas(String pNome, String mNome, String uNome, String zCidade, String dNasc, int aNasc, int idade) {

		setPrimeiroNome(pNome);
		setMeioNome(mNome);
		setUltimoNome(uNome);
		setZonaCidade(zCidade);
		setDataNasc(dNasc);
		setAnoNasc(aNasc);
		setIdade(idade);

	}
		
	
	public Pessoas() {
		
	}
	
	// método para cadastrar a pessoa
	abstract public void cadastrarPessoa();

	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getMeioNome() {
		return meioNome;
	}

	public void setMeioNome(String meioNome) {
		this.meioNome = meioNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getZonaCidade() {
		return zonaCidade;
	}

	public void setZonaCidade(String zonaCidade) {
		this.zonaCidade = zonaCidade;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}

