package HerancaPolimorfismo;

public class Preguica extends Animal{
		
	public Preguica() {
		super("Cachorro");
	}
	@Override
	public void nome (String nomeAnimal){
		System.out.println("Nome do cachorro: "+nomeAnimal);
	}
	@Override
	public void idade (int idadeAnimal){
	}
	@Override
	public void som (String somAnimal){
		System.out.println("Nome do cachorro: "+somAnimal);
	}
	public void corre (){
		System.out.println("Uma das coisa que um preguica adora fazer é subir em ávores.");
	}
}