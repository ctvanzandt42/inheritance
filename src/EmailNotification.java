public class EmailNotification extends Notification implements Cloneable{
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "email pending\n";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println("Created At: " + getCreatedAt());
        System.out.println("Body: " + getBody());
        System.out.println("Subject: " + getSubject());
        System.out.println("Recipient: " + getRecipient());
        System.out.println("Provider: " + getSmtpProvider() + "\n");
    }

    @Override
    public void showContent() {
        super.showContent();
        System.out.println("NOW I'M PUBLICCCCCCCC\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (!getRecipient().equals(that.getRecipient())) return false;
        return getSmtpProvider().equals(that.getSmtpProvider());
    }

    @Override
    public int hashCode() {
        int result = getRecipient().hashCode();
        result = 31 * result + getSmtpProvider().hashCode();
        return result;
    }

    @Override
    protected Object clone() {

        return new EmailNotification(getSubject(), getBody(), getRecipient(), getSmtpProvider() );
    }
}
