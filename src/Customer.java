import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {
    private String name;
    private String mail;
    private ArrayList<String>boughtItems = new ArrayList();
    protected ArrayList<Integer>itemPrice = new ArrayList();
    private ArrayList<String>purchaseHistory = new ArrayList();

    public Customer(String name, String mail, ArrayList<String> boughtItems, ArrayList<Integer> itemPrice) {
        this.name = name;
        this.mail = mail;
        this.boughtItems = boughtItems;
        this.itemPrice = itemPrice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<Integer> getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(ArrayList<Integer> itemPrice) {
        this.itemPrice = itemPrice;
    }

    public ArrayList<String> getBoughtItems() {
        return boughtItems;
    }

    public void setBoughtItems(ArrayList<String> boughtItems) {
        this.boughtItems = boughtItems;
    }


    //    public void setPurchaseHistory(ArrayList purchaseHistory) {
//        this.purchaseHistory = purchaseHistory;
//    }
}
