package InterfaceEPolimorfismo.interfaces;

//interface é um contrato, quem assinar este contrato deve obrigatóriamente
//implementar todos os métodos
public interface Autenticavel {
    //interface é uma classe abstrata, com todos seus métodos publicos e abstratos
    //sendo assim não há necessidade de escrevermos public abstract (pois todos são)

    //no java não existe herança multipla, então neste exemplo o gerente e o administrador
    //não poderiam herdar de autenticavel e funcionario ao mesmo tempo,
    //e autenticavel não poderia herdar de funcionario pois cliente é um
    //autenticavel e não é um funcionário, logo a solução é a interface.
    //uma classe pode implementar quantas interfaces quiser

//    O conceito principal de interfaces foi colocado em prática, porém em java mais modernos temos algumas
//    novidades que podem ser interessante dar uma olhada como métodos default e static e final variables
//    segue links interessantes
//    https://www.baeldung.com/java-interfaces
//    https://www.baeldung.com/java-static-default-methods

    void setSenha(int senha);

    boolean autentica(int senha);

}