// Display contact name in uppercase
public class UpperCaseDecorator extends ContactDecorator {

    public UpperCaseDecorator(Contact contact) {
        super(contact);
    }

    @Override
    public String toString() {

        return contact.toString().replace(contact.getName(),
                contact.getName().toUpperCase());
    }
}