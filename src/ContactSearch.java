import java.util.List;

// Search contacts

public class ContactSearch {

    public static void search(List<Contact> contacts,
                              SearchCriteria criteria) {

        boolean found = false;

        for (Contact contact : contacts) {

            if (criteria.matches(contact)) {

                System.out.println(contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching contact found.");
        }
    }
}