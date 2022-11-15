package Lesson1;

public class Lesson1 {

    /*
    ## Questão 1
    A empresa "XPTO S.A", precisa fazer o fechamento do balanço do primeiro trimestre. Os dados passados pela empresa são:

        Janeiro: R$ 10000
        Fevereiro: R$ 17000
        Marco: R$ 23000.
    Faça um programa que calcule e imprima o gasto total do trimestre.
    ---------------------------------------------------------------------------

    ## Questão 2
    Faça um programa que dado a idade em uma variável inteira, adicione as casas decimais: ".023". Após imprima a mensagem "O número da sorte é: " e imprima o número resultante. Para isso, utilize alguma forma de casting.
     */

    public static void main(String[] args) {
        // Question 1
        System.out.println("=====\tXPTO S.A. - Balanço Trimestre\t=====");

        int balanceJanuary = 10000;
        int balanceFebruary = 17000;
        int balanceMarch = 23000;

        int totalSpend = balanceJanuary + balanceFebruary + balanceMarch;
        System.out.println("O gasto total do primeiro trimestre foi de: R$ " + totalSpend);

        // Question 2
        int age = 11;
        float luckyNumber = (float) (age + 0.023);
        System.out.println("O número da sorte é: " + luckyNumber);

    }
}
