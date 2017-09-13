public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        showContent();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println("Created At: " + getCreatedAt());
        System.out.println("Body: " + getBody());
        System.out.println("Subject: " + getSubject());
        System.out.println("Recipient: " + getRecipient());
        System.out.println("Provider: " + getSmsProvider() + "\n");
    }
}