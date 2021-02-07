package br.ce.wcaquino.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

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

}
