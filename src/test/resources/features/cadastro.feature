#Author: amos_rv@hotmail.com

@all
Feature: Cadastro novo
  Eu como usuario quero preencher meus dados para cadastrar minha conta

  Background: Acessar o site
  	Given que eu esteja no site "http://advantageonlineshopping.com/#/"
   
  @testepositivo  
  Scenario: CT01 - Cadastro com dados validos
    And acessar o formulario de cadastro
    When enviar formulario preenchido
    Then conta sera cadastrada
    
	@testenegativo
	Scenario: CT02 - Cadastro com dados invalidos
		And acessar o formulario de cadastro
    When preencher formulario com dados invalidos
    Then conta nao sera cadastrada