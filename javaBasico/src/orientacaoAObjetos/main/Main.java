package orientacaoAObjetos.main;

//como a classe está em outro pacote devemos importar
import orientacaoAObjetos.classes.Cliente;
import orientacaoAObjetos.classes.Conta;

public class Main {

    public static void main(String[] args) {
        //instanciar um objeto é fazer a planta da casa se transformar em uma casa
        //fazemos isso no java com o new + o construtor da classe
        //criaremos uma variável do tipo conta
        Conta primeiraConta = new Conta(1111,1234);

        //agora primeiraConta é uma conta de verdade. Podemos colocar valores em seus atributos,
        //utilizar seus métodos e tudo mais.

        //é importante frisar que temos a classe, temos o objeto e temos a referência
        //classe e objetos já falamos.
        //referência: a variável primeiraConta não é como uma variavel de tipo primitivo que
        //simplesmente guarda algum valor, ela guarda uma referencia de onde está o objeto,
        //como se fosse uma posição de memória, podemos observar isso com um
        //System.out.println()
        System.out.println(primeiraConta);

        //como acessar o dado/método
        //na unha seria:
        //System.out.println(primeiraConta.agencia);
        //mas com o operador private não conseguimos mais desta maneira
        //para dar certo utilizaremos nossos métodos
        System.out.println(primeiraConta.getAgencia());

        //diferente de uma variável de tipo primitivo que não tem valor default
        //quando instanciamos um objeto seus atributos tem valores default, por ex
        //numeros inicializam com 0 e váriaveis de referencia com null
        //porque este atributo não está referenciando nenhum objeto.
        //devemos tomar cuidado com isso pois se tentarmos acessar algum atributo
        //ou método enquanto ele não referencia nada dará uma exception
        //de nullpointer
        System.out.println(primeiraConta.getTitular());

        //daria o erro nullpointer
        //System.out.println(primeiraConta.getTitular().getCpf());

        Cliente cliente = new Cliente();
        cliente.setCpf("12345678912");
        cliente.setNome("Gabriel");

        primeiraConta.setTitular(cliente);
        primeiraConta.deposita(200.57);

        //podemos ter quantos objetos quisermos e um objeto não interfere no outro
        Conta segundaConta = new Conta(2222, 4321);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("12987654321");
        cliente2.setNome("Rafael");

        segundaConta.setTitular(cliente2);
        segundaConta.deposita(100);

        System.out.println("A conta do " + primeiraConta.getTitular().getNome() +
                " tem um saldo de " + primeiraConta.getSaldo());

        System.out.println("A conta do " + segundaConta.getTitular().getNome() +
                " tem um saldo de " + segundaConta.getSaldo());

        //testando as referencias
        //preste atenção neste caso
        primeiraConta = segundaConta;
        //aqui não é gerado um clone da segunda conta para a primeira
        //a variavel segunda conta guarda uma referencia e está passando ela para
        //a variável primeiraConta e isso implica em duas variáveis de referência apontando
        //para o mesmo objeto e caso eu faça uma alteração do tipo
        primeiraConta.saca(100);
        //isso implica que a segunda conta tb ficou com 0 no saldo, pois se trata do
        //mesmo objeto
        System.out.println(segundaConta.getSaldo());

        //isso nos mostra que devemos tomar cuidado com relação as referencias
        //e nos mostra que se fizermos um primeiraConta == segundaConta
        //ele vai comparar as referencias e não os objetos
        //se fizermos isso agora ele daria true pois eles estão apontando para o mesmo lugar
        //mas pode haver um caso onde temos duas referencias diferentes de conta que
        //os dois objetos tem os mesmos valores em seus atributos,
        //neste caso se fizermos uma comparação com == ela retornará false
        //pois as referencias seriam diferentes

        //teste método static
        System.out.println(Conta.getTotal());
    }

}
