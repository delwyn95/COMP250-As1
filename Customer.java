/**
 * Created by Delwyn on 2018-10-07.
 */
public class Customer {
    private String name;
    private int balance;
    private Basket basket;


    public Customer(String name, int balance){
        this.name = name;
        this.balance = balance;
        this.basket = new Basket();
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public Basket getBasket(){
        return basket;
    }

    public int addFunds(int amount){
       if (amount<0)
            throw new IllegalArgumentException("Add positive value");
       else
        balance+=amount;

       return balance;
    }

    public void addToBasket(MarketProduct item){
        basket.add(item);
    }

    public boolean removeFromBasket(MarketProduct item) {
        return basket.remove(item);
    }
    public String checkOut(){
        String receipt = basket.toString();
        if (this.balance < basket.getTotalCost()){
            throw new IllegalStateException("Not enough funds for purchase");
        }
        this.balance -= basket.getTotalCost();
        basket.clear();

        return receipt;

    }
}