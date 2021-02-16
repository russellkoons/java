import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact newContact) {
        int position = myContacts.indexOf(newContact);
        if (position >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
