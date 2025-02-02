package academy.devdojo.maratonajava.indroducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(numero02-numero01);
        System.out.println(numero02+numero01+" Valor "+numero02+numero01);
        System.out.println(resultado);

        // % Operador para descobrir resto da divisão
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == != Valores logicos (Sempre retornam valores boleanos
        boolean isDezMAiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " +isDezMAiorQueVinte);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " +isDezIgualVinte);
        System.out.println("isDezIgualDez " +isDezIgualDez);
        System.out.println("isDezDiferenteDez " +isDezDiferenteDez);

    }
}

/* Ao usar o operador de adição, temos que tomar cuidado para não misturar adição com concatenação.
E também, ao realizar as operações de calculo, devemos olhar sempre para o tipo da variavel, um exemplo:

Na linha 11 o resultado não seria exato igual o da conta, caso o tipo da variavel numero02 fosse também um inteiro,
pois numeros inteiros em JAVA não tem virgula. Logo 10/20 não retornaria 0.5
 */