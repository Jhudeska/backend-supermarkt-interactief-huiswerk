package org.inthepresenceofadonai;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //SuperMarkets
        List<Product> productsHalbertEijn = new ArrayList<>();
        List<Product> productsDumbo = new ArrayList<>();
        List<Product> productsCaldi = new ArrayList<>();

        List<Customer> customers = new ArrayList<>();
        Map<String,SuperMarket> superMarkets = new HashMap<>();

//        TODO: prijzen en aantallen aanpassen
        Product bread = new Product("bread", 1.69, 10);
        Product fruit = new Product("fruit", 2.00, 20);
        Product cheese = new Product("cheese", 7.99, 20);
        Product toiletPaper = new Product("toiletPaper", 6.00, 12);

        Product popcorn = new Product("popcorn", 1.69, 10);
        Product milk = new Product("milk", 2.00, 20);
        Product salt = new Product("salt", 7.99, 20);
        Product butter = new Product("butter", 6.00, 12);

        Product egg = new Product("egg", 1.69, 10);
        Product iceCream = new Product("iceCream", 2.00, 20);
        Product salmon = new Product("salmon", 7.99, 20);
        Product beef = new Product("beef", 6.00, 12);

        //Test a fake product
        Product fakeProduct =   new Product(null, 0, 0);

        Customer jan = new Customer("Jan");
        Customer customer = new Customer("Jhudeska");

        SuperMarket dumbo = new SuperMarket("Dumbo", productsDumbo);
        SuperMarket halbertEijn = new SuperMarket("Halbert Eijn", productsHalbertEijn);
        SuperMarket caldi = new SuperMarket("Caldi", productsCaldi);



        productsHalbertEijn.add(bread);
        productsHalbertEijn.add(fruit);
        productsHalbertEijn.add(cheese);
        productsHalbertEijn.add(toiletPaper);

        productsDumbo.add(popcorn);
        productsDumbo.add(milk);
        productsDumbo.add(salt);
        productsDumbo.add(butter);
        productsDumbo.add(fakeProduct);

        productsCaldi.add(egg);
        productsCaldi.add(iceCream);
        productsCaldi.add(salmon);
        productsCaldi.add(beef);

        customers.add(jan);
        customers.add(customer);

        superMarkets.put("Dumbo", dumbo );
        superMarkets.put("Halbert_Eijn", halbertEijn);
        superMarkets.put("Caldi", caldi);


        jan.goToSuperMarket(dumbo);
        customer.goToSuperMarket(halbertEijn);


        boolean inSuperMarket = true;

        while(inSuperMarket){
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - Pick a supermarket");
            System.out.println("2 - Buy a product");
            System.out.println("3 - Restock a product");
            System.out.println("4 - Exit");
            int choice = scanner.nextInt();

            //validation
            if (choice != 0){
                switch (choice){
                    case 1:
                        System.out.println("Which supermarket do you want to go to?");
                        System.out.println("Pick one of the following:");
                        System.out.println("- Halbert Eijn");
                        System.out.println("- Dumbo");
                        System.out.println("- Caldi");
                        String superMarketChoice = scanner.nextLine().toLowerCase();

                        switch (superMarketChoice){
                            case "Halbert Eijn":
                                customer.goToSuperMarket(halbertEijn);
                                break;
                            case "Dumbo":
                                customer.goToSuperMarket(halbertEijn);
                                break;
                            case "Caldi":
                                customer.goToSuperMarket(halbertEijn);
                                break;
                            default:
                                System.out.println("default");
                                return;
                        }
//                        TODO: haal supermakrt uit map met supermarketchoice
//                        Vervolgens haal je met superMarketChoice als key, die supermarkt uit de Map.
//                        En die supermarkt zet je vervolgens in customer met de goToSupermaket methode.
                        break;
                    case 2:
                        if(customer.supermarket == null) {
                            System.out.println("Pick a supermarket first.");
                            break;
                        }
//                        Gebruik de scanner om te vragen "Which product do you want to buy from [supermarket]?"
//                        Gebruik de scanner om te vragen "How many do you want to buy?"
//                        Roep customer.buyItem aan.
                        break;
                    case 3:
//                        TODO: helper functie maken
                        System.out.println("Which supermarket do you want to restock?");
                        System.out.println("Pick one of the following:");
                        System.out.println("- Halbert Eijn");
                        System.out.println("- Dumbo");
                        System.out.println("- Caldi");
                        superMarketChoice = scanner.nextLine().toLowerCase();

//                        Vervolgens haal je met superMarketChoice als key, die supermarkt uit de Map.
//                        Gebruik de scanner om te vragen "Which product do you want to restock in [supermarket]?"
//                        Gebruik de scanner om te vragen "How many do you want to add?"
//                        Roep superMarket.restockItem aan.
                        break;
                    case 4:
                        inSuperMarket = false;
                        System.out.println("Thank you for your visit, and goodbye!");
                        return;
                    default:
                        System.out.println("This menu option has no input yet");
                        break;
                }

            }else {
                System.out.println("Invalid Choice.\n Enter an number (1 - 4)");
                inSuperMarket = true;
                continue;
            }

//            TODO: bonus - test the fake product when jan buy an item
//              ??
//            jan.buyItem(product,amount);
//            customer.buyItem(product,amount);

        }

        scanner.close();
    }

}

