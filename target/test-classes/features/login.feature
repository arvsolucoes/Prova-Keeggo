#Author: your.email@your.domain.com

@all
Feature: Fazer Login
	Eu como usuário quero digitar meus dados para acessar minha conta
	
	Background: Acessar site
	 Given eu esteja no site "http://advantageonlineshopping.com/#/"
   And acesse a tela de login
	
	@testepositivo  
  Scenario: Acessar minha conta
   When preencher os campos
   Then entro no sistema
    
  @testenegativo
  Scenario: Tentar acessar com dados invalidos
   When preencher com dados invalidos
   Then não entra no sistema
    

 