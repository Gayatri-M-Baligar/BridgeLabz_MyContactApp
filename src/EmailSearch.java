// Search contact by email

public class EmailSearch implements SearchCriteria {

    private String email;

    public EmailSearch(String email) {
        this.email = email;
    }

    @Override
    public boolean matches(Contact contact) {

        for (Email item : contact.getEmails()) {

            if (item.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }

        return false;
    }
}