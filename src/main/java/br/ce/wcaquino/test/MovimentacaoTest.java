package br.ce.wcaquino.test;

import org.junit.Assert;
import org.junit.Test;
import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.page.MenuPage;
import br.ce.wcaquino.page.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage();

	@Test
	public void testInserirMovimentacao(){
		menuPage.acessarTelaInserirMovimentacao();
		
		movPage.setDataMovimentacao("01/09/2017");
		movPage.setDataPagamento("02/09/2017");
		movPage.setDescricao("Movimenta��o do Teste");
		movPage.setInteressado("Interessado Qualquer");
		movPage.setValor("500");
		movPage.setConta("Conta do Teste alterada");
		movPage.setStatusPago();
		movPage.salvar();
		
		Assert.assertEquals("Movimenta��o adicionada com sucesso!", movPage.obterMensagemSucesso());
	}
}