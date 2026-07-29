// Strategy interface

import java.util.List;

public interface FilterStrategy {

    List<Contact> filter(List<Contact> contacts);
}