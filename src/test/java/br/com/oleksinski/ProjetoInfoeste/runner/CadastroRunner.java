package br.com.oleksinski.ProjetoInfoeste.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features/cadastro"}, glue = {"br.com.oleksinski.ProjetoInfoeste.steps.cadastro"})
public class CadastroRunner {

}
