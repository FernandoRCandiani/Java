package com.integracao.bancodedados.contatos;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.integracao.bancodedados.model.ContatoModel;
import com.integracao.bancodedados.repository.ContatoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest //melhor testador de JPA
public class ContatosModelIntegrationTest {

	private ContatoModel contato;
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Before
	public void start() {
		contato = new ContatoModel("Gabriel", "011y", "1xxxxxxx1");
	}
	
	//regra, não aceita exceções, é a maneira de especificar 
	//que a execução de um teste lançará uma exceção 
	//Verifica se o @NotEmpty está funcionando

	
	@Test(expected = RuntimeException.class)
	public void salvarComTelNulo() throws Exception {
				
		contato.setTelefone(null);
		contatoRepository.save(contato);
	}
	
	@Test(expected = RuntimeException.class)
	public void salvarComDddNulo() throws Exception{
		
		contato.setDdd(null);
		contatoRepository.save(contato);
	}
	
	@Test(expected = RuntimeException.class)
	public void salvaComNomeNulo() throws Exception{
		
		
		contato.setNome(null);
		contatoRepository.save(contato);
	}
}
