package br.com.oleksinski.ProjetoInfoeste.steps.cadastro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.oleksinski.ProjetoInfoeste.pages.CadastroPage;
import br.com.oleksinski.ProjetoInfoeste.pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CadastroSteps {

	private WebDriver driver;
	private HomePage homePage;
	private CadastroPage cadastroPage;
	@Before
	public void initialize() {
		driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		homePage = new HomePage(driver);
		cadastroPage = new CadastroPage(driver);
		
	}
	

	@Given("clico no botao cadastro")
	public void clico_no_botao_cadastro() {
		homePage.esperarCarregarPaginaHome();
	    homePage.clickBotaoCadastro();
	}
	@Given("clico no botao professor")
	public void clico_no_botao_professor() throws InterruptedException {
		Thread.sleep(3000);
	    homePage.clicoBotaoProf();
	}
	@When("preencho o campo nome")
	public void preencho_o_campo_nome() throws InterruptedException {
	    cadastroPage.esperarCarregarPaginaCadastro();
	    Thread.sleep(2000);
	    cadastroPage.preencherNome("Gustavo");
	}
	@When("preencho o campo cpf")
	public void preencho_o_campo_cpf() throws InterruptedException {
	    cadastroPage.preencherCpf("611.244.350-34");
	    Thread.sleep(10000);
	}
	@When("preencho o campo email")
	public void preencho_o_campo_email() {
	    cadastroPage.preencherEmail("gustavo@gmail.com");
	}
	@When("preencho a data de nascimento")
	public void preencho_a_data_de_nascimento() throws InterruptedException {
	    Thread.sleep(3000);
	    cadastroPage.preencherDataNsc();
	}
	@When("escolho o gênero")
	public void escolho_o_gênero() throws InterruptedException {
	    cadastroPage.escolherGenero();
	}
	@When("clico no botao proximo")
	public void clico_no_botão_proximo() {
	    cadastroPage.clicarBotaoProx("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div/button");
	}
	@When("preencho a senha")
	public void preencho_a_senha() {
	    cadastroPage.preencherSenha("//*[@id=\"ipt-senha\"]", "12345");
	}
	@When("preencho a confirmação da senha")
	public void preencho_a_confirmação_da_senha() {
		 cadastroPage.preencherSenha("//*[@id=\"ipt-confirmar-senha\"]", "12345");
	}
	@When("preencho o cep")
	public void preencho_o_cep() {
	    cadastroPage.preencherCep();
	}
	@When("preencho o numero")
	public void preencho_o_numero() {
	    cadastroPage.preencherNum();
	}



}
