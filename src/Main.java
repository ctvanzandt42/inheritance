public class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification("Test Email", "Hello, test 1 2 3", "ctvanzandt42@gmail.com", "Gmail");
        Notification text = new TextNotification("Hello", "Hope you're doing well!", "(901) 831-6546", "AT&T");

        email.transport();
        text.transport();
        System.out.println(email.status);
        System.out.println(text.status);
    }
}