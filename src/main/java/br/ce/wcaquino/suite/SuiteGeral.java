package br.ce.wcaquino.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import br.ce.wcaquino.core.DriverFactory;
import br.ce.wcaquino.page.LoginPage;
import br.ce.wcaquino.tests.ContaTest;
import br.ce.wcaquino.tests.MovimentacaoTest;
import br.ce.wcaquino.tests.RemoverContaComMovimentacao;
import br.ce.wcaquino.tests.ResumoTest;
import br.ce.wcaquino.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverContaComMovimentacao.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inicializa(){
		page.acessarTelaInicial();
		
		page.logar("twtcursos@gmail.com", "147852");
	}
	
	@AfterClass
	public static void finaliza(){
		DriverFactory.killDriver();
	}
}
