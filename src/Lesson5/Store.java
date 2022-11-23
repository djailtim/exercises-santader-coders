package Lesson5;

import java.util.ArrayList;
import java.util.List;

class Store {
    List<Product> products = new ArrayList<>(){{
        add(new Product("Arroz", 24d));
        add(new Product("Feijão", 34d));
        add(new Product("Sal", 50d));
        add(new Product("Açúcar", 25d));
        add(new Product("Café", 27d));
        add(new Product("Tomate", 36d));
        add(new Product("Macarrão", 49d));
        add(new Product("Milho", 28d));
        add(new Product("Leite", 27d));
        add(new Product("Manteiga", 20d));
        add(new Product("Chá", 14d));
        add(new Product("Carnes", 19d));
        add(new Product("Peixes", 49d));
        add(new Product("Ovos", 29d));
    }};

    public void addProduct(String name, Double price){
        products.add(new Product(name, price));
    }

    public void listProducts() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString(i+1));
        }
    }

    public Product selectProduct(Integer index) {
        Product product = products.get(index);
        return product;
    }
}