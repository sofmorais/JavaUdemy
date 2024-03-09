package exerciciosOrientacaoObjetos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name =  sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.printf("%nProduct data: " + product.toString());

        System.out.printf("%nEnter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.printf("%nProduct data: " + product.toString());
        System.out.printf("%nEnter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());
        System.out.printf("Updated data: " + product.toString());

        sc.close();
    }
}
