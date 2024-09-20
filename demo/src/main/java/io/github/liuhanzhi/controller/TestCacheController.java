package io.github.liuhanzhi.controller;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestCacheController {

    @RequestMapping(value = "/myCache", method = RequestMethod.GET)
    @ResponseBody
    @Cacheable(value = "myCache", keyGenerator = "customKeyGenerator")
    public String getData(String param) {
        System.out.println("start get data");
        return String.format("Data for %s", param);
    }
}
