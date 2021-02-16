import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact newContact) {
        if (myContacts.indexOf(newContact) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = myContacts.indexOf(oldContact);
        if (position >= 0) {
            myContacts.set(position, newContact);
            return true;
        } else {
            return false;
        }
    }
}
