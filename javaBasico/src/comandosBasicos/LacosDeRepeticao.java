package comandosBasicos;

public class LacosDeRepeticao {

    public static void main(String[] args) {
        int contador = 0;

        //while
        while (contador < 10) {
            System.out.println(contador);
            contador = contador + 1;
            //outra maneira
            //contador += 1
            //contador++
        }

        contador = 0;

        do {
            System.out.println(contador);
            contador--;
        } while (contador > 0);
        //repare que contador é igual a 0 e não entraria na condição se fosse um while
        //comum, mas estamos fazendo um do...while, então ele primeiro faz e depois verifica se continua

        //for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//        obs: break e continue
//        O comando break é usado em laços de repetição while, do/while, for e com os comandos switch/case.
//        Quando usado em laço de repetição, causa uma interrupção imediata do mesmo (laço mais interno),
//        continuando a execução do programa na próxima linha após o laço.
//        O comando continue é usado somente em laços de repetição.
//        Quando ele é executado, o laço volta imediatamente para o teste de condição do laço
//        e continua a próxima iteração.
    }

}
