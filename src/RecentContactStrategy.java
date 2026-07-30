// Show recently added contacts

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RecentContactStrategy implements FilterStrategy {

    @Override
    public List<Contact> filter(List<Contact> contacts) {

        Collections.sort(contacts,
                Comparator.comparing(Contact::getCreatedDate).reversed());

        return contacts;
    }
}