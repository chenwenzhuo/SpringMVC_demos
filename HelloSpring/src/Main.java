import AnnotationConfig.HelloAnnotationGenerator;
import AnnotationConfig.HelloAnnotation;
import BeanInherit.ChildBean;
import BeanInherit.FatherBean;
import PostProcessor.HelloPostProcessorBean;
import XmlConfig.SayHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*//1.创建一个Spring IoC容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //2.从IoC容器中获取Bean实例
        SayHello sayHello = (SayHello) context.getBean("say_hello");
        //3.调用say()方法
        sayHello.say();

        ApplicationContext annoContext = new AnnotationConfigApplicationContext(HelloAnnotationGenerator.class);
        HelloAnnotation helloAnnotation = annoContext.getBean(HelloAnnotation.class);
        helloAnnotation.tellMessage();

        AbstractApplicationContext postProcessorContext =
                new ClassPathXmlApplicationContext("spring-config.xml");
        HelloPostProcessorBean hppBean =
                (HelloPostProcessorBean) postProcessorContext.getBean("hello_post_processor");
        hppBean.getMessage();
        postProcessorContext.registerShutdownHook();*/

        ApplicationContext inheritContext = new ClassPathXmlApplicationContext("spring-config.xml");
        FatherBean fatherBean = (FatherBean) inheritContext.getBean("father_bean");
        ChildBean childBean = inheritContext.getBean(ChildBean.class);
        fatherBean.tellMessages();
        childBean.tellMessages();
    }
}
