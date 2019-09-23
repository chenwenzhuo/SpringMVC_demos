import EventHandling.MessageContainer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        context.start();

        MessageContainer container = (MessageContainer) context.getBean("messageContainer");
        container.getMessage();

        context.stop();
    }
}
