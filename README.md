## Prova técnica API

Este é o projeto da API "VIA CEP" automatizado.

##  Requisitos
 * Java 8+ JDK deve estar instalado
 * Maven deve estar instalado e configurado no path da aplicação
  
## Como executar a API automatizada 

a) Executar a Suíte de Testes Acceptance:
1) Na estrutura do projeto, abra a Classe: 📜Acceptance.java
```
📦restassured-api-testing
 ┣ 📂src
 ┃ ┣ 📂test
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┣ 📂br												
 ┃ ┃ ┃ ┃	┣ 📂com							 					
 ┃ ┃ ┃ ┃	┃  ┣ 📂restassuredapitesting							
 ┃ ┃ ┃ ┃	┃  ┃ ┣📂runners										
 ┃ ┃ ┃ ┃	┃  ┃ ┣ 📜Acceptance.java
```
2) Localize a class Acceptance
3) Acione Run Acceptance
4) Deverá executar toda a Suíte Acceptance

b) Executar a Suíte de Testes Contract:
1) Na estrutura do projeto, abra a Classe: 📜Contract.java
```
📦restassured-api-testing
 ┣ 📂src
 ┃ ┣ 📂test
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┣ 📂br												
 ┃ ┃ ┃ ┃	┣ 📂com							 					
 ┃ ┃ ┃ ┃	┃  ┣ 📂restassuredapitesting							
 ┃ ┃ ┃ ┃	┃  ┃ ┣📂runners										
 ┃ ┃ ┃ ┃	┃  ┃ ┣ 📜Contract.java
```
2) Localize a class Contract
3) Acione Run Contract
4) Deverá executar toda a Suíte Contract							

## Regras

### VIA CEP

`GET <host>/https://viacep.com.br/ws/{cep}/json`

A API VIA CEP tem por finalidade consultar Códigos de Endereçamento Postal (CEP) do Brasil

* Quando informado o CEP e for válido deve retornar o Status Code 200 

#### Consultar CEP

| CEP |
| ----|
| 91260241 |
| 99845999 |

## Arquitetura da API automatizada
```
📦restassured-api-testing
 ┣ 📂src
 ┃ ┣ 📂test
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┣ 📂br												
 ┃ ┃ ┃ ┃	┣ 📂com							 					
 ┃ ┃ ┃ ┃	┃  ┣ 📂restassuredapitesting							
 ┃ ┃ ┃ ┃	┃  ┃ ┣📂runners										
 ┃ ┃ ┃ ┃	┃  ┃ ┣ 📜Acceptance.java								
 ┃ ┃ ┃ ┃	┃  ┃ ┣ 📜AllTests.java								
 ┃ ┃ ┃ ┃	┃  ┃ ┣ 📜Contract.java								
 ┃ ┃ ┃ ┃	┃  ┃ ┣📂suites										
 ┃ ┃ ┃ ┃	┃  ┃ ┣ 📜Acceptance.ja								
 ┃ ┃ ┃ ┃	┃  ┃ ┣ 📜AllTests.java								
 ┃ ┃ ┃ ┃	┃  ┃ ┣ 📜Contract.java								
 ┃ ┃ ┃ ┃	┃  ┃ ┣📂tests																
 ┃ ┃ ┃ ┃	┃  ┣ ┃ 📂base										
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📂requests					
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📜BaseRequest.java		
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📂tests						
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📜BaseTest.java
 ┃ ┃ ┃ ┃    ┃  ┣ ┃📂healthcheck
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📂requests			
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📜GetHealthCheckRequest.java
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📂tests			
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📜GetHealthCheckTest.java
 ┃ ┃ ┃ ┃	┃  ┣ ┃ 📂viacep				
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📂contracts			
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📜ViaCepContratoTest.java	
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📂requests			
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📜GetviaCepRequest.java
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📂tests			
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📜GetviaCepTest.java
 ┃ ┃ ┃ ┃	┃  ┃ ┣📂utils
 ┃ ┃ ┃ ┃	┃  ┃ ┣📜Utils.java
 ┃ ┃ ┃ ┃	┃  ┣ ┃ 📂resources
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📂json_schema
 ┃ ┃ ┃ ┃	┃  ┣ ┃ ┣ 📜get_viacep.json   
┣ 📜.gitignore 
┣ 📜pom.xml 
┣ 📜README.md 
```

## Wiki

Visite a Wiki para navegar no projeto da API "VIA CEP" 
