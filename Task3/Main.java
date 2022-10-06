import java.util.ArrayList;

public class Main {
   public static  ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
        Customer c1 = new Customer("Tobias", "Tonndorff", "TOBT", 1);
        Customer c2 = new Customer("morten", "andersen", "MORA", 2);
        Customer c3 = new Customer("Torben", "Diggeldauer", "TORD", 3);
        Customer c4 = new Customer("Jakob", "Hansen", "JAHA", 4);
        Customer c5 = new Customer("pjevert", "sminkedukken", "PJSM", 5);
        Customer c6 = new Customer("mogens", "lieberhardt", "MOLI", 6);

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);
        printCostumers(customers);

    }
    public static void printCostumers(ArrayList<Customer> arrayList){
        for (Customer c: arrayList) {
            System.out.println(c.toString());
        }
    }
}