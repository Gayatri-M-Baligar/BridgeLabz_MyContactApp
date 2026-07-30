// Manage tags

public class TagManager {

    private TagObserver observer;

    public void setObserver(TagObserver observer) {
        this.observer = observer;
    }

    public void addTag(Contact contact, Tag tag) {

        contact.addTag(tag);

        if (observer != null) {
            observer.tagAdded(contact, tag);
        }
    }
}