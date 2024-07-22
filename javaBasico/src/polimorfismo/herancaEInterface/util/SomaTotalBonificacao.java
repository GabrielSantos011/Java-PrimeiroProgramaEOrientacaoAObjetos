package polimorfismo.herancaEInterface.util;

import polimorfismo.herancaEInterface.entities.Funcionario;
import polimorfismo.herancaEInterface.entities.Gerente;

public class SomaTotalBonificacao {

    private double soma;

    //Polimorfismo
    //Neste método declaramos o parametro com uma classe mais genérica
    //sendo assim, podemos receber tanto funcionário quanto gerente
    //como gerente é um funcionario podemos declarar então
    //Funcionario f = new Gerente();
    //porém não podemos fazer o contrário pois nem todos os funcionário são gerente
    //e mesmo declarando o tipo da variavel como funcionario ao chamarmos o método
    //de bonificação ele irá chamar o método do objeteto, ou seja, se for gerente
    //chamará o método de gerente e se for funcionario chamará o de funcionario
    //a única limitação é que instanciando um gerente em uma variavel do tipo funcionario
    //conseguimos acessar apenas os métodos declarados em funcionario, ou seja,
    //não conseguiremos utilizar o autentica por exemplo
    public void registra(Funcionario f) {
        if (f instanceof Gerente) {
            System.out.println("É um Gerente");
        }

        soma += f.getBonificacao();
    }

    public double getTotal() {
        return soma;
    }

}