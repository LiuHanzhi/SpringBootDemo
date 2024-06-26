package io.github.liuhanzhi.controller;

import io.github.liuhanzhi.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author liuhanzhi
 */
@Controller
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    @ResponseBody
    public String demo(){
        return "hello spring!";
    }

}
