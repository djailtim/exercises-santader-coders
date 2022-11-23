package Lesson5;


import java.util.HashMap;
import java.util.Map;

class Cart {
    Map<Product, Integer> productsInCart = new HashMap<>();

    public void addProductsInCart(Product product, Integer quantity) {
        productsInCart.put(product, quantity);
    }

    public void listProductsInCart() {
        System.out.println("\n" + Messages.messageNameColumnsCart);
        String listProduct;
        for (Map.Entry<Product, Integer> entry : productsInCart.entrySet()) {
            listProduct = entry.getKey().getName() + "\t\t|\t" + entry.getValue() + "\t\t\t|\t" + entry.getKey().getPrice();
            System.out.println(listProduct);
        }
    }

    public Double getTotal() {
        Double total = 0d;

        for (Map.Entry<Product, Integer> entry : productsInCart.entrySet()) {
            total = total + (entry.getKey().getPrice() * entry.getValue());
        }

        return total;
    }
}