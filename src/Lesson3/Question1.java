package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1 {
    /*
    Escreva um programa para verificar se uma pessoa pode votar ou não, de acordo com sua idade. O programa deve escrever na tela as seguintes informacões:

    "Voto obrigatório" — para eleitoras e eleitores, com idades entre 18 e 70 anos.
    "Voto facultativo" — para maiores ou iguais a 16 anos e menores de 18 anos;
     assim como maiores de 70 anos.
    "Sem direito a votar" — para o restante.

    Fonte: https://www.tre-sc.jus.br/eleicoes/tire-suas-duvidas/voto-obrigatoriedade
    ## Exemplo
    Entrada — 16
    Saida — Voto Facultativo
     */

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String age;

        System.out.println("**********\tSistema Verificador da Idade do Eleitor\t**********");

        try {
            System.out.print("=> Informe sua idade: ");
            age = input.readLine();
            verifyYouAreAVoter(Integer.parseInt(age));
        } catch (NumberFormatException error) {
            do {
                System.out.print("Erro, digite uma idade válida: ");
                age = input.readLine();
            } while (!isNumber(age));
            verifyYouAreAVoter(Integer.parseInt(age));
        } catch (Exception error) {
            System.out.println("Erro. Finalizando aplicação! - " + error);
        }
    }

    public static void verifyYouAreAVoter (int age) {
        if (age >= 18 && age <= 70 ) {
            System.out.println("Voto obrigatório!");
        } else if (age >= 16) {
            System.out.println("Voto facultativo!");
        } else {
            System.out.println("Sem direito a votar!");
        }
    }

    public static boolean isNumber(String number) {
        return number != null && number.matches("[0-9]*");
    }
}
