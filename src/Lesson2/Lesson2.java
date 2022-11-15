package Lesson2;

import java.util.Scanner;

public class Lesson2 {

    /*
    ## Question 1
        Faça um programa que receba uma frase com "Janeiro: 1543, Fevereiro: 1222, Março: 1234".
    Imprima sequencialmente em linhas separadas por cada mês e na última linha a frase: "Total: "
    e o valor da soma de todos os meses. Exemplo:

        Janeiro: 1543
        Fevereiro: 1222
        Março: 1234
        Total: 3999
     */

    /*
        Faça um programa que pegue o nome completo que o usuário digitar e imprima o nome com cada
    parte separada por espaço, um símbolo de exclamação no início. Exemplo:

        Nome: João Mario da Silva
        Resultado: !João !Maria !da !Silva
     */

    public static void main(String[] args) {
        // Question 1
        String messageExpend = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";

        String[] splitMonths = messageExpend.split(", ");

        String[] infoJanuary = splitMonths[0].split(": ");
        String[] infoFebruary = splitMonths[1].split(": ");
        String[] infoMarch = splitMonths[2].split(": ");

        System.out.println("*****\tBalanço Trimestral\t*****".toUpperCase());
        System.out.printf("%s: R$ %.2f%n", infoJanuary[0], Float.parseFloat(infoJanuary[1]));
        System.out.printf("%s: R$ %.2f%n", infoFebruary[0], Float.parseFloat(infoFebruary[1]));
        System.out.printf("%s: R$ %.2f%n", infoMarch[0], Float.parseFloat(infoMarch[1]));

        float totalSpend = Float.parseFloat(infoJanuary[1]) + Float.parseFloat(infoFebruary[1]) + Float.parseFloat(infoMarch[1]);
        System.out.printf("%nTotal: R$ %.2f%n", totalSpend);

        // Question 2
        System.out.println("\n********************************************");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nameComplete = input.nextLine();

        System.out.println("!" + nameComplete.replaceAll("\\s+", " !"));
    }
}
