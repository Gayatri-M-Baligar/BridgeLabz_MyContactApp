import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.HashSet;
import java.util.Set;

public class Contact implements ContactComponent{

    private String id;
    private String name;
    private List<PhoneNumber> phoneNumbers;
    private List<Email> emails;
    private LocalDateTime createdDate;
    private boolean deleted = false;
    private Set<Tag> tags = new HashSet<>();


    public Contact(String name) {

        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
        this.emails = new ArrayList<>();
        this.createdDate = LocalDateTime.now();
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public void addEmail(Email email) {
        emails.add(email);
    }

    public String getName() {
        return name;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<Email> getEmails() {
        return emails;
    }

    @Override
    public String toString() {

        return "\nContact ID : " + id +
                "\nName       : " + name +
                "\nPhones     : " + phoneNumbers +
                "\nEmails     : " + emails +
                "\nTags       : " + tags +
                "\nCreated On : " + createdDate;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public void showDetails() {
        System.out.println(this);
    }
    public java.time.LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void addTag(Tag tag) {
        tags.add(tag);
    }

    public Set<Tag> getTags() {
        return tags;
    }
}