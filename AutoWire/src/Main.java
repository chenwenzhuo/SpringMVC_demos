import AutoWire_ByName.TextEditor_ByName;
import AutoWire_ByType.TextEditor_ByType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        /*TextEditor_ByName teByName = (TextEditor_ByName) context.getBean("text_editor_by_name");
        teByName.checkSpelling();*/

        TextEditor_ByType teByType = (TextEditor_ByType) context.getBean("text_editor_by_type");
        teByType.checkSpelling();
    }
}
