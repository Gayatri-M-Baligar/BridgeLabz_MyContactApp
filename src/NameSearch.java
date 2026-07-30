// Search contact by name

public class NameSearch implements SearchCriteria {

    private String name;

    public NameSearch(String name) {
        this.name = name;
    }

    @Override
    public boolean matches(Contact contact) {

        return contact.getName().equalsIgnoreCase(name);
    }
}