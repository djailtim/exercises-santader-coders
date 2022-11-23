package Lesson4;

public class Question1 {
    /*
        Faça um programa para testar o exercicio do "Voto”, feito em casa.
        O programa deve utilizar um array( pode ser bidimensional), onde devem estar armazenados a entrada e o resultado do método, também conhecido como array de teste.
        O programa deve percorrer o array de teste, enviando a entrada para o método e comparar o resultado do método com o valor armazenado no array.

        Caso o resultado do array seja igual ao método.
        Exibir a seguinte mensagem:
        Teste (numero do teste) - Sucesso.
        Caso o resultado do array seja diferente do método
        Exibir a seguinte mensagem:
        Teste (numero do teste) - Falhou.
        A execução da aplição deve ficar parecida com a forma abaixo.
        Por exemplo:
        Teste1 - Sucesso
        Teste2 - Falha
        Teste3 - Sucesso
        Os testes devem conter:
        3 casos “Não pode votar”
        3 casos “Voto obrigatório”
        3 casos “Voto opcional”

        Observação:
        Utilizar casos extremos que atinjam o começo e o fim de uma condição.
        Por exemplo:
        18 e 70 nos casos de "Voto obrigatório”
        16 e 17 nos casos de "Voto opcional”
        Extra:
        Gravar o resultado de cada teste dentro de um array, para informar o resultado geral dos testes. Caso todos os testes passem com sucesso: Exibir a seguinte mensagem: "Testes executados com sucesso". Caso algum dos testes falhe: Exibir a mensagem com os testes que falharam: Os seguintes testes falharam: Teste 1 - Resultado : "Obrigatorio" - Correto: "Não pode votar"
     */

    public static void main(String[] args) {
        System.out.println("**********\tTeste do Sistema Verificador da Idade do Eleitor\t**********");

        int[] ages = { 18, 70, 25, 15, 8, 12, 16, 71, 75 };
        String[] expectedReturn = {
                "Voto obrigatório!",
                "Voto obrigatório!",
                "Voto obrigatório!",
                "Sem direito a votar!",
                "Sem direito a votar!",
                "Sem direito a votar!",
                "Voto facultativo!",
                "Voto facultativo!",
                "Voto facultativo!"
        };
        boolean[] results = new boolean[ages.length];
        int countErrors = 0;

        for (int i = 0; i < ages.length; i++) {
            boolean result = verifyYouAreAVoter(ages[i]).equals(expectedReturn[i]);
            results[i] = result;

            if (result) {
                System.out.println("Teste " + (i+1) + ": " + "Aprovado");
            } else {
                System.out.println("Teste " + (i+1) + ": " + "Reprovado");
            }
        }

        System.out.println("\n===== ===== ===== =====");
        for (int i = 0; i < results.length; i++) {
            if (!results[i]) {
                countErrors++;
                System.out.println("O teste " + (i+1) + " foi reprovado. O correto deveria ser: "
                        + verifyYouAreAVoter(ages[i]));
            }
        }

        if (countErrors == 0) {
            System.out.println("Todos os testes foram aprovados.");
        }
    }

    public static String verifyYouAreAVoter (int age) {
        return  (age >= 18 && age <= 70 ) ? "Voto obrigatório!" :
                (age >= 16) ?               "Voto facultativo!" :
                        "Sem direito a votar!";
    }
}
