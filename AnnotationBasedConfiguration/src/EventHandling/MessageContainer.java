package EventHandling;

public class MessageContainer {
    private String message;

    public String getMessage() {
        System.out.println("Message is : " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
