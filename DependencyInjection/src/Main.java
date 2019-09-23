import CollectionInjection.JavaCollections;
import ConstructorBasedInjection.TextEditor_CBI;
import SetterBasedInjection.TextEditor_SBI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        /*TextEditor_CBI textEditorCBI = (TextEditor_CBI) context.getBean("text_editor_CBI");
        textEditorCBI.checkSpelling();*/

        /*TextEditor_SBI textEditorSBI = (TextEditor_SBI) context.getBean("text_editor_SBI");
        textEditorSBI.checkSpelling();*/

        JavaCollections javaCollections = (JavaCollections) context.getBean("java_collections");
        javaCollections.getAddressList();
        javaCollections.getAddressSet();
        javaCollections.getAddressMap();
        javaCollections.getAddressProperties();
    }
}
