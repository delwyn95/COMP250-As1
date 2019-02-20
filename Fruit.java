/**
 * Created by Delwyn on 2018-10-06.
 */
public class Fruit extends MarketProduct {

     private double weight;
     private int priceKg;
     //Using protected so it can be accessed in Child class

     public Fruit(String name, double weight, int price){
         super(name);
         this.weight = weight;
         this.priceKg = price;
     }
     //Getter to access the PRIVATE variables
     public double getWeight(){
         return weight;
     }
     public int getPriceKg(){
         return priceKg;
     }

    @Override
    public int getCost() {
        //Cost of fruit is based on price (per KG) * weight.
         double costofFruit;
        costofFruit = priceKg * weight;

         return (int) costofFruit;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Fruit))
            return false;
        Fruit fruit = (Fruit) object;
        // Field comparison:
        return this.getName().equals(fruit.getName())
                && this.weight==fruit.weight
                && this.priceKg==fruit.priceKg;


    }
}
