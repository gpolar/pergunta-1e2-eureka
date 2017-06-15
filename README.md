# Pergunta 1 e 2 Eureka

[![Gps|Gustavopolarsa]()](http://www.gustavopolarsa.com)

O presente projeto tem como principal objetivo subir o server Eureka para registrar os microserviços dos projetos da pergunta 1 e 2, e assim ter tudo centralizado facilitando o accesso e controle dos serviços
A tecnologia utilizada foi a seguinte:

  - Gradle para gerenciar as dependencias e executar os testes
  - Spring boot para subir o server tomcat embutido com o Eureka
  - Eureka server para registrar os microserviços

# Porque Eureka

  A ideia foi criar uma pequena arquitectura de microservices, utilizando os componentes da Netlifx que tem o SpringCloud e fazer uma pequena simulação de como poderia funcionar na vida real, o Eureka funciona como discover de servicos que utilizam ele para ser registrados, ou seja a gente pode ter um maior controle dos microservicos e os novos servicos serão registrados automaticamente pelo Eureka isso ajuda muito para ter um maior gerenciamento deles.
  
# Execução
Para subir o projeto num algum IDE é executar o arquivo ApplicationEureka.java
Ele vai pegar a seguinte configuração
```sh
server:
  port: 8761 // Porta que vai subir
spring: 
  thymeleaf:
    enabled: false
eureka:
  instance:
    hostname: localhost
  client: // Para que não registre algum servico que tem o projeto( Eureka server só deveria de ser o server e registrar os servicos de fora)
    registerWithEureka: false
    fetchRegistry: false
```
