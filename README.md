# Sistema de Cadastro de Anúncios 👨‍💻

## Desafio de Programação - Academia ProWay Capgemini


### Introdução

Este Sistema de Cadastro de Anúncios é a *segunda parte do Desafio de Programação da Academia Técnica ProWay Capgemini*. Trata-se de um desafio classificatório, para que possamos alcançar a tão sonhada primeira oportunidade como um desenvolvedor Java na Capgemini - uma líder global em consultoria, serviços de tecnologia e transformação digital. **Desafio aceito!** Pois assim como a Capgemini, **eu :blue_heart: transformar negócios!** Então, vamos nessa! 🚀

</br>

### O Problema

- A agência **Divulga Tudo** precisa de um programa para gerenciar os seus anúncios online. O objetivo dos anúncios faz parte de uma campanha nas redes sociais. O sistema de gerenciamento permitirá a gestão do anúncio e o rastreio dos resultados da campanha.

</br>

### Critérios Fictícios

- Crie um Sistema que permita o **Cadastro de Anúncios**, contendo os seguintes dados:
  - *Nome do Anúncio;*
  - *Cliente;*
  - *Data de Início;*
  - *Data de Término;*
  - *Investimento por Dia.*
- O Sistema fornecerá **Relatórios de cada Anúncio**, contendo:
  - *Valor Total Investido;*
  - *Quantidade Máxima de Visualizações;*
  - *Quantidade Máxima de Cliques;*
  - *Quantidade Máxima de Compartilhamentos.*
- Os relatórios poderão ser filtrados por Intervalo de Tempo e Cliente.

</br>

### Uma Solução

Sabemos que em programação não existe apenas a solução, mas uma solução. Pois, geralmente, um problema pode ser resolvido de diversas maneiras. E essa é a magia desse universo! Dessa forma, para resolução deste problema, escolhi **JAVA** como *Linguagem de Programação*. O **NetBeans** foi a escolhido como *Ambiente de Desenvolvimento Integrado* e o **MySQL** como sendo o *Banco de Dados* da aplicação.

</br>

### Ferramentas Utilizadas

- O sistema foi desenvolvido utilizando especificamente estas ferramentas e suas respectivas versões:

  - **JDK - Java SE Development Kit 8 Update 111** e **IDE Apache NetBeans 8.2** [[baixe aqui](https://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-3413139-esa.html)]

  - **MySQL Workbench 8.0.25** (Ambiente Gráfico de utilização do Banco de Dados) [[baixe aqui](https://dev.mysql.com/downloads/workbench/)]

  - Por último, foi utilizado **XAMPP** como **servidor do Banco de Dados MySQL.** [[baixe aqui](https://www.apachefriends.org/index.html)]

    ❗  **Importante ¹:** Para que o MySQL Workbench possa ser instalado, é necessário ter instalado antes o [Microsoft .Net Framework 4.5](https://www.microsoft.com/en-us/download/details.aspx?id=30653) e o [Visual  C++ Redistributable for Visual Studio 2019.](https://visualstudio.microsoft.com/pt-br/downloads/?q=Visual+C%2B%2B+Redistributable+for+Visual+Studio+2019)

</br>

### Banco de Dados

O Banco de Dados, responsável por armazenar os dados do Sistema, possui o seguinte nome: **db_cad_anuncio**.  Nele, foi criado a tabela **anuncio** que contém os seguintes atributos: *ID, NOME_ANUNCIO, CLIENTE, DATA_INICIO, DATA_TERMINO e VALOR_INVEST_DIA.*

- Clique [**aqui**](https://github.com/richard-developer/SistemaCadastroAnuncios/blob/main/Query_SQL/Script_BD.sql) para ver Script de criação do Banco de Dados utilizado.

</br>
    
### Como compilar o Sistema

Antes de mais nada, faça o **clone** ou **download ZIP** deste projeto para a sua máquina. Feito isso, vamos ás configurações para compilação deste sistema! 

Para que você possa compilar e executar este sistema, é necessário instale uma IDE (Ambiente de Desenvolvimento Integrado) que compile arquivos ***.java***, como o *Apache Netbeans* por exemplo. Além disso, é preciso ter o pacote JDK 8 (Java Development Kit) ou superior.  Como dito antes, para desenvolver esse sistema, foi utilizado o ***JDK 8*** e o ***NetBeans 8.2***. 

Também **é obrigatório configurar o driver JBDC MySQL** para utilização do Banco de Dados através da IDE. Uma vantagem do NetBeans 8.2 é que ele já vem com a essa biblioteca nativamente instalada ( *basta clicar com o botão direito em Bibliotecas, em seguida Adicionar Biblioteca > **Driver JDBC do MySQL***). Veja imagem abaixo:

<p align="center">
     <img src ="https://github.com/richard-developer/SistemaCadastroAnuncios/blob/main/ImagensConfiguracoes/AdicionarBibliotecaJDBC.png"/>
</p>
    
 ❌❗ **Importante ²:** ***Caso o Driver JDBC do MySQL não esteja devidamente configurado no NetBeans, o Sistema não irá persistir os dados no Banco de Dados.***

 ❗ **Importante ³:** *Se você tiver dificuldade em instalar o Banco de Dados MySQL, sugiro baixar o **XAMPP** [neste link](https://www.apachefriends.org/pt_br/index.html) . É uma alternativa bem rápida e de fácil utilização.* Após instalar e executar o XAMPP, **não esqueça de clicar em Start para iniciar o serviço do MySQL**, conforme imagem abaixo:

<p align="center">
     <img src ="https://github.com/richard-developer/SistemaCadastroAnuncios/blob/main/ImagensConfiguracoes/XAMPP.PNG"/>
</p>

</br>

### Conexão do NetBeans 8.2 ao Banco de Dados MySQL

Após executar o NetBeans, abra o projeto **SistemaCadastroAnuncio** que já foi baixado pra sua máquina . 

Clique na *Aba Serviços > Banco de Dados > Botão Direito (Nova Conexão).* 

<p align="center">
     <img src ="https://github.com/richard-developer/SistemaCadastroAnuncios/blob/main/ImagensConfiguracoes/BancoDadosNetBeans1.png"/>
</p>
    
Feito isso, siga os passos da imagem abaixo:

<p align="center">
     <img src ="https://github.com/richard-developer/SistemaCadastroAnuncios/blob/main/ImagensConfiguracoes/BancoDadosNetBeans2.png"/>
</p>

Na tela Assistente de Nova Conexão, mantenha por padrão o Nome do Usuário **root** e a **senha em branco**, conforme imagem abaixo:

<p align="center">
     <img src ="https://github.com/richard-developer/SistemaCadastroAnuncios/blob/main/ImagensConfiguracoes/BancoDadosNetBeans3.png"/>
</p>

Pronto, seu NetBeans acaba de ser configurado com o Bando de Dados MySQL! 

</br>

### Executando o Sistema

Antes executar o Sistema, verifique se já foram feitas estas **etapas obrigatórias** seguindo a ordem abaixo:

- [x] Instalação do JDK 8 + NetBeans 8.2;
- [x] Instalação do XAMPP;
- [x] Instalação do MySQL Workbench;
- [x] Ativação do MySQL através do XAMPP;
- [x] Criação do Banco de Dados através do MySQL Workbench [[**script aqui**]](https://github.com/richard-developer/SistemaCadastroAnuncios/blob/main/Query_SQL/Script_BD.sql);
- [x] Abrir o projeto pelo NetBeans;
- [x] Configuração do Driver JDBC no NetBeans 8.2;
- [x] Conexão do NetBeans 8.2 ao Banco de Dados MySQL.

    
Realizadas todas as etapas anteriores, seguimos para a **Execução do Sistema:**

1. Com o projeto aberto no NetBeans, navegue até **Pacotes de Códigos-fonte**;

2. Abra o pacote **views**;

3. Clique com o botão direito em **TelaPrincipal.java** e em *Executar Arquivo*.

<p align="center">
     <img src ="https://github.com/richard-developer/SistemaCadastroAnuncios/blob/main/ImagensConfiguracoes/ExecutarProjeto.png"/>
</p>

</br>

### Instruções de utilização do Sistema

Depois de compilar e executar o sistema, chegou a hora de utilizá-lo! Vamos nessa?!

Este é o **Menu Principal do Sistema**:

<p align="center">
     <img src ="https://github.com/richard-developer/SistemaCadastroAnuncios/blob/main/ImagensConfiguracoes/MenuSistema.png"/>
</p>

- Para saber sobre o Sistema, clique em **Sobre**.

- Para sair do Sistema, clique em **Arquivo > Sair**.

</br>

Para Cadastrar um Anúncio, clique em **Cadastro > Cadastrar Anúncio**:
**Nesta mesma tela**, é possível Gerar Relatório e Filtrar por Cliente.
 [Execute o Sistema e confira! 😉]

<p align="center">
     <img src ="https://github.com/richard-developer/SistemaCadastroAnuncios/blob/main/ImagensConfiguracoes/CadastrarAnuncio.png"/>
</p>

</br>

#### Principais Características implementadas:

- O sistema valida se todos os campos obrigatórios para o Cadastro foram preenchidos;

- O sistema não permite que seja digitado uma Data Término igual ou inferior a Data Início.

</br>
        
## Considerações Finais

Quero expressar minha imensa gratidão ao time da Academia ProWay Capgemini por me proporcionar a oportunidade de participar desse desafio. Foram dias intensos, de muitos erros, acertos, e sobretudo de muito aprendizado. Mesmo ás vezes achando que não iria conseguir, acreditei e me dediquei ao máximo. Ainda estou no início da minha jornada como desenvolvedor, mas concluo este desafio com a certeza de que tudo é possível ao que crê, se dedica e faz acontecer. Então, eis aí o resultado de todo este esforço, espero que gostem. Até breve! 🙏


      

    

    

    

    

    

    

    

