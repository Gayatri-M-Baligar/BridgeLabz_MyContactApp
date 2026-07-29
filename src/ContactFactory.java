public class ContactFactory {

    public static Contact createContact(String type, String name) {

        if (type.equalsIgnoreCase("Organization")) {
            return new Organization(name);
        }

        return new Person(name);
    }
}