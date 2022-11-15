package Lesson2.AdditionalExercise;

import java.util.Scanner;

import static Lesson2.AdditionalExercise.ExpendMonths.*;

public class Spense {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um mês para visualizar a despesa (digite um número de 1 a 12)");
        int monthSelected = input.nextInt();

        switch (monthSelected) {
            case (1):
                System.out.printf("O total de despesas do mês de Janeiro é: R$ %.2f%n", JANUARY_EXPENSE.getValue());
                break;
            case (2):
                System.out.printf("O total de despesas do mês de Fevereiro é: R$ %.2f%n", FEBRUARY_EXPENSE.getValue());
                break;
            case (3):
                System.out.printf("O total de despesas do mês de Março é: R$ %.2f%n", MARCH_EXPENSE.getValue());
                break;
            case (4):
                System.out.printf("O total de despesas do mês de Abril é: R$ %.2f%n", APRIL_EXPENSE.getValue());
                break;
            case (5):
                System.out.printf("O total de despesas do mês de Maio é: R$ %.2f%n", MAY_EXPENSE.getValue());
                break;
            case (6):
                System.out.printf("O total de despesas do mês de Junho é: R$ %.2f%n", JUNE_EXPENSE.getValue());
                break;
            case (7):
                System.out.printf("O total de despesas do mês de Julho é: R$ %.2f%n", JULY_EXPENSE.getValue());
                break;
            case (8):
                System.out.printf("O total de despesas do mês de Agosto é: R$ %.2f%n", AUGUST_EXPENSE.getValue());
                break;
            case (9):
                System.out.printf("O total de despesas do mês de Setembro é: R$ %.2f%n", SEPTEMBER_EXPENSE.getValue());
                break;
            case (10):
                System.out.printf("O total de despesas do mês de Outubro é: R$ %.2f%n", OCTOBER_EXPENSE.getValue());
                break;
            case (11):
                System.out.printf("O total de despesas do mês de Novembro é: R$ %.2f%n", NOVEMBER_EXPENSE.getValue());
                break;
            case (12):
                System.out.printf("O total de despesas do mês de Dezembro é: R$ %.2f%n", DECEMBER_EXPENSE.getValue());
                break;
            default:
                System.out.println("Mês inexistente.");
        }
    }
}
