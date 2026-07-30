// Search contact by phone number

public class PhoneSearch implements SearchCriteria {

    private String phone;

    public PhoneSearch(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean matches(Contact contact) {

        for (PhoneNumber number : contact.getPhoneNumbers()) {

            if (number.getNumber().equals(phone)) {
                return true;
            }
        }

        return false;
    }
}