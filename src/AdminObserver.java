// Admin gets notified when a contact is deleted

public class AdminObserver implements ContactObserver {

    @Override
    public void contactDeleted(Contact contact) {

        System.out.println("Admin Notification : " +
                contact.getName() + " was deleted.");
    }
}