package br.ce.wcaquino.test;

import org.junit.Assert;
import org.junit.Test;
import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.page.ContasPage;
import br.ce.wcaquino.page.MenuPage;
public class ContaTest extends BaseTest{
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void testInserirConta(){
		menuPage.acessarTelaInserirConta();
		
		contasPage.setNome("Conta do Teste");
		contasPage.salvar();
		
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
}