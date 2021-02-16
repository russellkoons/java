import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact newContact) {
        if (findContact(newContact) >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position >= 0) {
            myContacts.set(position, newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact toRemove) {
        int position = findContact(toRemove);
        if (position >= 0) {
            myContacts.remove(position);
            return true;
        } else {
            return false;
        }
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        } else {
            return null;
        }
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(String toFind) {
        int position = -1;
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(toFind)) {
                position = i;
            }
        }
        return position;
    }

    private int findContact(Contact toFind) {
        return myContacts.indexOf(toFind);
    }
}
