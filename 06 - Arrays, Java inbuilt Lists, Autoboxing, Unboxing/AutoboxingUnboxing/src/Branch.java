import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name, transaction));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name, Double transaction) {
        Customer found = findCustomer(name);
        if (found != null) {
            found.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                return customers.get(i);
            }
        }
        return null;
    }
}
