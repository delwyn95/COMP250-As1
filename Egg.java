/**
 * Created by Delwyn on 2018-10-06.
 */
//class variables are the "phone button"
public class Egg extends MarketProduct {


    private int numEggs;
    private int costofEggs;

    //need own constructor + overide methods cuz of abstract method
    public Egg(String name, int numEggs, int costofEggs) {
        super(name);
        this.numEggs = numEggs;
        this.costofEggs = costofEggs;
    }

    @Override
    public int getCost() {
        //The order matters of the quotient.
        int quotient;
        quotient = numEggs*costofEggs/12;
        return quotient;
    }

    @Override
    public boolean equals(Object object) {
        //Checking if object is an Egg
        if (!(object instanceof Egg))
            return false;
        Egg egg = (Egg) object;
        // field comparison
        return this.getName().equals(egg.getName())
                && this.getCost()==egg.getCost()
                && this.numEggs==egg.numEggs;
    }
}
