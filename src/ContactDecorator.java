// Base decorator class
public abstract class ContactDecorator extends Contact {

    protected Contact contact;

    public ContactDecorator(Contact contact) {
        super(contact.getName());
        this.contact = contact;
    }

    @Override
    public String toString() {
        return contact.toString();
    }
}