// Hide part of the email address
public class MaskEmailDecorator extends ContactDecorator {

    public MaskEmailDecorator(Contact contact) {
        super(contact);
    }

    @Override
    public String toString() {

        String email = contact.getEmails().get(0).getEmail();

        int index = email.indexOf("@");

        String masked = email.substring(0, 2)
                + "****"
                + email.substring(index);

        return contact.toString().replace(email, masked);
    }
}