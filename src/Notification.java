import java.time.LocalDateTime;

public abstract class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body) {
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
        this.status = "default\n";
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

    public abstract void transport() throws NoTransportException;

    public String showStatus() {
        return status;
    }

    protected void showContent() {
        System.out.println("Beep boop cannot compute");
    }
}

