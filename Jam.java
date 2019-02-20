/**
 * Created by Delwyn on 2018-10-06.
 */
public class Jam extends MarketProduct {
    private int numJars;
    private int priceJar; //Price per jar


    public Jam(String name, int numJars, int price) {
        super(name);
        this.numJars = numJars;
        this.priceJar = price; //Price is per jar
    }


    @Override
    public int getCost() {
        return (numJars * priceJar);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Jam))
            return false;
        Jam jam = (Jam) object;
        // field comparison
        return this.getName().equals(jam.getName())
                && this.getCost()==jam.getCost()
                && this.numJars==jam.numJars;
    }
}
