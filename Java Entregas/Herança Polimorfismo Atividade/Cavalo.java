package HerancaPolimorfismo;

public class Cavalo extends Animal{
	
	public Cavalo() {
		super("Cachorro");
	}
	@Override
	public void nome (String nomeAnimal){
		System.out.println("Nome do cavalo: "+nomeAnimal);
	}
	@Override
	public void idade (int idadeAnimal){
		System.out.println("A idade do cachorro: "+idadeAnimal);
	}
	@Override
	public void som (String somAnimal){
		System.out.println("O som do cachorro: "+somAnimal);
	}
	public void corre (){
		System.out.println("Uma das coisa que um cavalo adora fazer é corre.");
	}
}
