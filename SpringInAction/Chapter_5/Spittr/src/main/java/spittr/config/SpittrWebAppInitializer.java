package main.java.spittr.config;

import main.java.spittr.web.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /*Spring Web应用中存在两个应用上下文，
    * DispatcherServlet上下文和ContextLoaderListener上下文。
    * DispatcherServlet上下文加载包含Web组件的bean，ContextLoaderListener上下文加载应用中的其他bean。*/

    /*getRootConfigClasses()方法返回的带有@Configuration注解的类
    将会用来配置ContextLoaderListener应用上下文中的bean*/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /*getServletConfigClasses()方法返回的带有@Configuration注解的类
    将会用来定义DispatcherServlet上下文中的bean*/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    /*getServletMappings()方法，
    * 将一个或多个路径映射到DispatcherServlet上。
    * 此处映射"/"，表示它是应用的默认Servlet，它会处理进入应用的所有请求*/
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
