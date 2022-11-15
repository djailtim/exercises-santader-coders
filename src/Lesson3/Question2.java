package Lesson3;

import java.io.IOException;
import java.util.Scanner;

public class Question2 {
    /*
    Escreva um programa para verificar se uma pessoa pode votar ou não, de acordo com sua idade. O programa deve escrever na tela as seguintes informacões:

    "Voto obrigatório" — para eleitoras e eleitores, com idades entre 18 e 70 anos.
    "Voto facultativo" — para maiores ou iguais a 16 anos e menores de 18 anos;
     assim como maiores de 70 anos.
    "Sem direito a votar" — para o restante.

    Faça o exercício utilizando operador ternário.
     */

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String age;

        System.out.println("**********\tSistema Verificador da Idade do Eleitor\t**********");

        try {
            System.out.print("=> Informe sua idade: ");
            age = input.nextLine();
            System.out.println(verifyYouAreAVoter(Integer.parseInt(age)));

        } catch (NumberFormatException error) {
            do {
                System.out.print("Erro, digite uma idade válida: ");
                age = input.nextLine();
            } while (!isNumber(age));
            System.out.println(verifyYouAreAVoter(Integer.parseInt(age)));

        } catch (Exception error) {
            System.out.println("Erro. Finalizando aplicação! - "+ error);
        }
    }

    public static String verifyYouAreAVoter (int age) {
        return  (age >= 18 && age <= 70 ) ? "Voto obrigatório!" :
                (age >= 16) ?               "Voto facultativo!" :
                                            "Sem direito a votar!";
    }

    public static boolean isNumber(String number) {
        return number != null && number.matches("[0-9]*");
    }
}

