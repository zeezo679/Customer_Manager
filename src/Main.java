import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends ArrayList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of customers this hour");
        int customerPerHR = sc.nextInt();
        sc.nextLine();
        ArrayList<Customer>customers = new ArrayList();
        ArrayList<LoyalCustomer>LCustomers = new ArrayList();
        for(int i = 1; i <= customerPerHR; i++){
            System.out.println("Enter customer details (name, mail)");
            String name = sc.nextLine(), mail = sc.nextLine();
            ArrayList<String>itemsList = new ArrayList();
            ArrayList<Integer>priceList = new ArrayList();

            System.out.println("Enter the number of items this customer bought today");
            int itemsCnt = sc.nextInt();
            sc.nextLine();

            int LcstmrIdx = 0;
            if(itemsCnt>3){ //
                System.out.println("Enter the items and the item price below it");
                for(int j = 0; j < itemsCnt; j++){
                    String itemName = sc.nextLine();
                    int itemPrice = sc.nextInt();
                    sc.nextLine();

                    itemsList.add(itemName); priceList.add(itemPrice);
                }
                LCustomers.add(new LoyalCustomer(name, mail, itemsList, priceList));
                LCustomers.get(LcstmrIdx).discount(priceList);
                LcstmrIdx++;
            }

            else{ //
                System.out.println("Enter the items and the item price below it");
                for(int j = 0; j < itemsCnt; j++){
                    String itemName = sc.nextLine();
                    int itemPrice = sc.nextInt();
                    sc.nextLine();

                    itemsList.add(itemName); priceList.add(itemPrice);
                }
                customers.add(new Customer(name, mail, itemsList, priceList));
            }
        }

        for(int i = 0; i < customers.size(); i++){
            System.out.println("Common Customer: "+" { "+customers.get(i).getName()+" : "+customers.get(i).getItemPrice()+" } ");
        }
        for(int i = 0; i < LCustomers.size(); i++){
            System.out.println("Loyal Customer: "+" { "+ LCustomers.get(i).getName()+" : "+ LCustomers.get(i).getItemPrice()+" } ");
        }
    }
}