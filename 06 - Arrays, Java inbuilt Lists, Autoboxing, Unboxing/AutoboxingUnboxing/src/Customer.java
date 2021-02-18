import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, Double transaction) {
        this.name = name;
        this.transactions.add(transaction);
    }
}
