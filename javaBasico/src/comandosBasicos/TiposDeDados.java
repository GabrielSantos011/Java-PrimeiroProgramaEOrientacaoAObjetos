package comandosBasicos;

public class TiposDeDados {

    public static void main(String[] args) {
        //váriaveis - espaço de memória reservado

        //tipo primitivo não tem valor default

        //números

        //para valores inteiros
        int inteiro;
        inteiro = 1;
        long inteiroGrande = 10000000000l;
        //o padrao do java é int então coloco um l para mostrar que quero um long
        short inteiroPequeno = 200;
        byte b = 127;

        //para valores de ponto flutuantes
        double pontoFlutuante = 1.1;
        //o decimal é com .
        float pontoFlutuanteMenorPrecisao = 1.1f;
        //o padrao do java é double então coloco um f para mostrar que quero um float

        //vale uma curiosidade:
        System.out.println(5/2);
        //por se tratarem de dois números inteiros o java trunca o resultado na
        //parte inteira, não importando jogar este dado em uma variável
        //int ou double, pois sempre será 2
        //caso queira o resultado com o decimal basta que um deles seja de ponto flutuante
        System.out.println(5.0/2);

        //casting
        double num1 = 3.5;
        //caso eu precise colocar ele em uma variável inteira é necessário fazer o casting
        //e estar ciente de que vamos perder a parte decimal
        int num2 = (int) num1;
        //no caso num2 = 3
        System.out.println(num2);


        //caracteres
        char letra = 'a';//sempre com aspas simples
        //na verdade é um tipo inteiro que busca seu valor na tabela de caracteres
        //ou seja letra = 65 funciona, mas nos traz um caractere

        //não é tipo primitivo - mais para frente entenderemos melhor
        String str = "string";

        //booleano
        boolean bool = true;
        bool = false;
    }

}
