package cn.zsl.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//这个类所有方法返回的数据直接写给浏览器，（如果是对象还能够转为json数据）
//@ResponseBody
//@Controller
//@RestController可以代替@ResponseBody和@Controller，在spring4.2以后才有

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello world quick";
    }

    //以后会有好多的不同请求，RESTAPI的方式
}
