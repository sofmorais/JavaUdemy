package app.exerciciosOrientacaoObjetos;

import app.exerciciosOrientacaoObjetos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name =  sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.printf("%nProduct data: " + product);

        System.out.printf("%nEnter the number of products to be added in stock: ");
        int quantityAdd = sc.nextInt();
        product.addProducts(quantityAdd);

        System.out.printf("%nProduct data: " + product);
        System.out.printf("%nEnter the number of products to be removed from stock: ");
        int quantityRemove = sc.nextInt();
        product.removeProducts(quantityRemove);
        System.out.printf("Updated data: " + product);

        sc.close();
    }
}
