import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body, String status) {
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
        this.status = "Sent";
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getStatus() {
        return status;
    }

    public void transport() throws NoTransportException {

    }

    public String showStatus() {
        return status;
    }
}

class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String status, String recipient, String smtpProvider) {
        super(subject, body, status);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() throws NoTransportException {
            System.out.println(getCreatedAt());
            System.out.println(getBody());
            System.out.println(getSubject());
            System.out.println(getRecipient());
            System.out.println(getSmtpProvider());
    }
}

class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String status, String recipient, String smsProvider) {
        super(subject, body, status);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println(getCreatedAt());
        System.out.println(getBody());
        System.out.println(getSubject());
        System.out.println(getRecipient());
        System.out.println(getSmsProvider());
    }
}