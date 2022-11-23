package Lesson5;

import java.util.*;

public class Question1 {
    /*
    Crie um programa que simule uma lista(carrinho) de compras. O programa deve receber produtos, quantidade e seus respectivos preços.
    Ao receber todos os produtos, o programa deve imprimir todos os produtos, quantidade, os preços informados e o preço total dos produtos no carrinho.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choiceOfWhich;

        System.out.println(Messages.messageWelcome);
        System.out.println(Messages.messageToDo);
        System.out.print(Messages.messageInputLine);
        try {
            choiceOfWhich = input.nextLine();
            Utils.inputCorrectChoice(input, choiceOfWhich);
            System.out.println("\n" + Messages.messageListProducts);
            getStore(Integer.parseInt(choiceOfWhich));

        }catch (InputMismatchException | NumberFormatException error) {
            do {
                System.out.print(Messages.messageErrorOptionInput);
                choiceOfWhich = input.nextLine();
                Utils.inputCorrectChoice(input, choiceOfWhich);
                getStore(Integer.parseInt(choiceOfWhich));

            } while (!Utils.isNumber(choiceOfWhich));
        } catch (Exception error) {
            System.out.println("Erro. Finalizando aplicação! - " + error);
        }
        input.close();

    }

    public static void getStore(Integer choice) {
        switch (choice) {
            case 1 -> productRegistration();
            default -> productsInStore();
        }
    }

    private static void productsInStore() {
        Scanner input = new Scanner(System.in);
        String selectProduct;
        Product productSelected;
        Integer quantity;
        boolean newPurchase = true;

        Store store = new Store();
        Cart cart = new Cart();
        store.listProducts();

        System.out.println(Messages.messagePurchase);
        System.out.print(Messages.messageInputLine);

        try {
            while (newPurchase) {
                selectProduct = input.next();
                quantity = input.nextInt();
                input.nextLine();
                productSelected = store.selectProduct(Integer.parseInt(selectProduct) - 1);
                cart.addProductsInCart(productSelected, quantity);

                newPurchase = isNewPurchase(newPurchase);
            }


            cart.listProductsInCart();
            System.out.printf(Messages.messageTotalValueCart, cart.getTotal());


        }catch (InputMismatchException | NumberFormatException error) {
            do {
                System.out.print(Messages.messageErrorOptionInput);
                selectProduct = input.nextLine();
            } while (!Utils.isNumber(selectProduct));
        } catch (Exception error) {
            System.out.println("Erro. Finalizando aplicação! - " + error);
        }
    }

    private static void productRegistration() {
        /*
        Scanner input = new Scanner(System.in);
        Store store = new Store();
        String name;
        Double price;

        System.out.println(Messages.messageNewProduct);
        name = input.next();
        price = input.nextDouble();
        input.nextLine();

        store.addProduct(name, price);
        productsInStore();

         */

        System.out.println("Not implemented.");
    }

    private static boolean isNewPurchase(boolean newPurchase) {
        Scanner input = new Scanner(System.in);
        String newChoose;
        System.out.println(Messages.messageNewPurchase);
        System.out.print(Messages.messageInputLine);
        newChoose = input.next();
        System.out.print(Messages.messageInputLine);
        input.nextLine();
        while (!newChoose.equalsIgnoreCase("s")  && !newChoose.equalsIgnoreCase("n")) {
            System.out.println(Messages.messageErrorOptionInput);
            System.out.println(Messages.messageNewPurchase);
            System.out.print(Messages.messageInputLine);
            newChoose = input.next();
            System.out.print(Messages.messageInputLine);
            input.nextLine();
        }
        if (newChoose.equalsIgnoreCase("n")) newPurchase = false;
        return newPurchase;
    }
}
