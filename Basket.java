/**
 * Created by Delwyn on 2018-10-07.
 */
public class Basket {

    private MarketProduct[] marketProduct;

    public Basket(){
        this.marketProduct = new MarketProduct[0];
    }

    public MarketProduct[] getProducts(){
        MarketProduct[] copyProducts = marketProduct.clone();
        return copyProducts;
    }

    public void add(MarketProduct item){
        //Employee[] empArray2 = new Employee[empArray1.length];

        MarketProduct[] copy = new MarketProduct[marketProduct.length+1];

        for (int i=0; i<marketProduct.length; i++) {
            copy[i] = marketProduct[i];
        }

        copy[marketProduct.length] = item;

        marketProduct = copy;
        }

    public boolean remove(MarketProduct item){
        //remove first occurance of specified element
        //Verify item is in the list:
        int removedIndex=0;
        Boolean removedValue = false;
        int j = 0;
        MarketProduct[] copy = new MarketProduct[marketProduct.length-1];


        for (MarketProduct product : marketProduct) {
            //Checking if Item is in the list and keeps track of
            //the removedIndex after each iteration before break.

            if (product.equals(item)) {
                removedValue = true;
                break;
            }
            removedIndex++;
        }

//        System.out.println("Removed index: "+removedIndex);

        if (removedValue){
            while(j<removedIndex){
                copy[j]=marketProduct[j];
                j++;
            }
            while(j<copy.length){
                copy[j]=marketProduct[j+1];
                j++;
            }
            marketProduct = copy;
            return true;
        }
        else
            return false;
    }

    public void clear(){
        MarketProduct[] copy = new MarketProduct[0];
        marketProduct = copy;
    }

    public int getNumOfProducts(){
        return marketProduct.length;
    }

    public int getSubTotal(){
        int subtotal=0;
        for (MarketProduct item : marketProduct){
            subtotal+= item.getCost();
        }
//        System.out.println("Subtotal: "+subtotal);
        return subtotal;
    }

    public int getTotalTax(){
        int taxTotal=0;

        for(MarketProduct item : marketProduct){
            if (item instanceof Jam){
                taxTotal+=((Jam) item).getCost() * 0.15;
            }
        }
//        System.out.println("TaxTotal: " + taxTotal);
        return taxTotal;
    }
    public int getTotalCost(){
        int totalCost = 0;
        for(MarketProduct item : marketProduct) {
            if (item instanceof Jam) {
                totalCost += ((Jam) item).getCost() * 1.15;
            }
            else
                totalCost += item.getCost();
        }
//        System.out.println("TotalCost: " + totalCost);
        return totalCost;
    }
    @Override
    public String toString(){//overriding the toString() method
        String receipt="";
        for (MarketProduct item : marketProduct){
            if (item.getCost()<=0){
                receipt+= item.getName() + "\t" + "-" + "\n";
            }
            receipt+= item.getName() + "\t" + convertDollar(item.getCost()) + "\n";
        }
        receipt+= "\n\nSubtotal\t" + convertDollar(getSubTotal());
        receipt+= "\nTotal Tax\t" + convertDollar(getTotalTax());
        receipt+= "\n\nTotal Cost\t" + convertDollar(getTotalCost());
        return receipt;
    }

    //Method to convert into Dollar format.
    private static String convertDollar(int cost) {
        double doublcost = cost;
        return String.valueOf(String.format("%.2f", doublcost/100));

    }

}






