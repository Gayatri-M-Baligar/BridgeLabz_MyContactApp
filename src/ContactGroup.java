import java.util.ArrayList;
import java.util.List;

// Group of contacts

public class ContactGroup implements ContactComponent {

    private String groupName;
    private List<ContactComponent> contacts;

    public ContactGroup(String groupName) {

        this.groupName = groupName;
        contacts = new ArrayList<>();
    }

    public void add(ContactComponent contact) {
        contacts.add(contact);
    }

    public void remove(ContactComponent contact) {
        contacts.remove(contact);
    }

    @Override
    public void showDetails() {

        System.out.println("\nGroup : " + groupName);

        for (ContactComponent contact : contacts) {
            contact.showDetails();
        }
    }

    public void deleteAll() {

        contacts.clear();

        System.out.println("\nAll contacts removed from " + groupName);
    }
}