package Lesson4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question1Refactor {
    public static void main(String[] args) {
        System.out.println("**********\tTeste do Sistema Verificador da Idade do Eleitor\t**********");

        LinkedHashMap<Integer, String> testes = new LinkedHashMap<>() {{
            put(18, "Voto obrigatório!");
            put(70, "Voto obrigatório!");
            put(25, "Voto obrigatório!");
            put(15, "Sem direito a votar!");
            put(8, "Sem direito a votar!");
            put(12, "Sem direito a votar!");
            put(16, "Voto facultativo!");
            put(71, "Voto facultativo!");
            put(75, "Voto facultativo!");
        }};

        int countErrors = 0;
        int countTests = 0;

        for ( Map.Entry<Integer, String> teste : testes.entrySet()) {
            var result = verifyYouAreAVoter(teste.getKey()).equals(teste.getValue());
            if (!result) {
                countErrors++;
                System.out.println("Teste " + (countTests + 1) + ": "
                        + "Reprovado. O correto deveria ser: " + verifyYouAreAVoter(teste.getKey()));
            } else {
                System.out.println("Teste " + (countTests + 1) + ": " + "Aprovado.");
            }
            countTests++;
        }


        if (countErrors == 0) {
            System.out.println("\n👍 Todos os testes foram aprovados.");
        }


    }

    public static String verifyYouAreAVoter(int age) {
        return (age >= 18 && age <= 70) ? "Voto obrigatório!" :
                (age >= 16) ? "Voto facultativo!" :
                        "Sem direito a votar!";
    }
}
