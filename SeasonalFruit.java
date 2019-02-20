/**
 * Created by Delwyn on 2018-10-07.
 */
public class SeasonalFruit extends Fruit {

    public SeasonalFruit(String name, double weight, int priceKg) {
        super(name, weight, priceKg);
    }

    @Override
    public int getCost() {
        double costofFruit;
        costofFruit = 0.85 * getPriceKg() * getWeight();
        return (int) costofFruit;
    }
}
