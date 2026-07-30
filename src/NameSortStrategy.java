// Sort contacts by name

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameSortStrategy implements FilterStrategy {

    @Override
    public List<Contact> filter(List<Contact> contacts) {

        Collections.sort(contacts, Comparator.comparing(Contact::getName));

        return contacts;
    }
}