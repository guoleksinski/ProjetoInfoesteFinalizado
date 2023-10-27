package br.com.oleksinski.ProjetoInfoeste.steps.google;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class GoogleSteps {
 private WebDriver driver;
	
	@Given("abro o navegador na página do google")
	public void abro_o_navegador_na_página_do_google() {
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	@When("digito na barra de pesquisa")
	public void digito_na_barra_de_pesquisa() {
	    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Infoeste");
	}
	@When("clico no botao pesquisar")
	public void clico_no_botao_pesquisar() throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
	}
	@Then("realiza a pesquisa")
	public void realiza_a_pesquisa() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Infoeste - Pesquisa Google");
	}



}
