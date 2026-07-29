// Observer implementation

public class ContactTagObserver implements TagObserver {

    @Override
    public void tagAdded(Contact contact, Tag tag) {

        System.out.println("Tag '" + tag.getName()
                + "' added to " + contact.getName());
    }
}