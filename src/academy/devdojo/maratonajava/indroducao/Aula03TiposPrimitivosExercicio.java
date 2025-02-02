package academy.devdojo.maratonajava.indroducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Vitor";
        String endereço = "Rua Siqueira Campos";
        Float salario = 3100.00F;
        String dataRecebimento = "28/01/2025";
        System.out.println("Eu "+nome+", morando no endereço "+endereço+", confirmo que recebi o salário de "+salario+", na data "+dataRecebimento);
        /* É possivel também, colocar toda a mensangem como uma String, assim ficará mais conciso o codigo.
        EX:
            String relatorio = "Eu \"+nome+\", morando no endereço \"+endereço+\", confirmo que recebi o salário de \"+salario+\", na data \"+dataRecebimento"
    */
    }
}
