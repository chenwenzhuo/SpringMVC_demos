package BeanInherit;

public class FatherBean {
    private String message_1;
    private String message_2;

    public String getMessage_1() {
        return message_1;
    }

    public void setMessage_1(String message_1) {
        this.message_1 = message_1;
    }

    public String getMessage_2() {
        return message_2;
    }

    public void setMessage_2(String message_2) {
        this.message_2 = message_2;
    }

    public void tellMessages() {
        System.out.println("This is " + this.getClass() + ", message_1 is : " + this.message_1);
        System.out.println("This is " + this.getClass() + ", message_2 is : " + this.message_2);
    }
}
