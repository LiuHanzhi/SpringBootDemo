package io.github.liuhanzhi.controller;

import io.github.liuhanzhi.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author liuhanzhi
 */
@Controller
public class Test1Controller {

    @Resource
    private TestService testService;

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    @ResponseBody
    public String test1(){
        testService.test(1);
        return "hello spring!";
    }

}
