public class Main {

    public static void main(String[] args) {

        Customer del = new Customer("del", 100000);
//        Basket myBasket = new Basket();
        Egg myEggs = new Egg("Quail eggs", 12, 200);
        Fruit myFruit = new Fruit("apple", 1,0);
        Egg herEggs = new Egg("Penguin eggs", 12, 200);
        Fruit hisFruit = new Fruit("orange", 1,500);
        Egg hisEggs = new Egg("Black eggs", 12, 200);
        Jam myJam = new Jam("Strawberry",2, 830);

        del.getBasket().add(myEggs);
        del.getBasket().add(myFruit);
        del.getBasket().add(hisEggs);
        del.getBasket().add(hisFruit);
        del.getBasket().add(herEggs);
        del.getBasket().add(myJam);

//        myBasket.remove(hisFruit);
//        myBasket.clear();
//        myBasket.getSubTotal();
//        myBasket.getTotalTax();
//        myBasket.getTotalCost();
        System.out.println(del.checkOut());

//        for(MarketProduct item : myBasket.getProducts())
//        System.out.println(item);
//        myBasket.remove(myEggs);
    }
}
