package org.inthepresenceofadonai;

public class SuperMarket {
        Product bread;
        Product fruit;
        Product cheese;
        Product toiletPaper;
        int stock = 0;

    public SuperMarket(Product bread, Product fruit, Product cheese, Product toiletPaper){
            this.bread = bread;
            this.fruit = fruit;
            this.cheese = cheese;
            this.toiletPaper = toiletPaper;
    }

    private void buyItem(Product product, int amount){
           if(amount <= product.amount) {
             stock = amount - product.amount;
            double totalAmount =  amount * product.price;
            System.out.println( "You bought " + amount + " " + product.name + " for " + totalAmount +  " euro.\n");
        }else {
            System.out.println("You cannot buy " + amount + " " + product.name + ", we only have " + stock + " of " +  product.name + " in stock.\n");
        }
    }

    public void buyBread(int amount) {
        buyItem(this.bread, amount);
    }

    public void buyFruit(int amount){
        buyItem(this.fruit, amount);
    }

    public void buyCheese(int amount){
        buyItem(this.cheese, amount);
    }

    public void buyToiletPaper(int amount){
        buyItem(this.toiletPaper, amount);
    }




}