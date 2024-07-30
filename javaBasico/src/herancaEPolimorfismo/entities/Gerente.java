package herancaEPolimorfismo.entities;

//herança - classe filha
//Gerente deve ter todos os atributos e métodos que Funcionario tem,
//além deles ele tem uma senha e um método de autenticação dessa senha
//para isso precisamos dizer que gerente é um funcionario
//ou que gerente herda de funcionario
public class Gerente extends Funcionario {

    private String senha;

    //construtores classe filha
    public Gerente(String nome, String cpf, double salario, String senha) {
        //chamada obrigatória do construtor da classe mãe
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public Gerente() {}

    //sobrescrita
    //temos a mesma assinatura de um método na classe mãe
    //geralmente usamos a notação @Override na linha logo acima da assinatura
    //ela nos garante que a assinatura existe na classe mãe
    //sobrescrita x sobrecarga
    //na sobrecarga temos mesmo nome porém retorno ou parametros diferentes
    //com a sobrescrita podemos alterar o comportamento de um método para classe filha,
    //neste caso, por exemplo, um funcionário comum tem uma bonificação de 10%
    //mas para o nosso gerente queremos um salário + 10%
    //portanto sobrescrevemos este método e assim quando instanciarmos um funcionario
    //ele terá o método retornando 10% e quando instanciarmos um gerente ele terá
    //o método retornando um salario + 10%
    @Override
    public double getBonificacao() {
        //quando queremos acessar um atributo que está na classe usamos o this
        //mas no caso queremos algo que está na classe mãe então para isso usamos o super
        //o super serve para atributos e métodos mas nossos atributos
        //são privados então não podemos acessar, logo estamos utilizando os métodos públicos
        //uma outra solução poderia ser alterar a visibilidade do atributo para protected
        //que num geral significa público para classes filhas
        return super.getBonificacao() + super.getSalario();
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autentica(String senha) {
        if (this.senha == senha)
            return true;

        return false;
    }

    /*
     * todas as classes herdam de object automaticamente
     * classe mais genérica de todas para polimorfismo
     * boa prática reescrever o método toString() e o equals()
     */

}
