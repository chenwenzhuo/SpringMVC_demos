package XmlConfig;

import org.springframework.beans.factory.annotation.Required;

public class SayHello {
    private String message;
    private String extraMessage;

    /* @Required 注解用于bean属性的setter方法，
       表示此setter方法对应的bean属性在配置时必须放在XML配置文件中，
       否则容器就会抛出一个BeanInitializationException异常。
     */
    @Required
    public void setMessage(String message) {
        this.message = message;
    }

    public void setExtraMessage(String extraMessage) {
        this.extraMessage = extraMessage;
    }

    public void say() {
        System.out.println("Message is: " + message);
        System.out.println("Extra message is: " + extraMessage);
    }
}
