package main.java.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller//将类声明为控制器
@RequestMapping({"/", "/homepage"})//将控制器映射到"/"
public class HomeController {
    @RequestMapping(method = GET)//处理GET请求
    public String home() {
        return "home";//视图名为home
    }
}
