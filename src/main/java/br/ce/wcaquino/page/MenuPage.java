package br.ce.wcaquino.page;

import br.ce.wcaquino.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaInserirConta(){
		clicarLink("Contas");
		clicarLink("Adicionar");
	}
	
	public void acessarTelaListarConta(){
		clicarLink("Contas");
		clicarLink("Listar");
	}
}
