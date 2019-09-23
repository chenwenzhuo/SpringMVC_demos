package AnnotationConfig;

public class HelloAnnotation {
    private String message;

    public HelloAnnotation(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void tellMessage() {
        System.out.println("Message is: " + message);
    }
}
