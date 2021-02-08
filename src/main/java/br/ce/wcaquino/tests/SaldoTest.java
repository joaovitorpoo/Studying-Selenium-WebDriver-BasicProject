package br.ce.wcaquino.tests;

import org.junit.Assert;
import org.junit.Test;
import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.core.Propriedades;
import br.ce.wcaquino.page.HomePage;
import br.ce.wcaquino.page.MenuPage;

public class SaldoTest extends BaseTest{
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();

	@Test
	public void testSaldoConta(){
		menu.acessarTelaHome();
		
		Assert.assertEquals("500.00", page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
	}
}
