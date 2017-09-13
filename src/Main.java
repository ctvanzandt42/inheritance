public class Main {
    public static void main(String[] args) throws NoTransportException {
        Notification email = new EmailNotification("Test Email", "Hello, test 1 2 3", "ctvanzandt42@gmail.com", "Gmail");
        Notification text = new TextNotification("Hello", "Hope you're doing well!", "(901) 831-6546", "AT&T");

        email.transport();
        text.transport();

        System.out.println(email.showStatus());
        System.out.println(text.showStatus());

        email.showContent();

        Notification emailClone = (EmailNotification) email.clone();
        System.out.println("Checking if clone and original match: " + email.equals(emailClone));
        emailClone.transport();
    }
}