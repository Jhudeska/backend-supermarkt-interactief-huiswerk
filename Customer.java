package org.inthepresenceofadonai;

public class Customer {
    String name;
    SuperMarket supermarket;

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    void goToSuperMarket(SuperMarket supermarket){
        this.supermarket = supermarket;
   }

   public void  buyItem(String productName, int amount){
        if(this.supermarket == null){
            System.out.println("Select a supermarket to go to first.\n");
            return;
        }

        // can also be an if statement
       switch (productName) {
           case "bread" -> supermarket.buyBread(amount);
           case "fruit" -> supermarket.buyFruit(amount);
           case "cheese" -> supermarket.buyCheese(amount);
           case "toiletpaper" -> supermarket.buyToiletPaper(amount);
           default -> System.out.println("Sorry, we do not have this product in stock.\n");
       }
   }
}