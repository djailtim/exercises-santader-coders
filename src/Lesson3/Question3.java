package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    /*
    Escreva um programa que simule uma máquina de venda de bebidas. O usuário poderá escolher dentre 6 opções de bebidas abaixo:

    1 - Coca-Cola - R$ 5
    2 - Coca-Cola 0 - R$ 4.50
    3 - Pepsi - R$ 4,40
    4 - Guaraná Antarctica - R$ 3,50
    5 - Fanta Laranja - R$ 4,23
    6 - Água - R$ 2,50
    O programa devera imprimir na tela o nome e preço do refrigerante selecionado, utilize switch.
     */

    static Drink[] drinks;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choose;
        boolean newDrink = true;

        while (newDrink) {
            System.out.println("**********\tMáquina de Bebidas\t**********");
            System.out.println("==>\tLista de Bebidas\t<==");

            Question3.listOfDrinks();

            try {
                System.out.print("\n==>\tEscolha uma bebida (digite número): ");
                choose = input.next();
                Question3.chooseDrink(Integer.parseInt(choose));

            } catch (NumberFormatException error) {
                do {
                    System.out.print("Erro, digite um número válido: ");
                    choose = input.next();
                } while (!isNumber(choose));
                Question3.chooseDrink(Integer.parseInt(choose));
            } catch (Exception error) {
                System.out.println("Erro. Finalizando aplicação! - " + error);
            }

            newDrink = isNewDrink(newDrink);
        };

        System.out.println("\n*****\tObrigado por utilizar nosso sistema!\t*****");
    }

    private static boolean isNewDrink(boolean newDrink) {
        Scanner input = new Scanner(System.in);
        String newChoose;
        System.out.println("\n==>\tDeseja escolher outro produto? (S: Sim - N: Não)\t<==");
        newChoose = input.next();
        while (!newChoose.equalsIgnoreCase("s")  && !newChoose.equalsIgnoreCase("n")) {
            System.out.println("==>\tOpção inválida\t<==");
            System.out.println("\n==>\tDeseja escolher outro produto? (S: Sim - N: Não)\t<==");
            newChoose = input.next();
        }
        if (newChoose.equalsIgnoreCase("n")) newDrink = false;
        return newDrink;
    }

    public static void listOfDrinks() {
        drinks = new Drink[] {
                new Drink("Coca-Cola", 5.0),
                new Drink("Coca-Cola 0", 4.5),
                new Drink("Pepsi", 4.4),
                new Drink("Guaraná Antarctica", 3.5),
                new Drink("Fanta Laranja", 4.23),
                new Drink("Água", 2.5)
        };

        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i].toString(i+1));
        }
    }

    public static void chooseDrink(int choose) {
        switch (choose) {
            case 1 -> System.out.println(drinks[0].toString(1));
            case 2 -> System.out.println(drinks[1].toString(2));
            case 3 -> System.out.println(drinks[2].toString(3));
            case 4 -> System.out.println(drinks[3].toString(4));
            case 5 -> System.out.println(drinks[4].toString(5));
            case 6 -> System.out.println(drinks[5].toString(6));
            default -> System.out.println("Opção inválida!");
        }
    }

    public static boolean isNumber(String number) {
        return number != null && number.matches("[0-9]*");
    }
}

class Drink {
    private String name;
    private Double price;

    public Drink(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String toString(int index) {
        return index + " - " + name + " - R$ " + String.format("%.2f", price);
    }
}
