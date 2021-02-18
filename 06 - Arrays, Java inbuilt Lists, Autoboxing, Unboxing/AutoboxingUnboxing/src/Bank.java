import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        Branch found = findBranch(name);
        if (found == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branch, String customer, double transaction) {
        Branch foundBranch = findBranch(branch);
        if (foundBranch != null) {
            return foundBranch.newCustomer(customer, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branch, String customer, double transaction) {
        Branch foundBranch = findBranch(branch);
        if (foundBranch != null) {
            return foundBranch.addCustomerTransaction(customer, transaction);
        }
        return false;
    }

    public Branch findBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(name)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String name, boolean print) {
        Branch found = findBranch(name);

        if (found != null) {
            ArrayList<Customer> customers = found.getCustomers();
            System.out.println("Customer details for branch " + found.getName());
            for (int i = 0; i < customers.size(); i++) {
                System.out.println("Customer: " + customers.get(i).getName() + "[" + (i + 1) + "]");
                if (print == true) {
                    ArrayList<Double> transactions = customers.get(i).getTransactions();
                    System.out.println("Transactions");
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (i + 1) + "] Amount " + transactions.get(i));
                    }
                }
            }
        }

        return false;
    }
}
