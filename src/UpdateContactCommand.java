// Updates the contact name

public class UpdateContactCommand implements EditContactCommand {

    private Contact contact;
    private String newName;
    private ContactMemento previousState;

    public UpdateContactCommand(Contact contact, String newName) {
        this.contact = contact;
        this.newName = newName;
    }

    @Override
    public void execute() {

        previousState = new ContactMemento(contact.getName());

        contact.setName(newName);

        System.out.println("Contact updated.");
    }

    @Override
    public void undo() {

        contact.setName(previousState.getName());

        System.out.println("Undo completed.");
    }
}