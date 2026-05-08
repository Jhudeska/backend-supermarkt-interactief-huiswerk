package org.inthepresenceofadonai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //SuperMarket Stock
        Product bread = new Product("bread", 1.69, 10);
        Product fruit = new Product("fruit", 2.00, 20);
        Product cheese = new Product("cheese", 7.99, 20);
        Product toiletPaper = new Product("toiletPaper", 6.00, 12);

        //Test a fake product
        Customer jan = new Customer("Jan");
        Product fakeProduct =   new Product(null, 0, 0);
        SuperMarket jumbo = new SuperMarket(fakeProduct, fruit, cheese, toiletPaper);
        jan.goToSuperMarket(jumbo);


        SuperMarket ah = new SuperMarket(bread, fruit, cheese, toiletPaper);
        Customer customer = new Customer("Jhudeska");

        customer.goToSuperMarket(ah);
        System.out.println( customer.getName() + " welcome to our Supermarket ");

        boolean inSuperMarket = true;

        while(inSuperMarket){
            System.out.println("Which product do you want to buy?");
            String product = scanner.nextLine();

            //validation
            product = product.toLowerCase();

            if(product.isEmpty() || product.equals(" ")){
                System.out.println("Product cant be empty.\n Choose: cheese, fruit, bread or toiletpaper\n\n");
                inSuperMarket = true;
                continue;
            }

            System.out.println("How many do you want to buy?");
            int amount = scanner.nextInt();

//            TODO: bonus - test the fake product when jan buy an item
//            jan.buyItem(product,amount);
            customer.buyItem(product,amount);

            System.out.println("Want to checkout ?\n 1. Continue shopping\n 2.Checkout\n");
            int userInput = scanner.nextInt();



            if( userInput == 2){
                inSuperMarket = false;
                System.out.println("Thank you for your visit, and goodbye!");
                break;
            }
        }


        scanner.close();
    }

}

