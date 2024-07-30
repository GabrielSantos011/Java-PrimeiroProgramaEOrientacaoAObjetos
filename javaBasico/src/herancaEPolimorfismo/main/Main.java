package herancaEPolimorfismo.main;

import herancaEPolimorfismo.entities.Funcionario;
import herancaEPolimorfismo.util.SomaTotalBonificacao;
import herancaEPolimorfismo.entities.Gerente;

public class Main {

    public static void main(String[] args) {
        //essa parte nada de novo
        Funcionario f1 = new Funcionario();
        f1.setCpf("99999999999");
        f1.setNome("Gabriel");
        f1.setSalario(1000.0);

        System.out.println(f1.getNome());
        System.out.println(f1.getCpf());
        System.out.println(f1.getSalario());
        System.out.println(f1.getBonificacao());

        System.out.println("------------------------------------------------------");

        //agora demonstrando a herança
        //a classe gerente "não tem" estes métodos porém ela herda de funcionário
        //logo temos os métodos de funcionário e os proprios métodos do gerente
        Gerente g1 = new Gerente();
        g1.setCpf("99999999999");
        g1.setNome("José");
        g1.setSalario(5000.0);
        g1.setSenha("123");

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.autentica("0987654"));
        System.out.println(g1.autentica("123"));
        System.out.println(g1.getBonificacao());

        System.out.println("-------------------------------------------------------");

        //testando o polimorfismo, explicação na classe SomaTotalBonificacao
        SomaTotalBonificacao s = new SomaTotalBonificacao();

        Funcionario f = new Funcionario();
        f.setNome("aaaaa");
        f.setCpf("11111111");
        f.setSalario(1000.0);

        Gerente g = new Gerente();
        g.setNome("bbbbb");
        g.setCpf("222222");
        g.setSalario(5000.0);

        s.registra(f);
        s.registra(g);

        System.out.println(s.getTotal());

    }

}
