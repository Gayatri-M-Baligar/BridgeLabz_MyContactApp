import java.util.ArrayList;
import java.util.List;

// Manage contacts

public class ContactManager {

    private List<Contact> contacts = new ArrayList<>();
    private ContactObserver observer;

    public void setObserver(ContactObserver observer) {
        this.observer = observer;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Soft delete

    public void softDelete(Contact contact) {

        contact.setDeleted(true);

        if (observer != null) {
            observer.contactDeleted(contact);
        }
    }

    // Hard delete

    public void hardDelete(Contact contact) {

        contacts.remove(contact);

        if (observer != null) {
            observer.contactDeleted(contact);
        }
    }

    public void showContacts() {

        for (Contact contact : contacts) {

            if (!contact.isDeleted()) {
                System.out.println(contact);
            }
        }
    }
}