/**
 * Created by Delwyn on 2018-10-06.
 */
public abstract class MarketProduct {

    private String name;

    public MarketProduct(String name) {
        this.name = name;
    }
    public final String getName() {
        return name;
    }
    public abstract int getCost();
    //abstract method is not inherited.
    public abstract boolean equals(Object object);

}

