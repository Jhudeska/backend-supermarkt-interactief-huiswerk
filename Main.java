package org.inthepresenceofadonai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Producten in een supermarket
        Product bread = new Product("bread", 1.69, 10);
        Product fruit = new Product("fruit", 2.00, 20);
        Product cheese = new Product("cheese", 7.99, 20);
        Product toiletPaper = new Product("toiletPaper", 6.00, 12);

        //Supermarket voorraad
        SuperMarket superMarket = new SuperMarket(bread, fruit, cheese, toiletPaper);

        System.out.println("Welcome to our Supermarket");
        //Het gekochte product kaas (koop 1 kaas)
        Product buyCheese = new Product("cheese", 7.99, 1);
        superMarket.buyCheese(2);

        //de gebruiker vraagt welk product deze wil kopen en hoeveel
//        Scanner scanner = new Scanner();


    }

}

//bread, fruit, cheese, toilerPaper, superMarket, customer, scanner, name, amount
