import java.util.ArrayList;

public class LoyalCustomer extends Customer{
    private final int discountRate = 2;

    public LoyalCustomer(String name, String mail, ArrayList<String> boughtItems, ArrayList<Integer> itemPrice) {
        super(name, mail, boughtItems, itemPrice);
    }

    public void discount(ArrayList <Integer>prices){
        for(int i = 0; i < prices.size(); i++){
            prices.set(i, prices.get(i)/2);
        }
    }
}
