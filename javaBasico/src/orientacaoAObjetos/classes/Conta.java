package orientacaoAObjetos.classes;

/*
Uma classe é como a planta de uma casa, ou seja, ela define tudo que
a casa terá, mas NÃO é uma casa.

As clsses seguem essa lógica, elas são moldes de
algo que chamamos de objeto -----> elas são um tipo

No exemplo vamos criar uma conta.

A conta tem alguns ATRIBUTOS como saldo, agencia, número da conta, titular.

Atributos são o que a conta (classe) tem.

a conta também tem MÉTODOS, que são o que a conta (classe) faz, como por exemplo
sacar, depositar, entre outros

os atributos não ficam dentro de métodos, se não seriam variáveis

Esta classe compila normalmente, mas não conseguimos executar.
Para executarmos um código precisamos de uma classe que tenha o método main
(este método está no package main)
*/
public class Conta {

    //moderadores de acesso:
    //private - só é visto dentro da própria classe
    //default (sem nada a frente) - só é visto dentro do Pacote
    //public - visto de qualquer lugar

    //ATRIBUTOS

    //é uma boa pratica que os atributos sejam privados para que ninguem altere o valor de forma indesejada
    //no exemplo da conta já temos o método saca e deposita logo não faz sentido que alguem
    //altere o valor do saldo "na unha".
    //podemos gerar getters e setters (não são obrigatórios, variam conforme a necessidade)
    //para a liberar e acessar os dados

    private double saldo;
    private int agencia;
    private int numero;

    //como podemos representar um titular?
    //um titular tem um nome, e um cpf
    //porém esses atributos fazem parte da conta? NÃO
    //por isso criamos uma classe específica para cliente
    //e dentro da conta um atributo de referência para essa classe
    Cliente titular;

    //entendendo o static
    //vamos supor que seja interessante ter uma contagem de quantas contas vão ser criadas
    //para isso deveríamos criar um atributo total
    //porém da forma que fizemos até agora este atributo seria de instância
    //ou seja, a cada vez que uma conta fosse criada é como se ela tivesse um total dela
    //(cada objeto teria um atributo total) e esse não é nosso objetivo
    //Para conseguirmos um total de contas precisamos de um atributo que
    //não é do objeto e sim da classe e para isso usamos o static
    private static int total;

    //construtores:
    //não são métodos (não tem retorno em sua assinatura), mas sim uma rotina de inicialização.
    //Eles são chamados de maneira única ao se inicializar um objeto.
    //Por padrão o java já nos fornece o construtor padrão (caso não deixe ele explícito),
    //que seria o: public Conta(){}, porém ao definirmos um construtor diferente o java deixa
    //de nos fornecer. Podemos ter quantos construtores quisermos e fazer diversas ações
    //mas de maneira geral utilizamos para inicialização de atributos primordiais que
    //não poderiam estar vazios. No caso da Conta é interessante que
    //tenhamos uma agência e conta logo ao inicializar o objeto
    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;

        total++;

        //para acessarmos um atributo da classe usamos o nome dela,
        //até funcionaria chamando através de um objeto mas não faria sentido
        System.out.println("Esta é a  " + Conta.total + "° conta");
    }

    //MÉTODOS

    //estrutura de um método
    //operadorDeAcesso Retorno nomeMetodo(Parametros)
    // podemos retornar tipos primitivos, de referência
    //e podemos retornar 'nada'-> neste caso seria void

    public void deposita(double valor) {
        //a classe é um molde para um objeto como já vimos, porém a partir dela
        //podemos gerar mais de um objeto, então nos métodos
        //é comum para acessar os atributos usarmos o this, dizendo assim que o atributo
        //do objeto instanciado que está sendo alterado

        this.saldo += valor;
        //this.saldo = this.saldo + valor
    }

    public boolean saca(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            //this.saldo = this.saldo + valor

            //retornando o boolean
            return true;
        }
        //caso ele não tenha saldo suficiente ele não entrará no if,
        //e assim não passará pelo return,
        //então devemos colocar um return aqui para a negativa
        //(poderia ser em um else)
        return false;
    }

    public boolean transfere(double valor, Conta destino){
        if (valor <= this.saldo) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //como estamos falando de um atributo estático, devemos dar acesso nele através da classe
    //e não por meio de uma instancia, logo o método também será static
    public static int getTotal() {
        return total;
    }

}
