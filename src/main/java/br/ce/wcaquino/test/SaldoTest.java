package br.ce.wcaquino.test;

import org.junit.Assert;
import org.junit.Test;
import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.page.HomePage;

public class SaldoTest extends BaseTest{
	HomePage page = new HomePage();

	@Test
	public void testSaldoConta(){
		Assert.assertEquals("500.00", page.obterSaldoConta("Conta do Teste alterada"));
	}
}
