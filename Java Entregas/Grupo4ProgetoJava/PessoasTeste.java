package Grupo4ProgetoJava;

public class PessoasTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Postos p1 [] = new Postos[2];
		Vacina v1 = new Vacina();
		
		v1.printVacina(); //informativo sobre as vacinas
		
		for(int i=0; i<p1.length ;i++) {
			p1[i]= new Postos();
			p1[i].cadastrarPessoa(); //cadastrando a pessoa para ser vacinada
			
			p1[i].listaPostos(); //listando os postos drive thru dispon�veis
			p1[i].escolhaPosto(); //usu�rio escolhe o posto de acordo com a regi�o que mora
		
			p1[i].calendario(); //informando o calend�rio de vacina��o para a pessoa
	   }
	}

}