/**
 * Command class for updating user profile.
 */
public class UpdateProfileCommand implements ProfileCommand {

    private User user;
    private String fullName;
    private String email;

    public UpdateProfileCommand(User user, String fullName, String email) {
        this.user = user;
        this.fullName = fullName;
        this.email = email;
    }

    @Override
    public void execute() {

        user.setFullName(fullName);
        user.setEmail(email);

        System.out.println("\nProfile updated successfully.");
    }
}