package top.syhan.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: syhan
 * @create: 2022-07-29
 **/
@RestController
public class HelloController {
    @GetMapping("hello")
    public String getHello() {
        return "hello world";
    }
}
