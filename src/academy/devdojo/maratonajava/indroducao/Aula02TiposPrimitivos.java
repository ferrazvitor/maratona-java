package academy.devdojo.maratonajava.indroducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L; //L nesse caso especifica para o compilador que esse dado é um Long
        long numeroGrande = 10000;
        double salarioDouble = 2000.0D; // D nesse caso especifica para o compilador que esse dado é um double
        float salarioFloat = 2500.0F; // F nesse caso especifica para o compilador que esse dado é um float
        byte idadeByte = -128;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;
        String nome = "Goku";

        System.out.println("A idade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
        System.out.println(idade);
        System.out.println("Oi meu nome é "+nome);
    }
}

/* Na linha 6, foi feito um exemplo de CASTING:
onde forçamos o sistema a alocar aquele dado como aquele tipo primitivo especifico

Na linha 15, temos Striong:
Com String podemos usar grandes textos, não tem limite a principio

*/