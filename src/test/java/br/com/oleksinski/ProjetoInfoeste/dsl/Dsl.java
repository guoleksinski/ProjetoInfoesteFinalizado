package br.com.oleksinski.ProjetoInfoeste.dsl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dsl {

	private WebDriver driver;
	
	public Dsl(WebDriver driver) {
		this.driver = driver;
	}
	public void clickBotao(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public void enviarCaracteres(String xpath, String text) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	public void esperarCarregarPagina(String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains(text));
	}
	public void preencherCpf() {
		driver.findElement(By.xpath("//*[@id=\"ipt-cpf\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ipt-cpf\"]")).sendKeys("611.244.350-34");
	}
	public void preencherDataNsc() {
		driver.findElement(By.xpath("//*[@id=\"ipt-dataNascimento\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ipt-dataNascimento\"]")).sendKeys("15/09/2004");
	}
	public void preencherCep() {
		driver.findElement(By.xpath("//*[@id=\"ipt-cep\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ipt-cep\"]")).sendKeys("08411020");
	}
	public void preencherNum() {
		driver.findElement(By.xpath("//*[@id=\"ipt-numero\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ipt-numero\"]")).sendKeys("111");
	}
}
