package io.github.liuhanzhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuhanzhi
 */
@Controller
public class TestController {

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    @ResponseBody
    public String demo(){
        return "hello spring!";
    }
}
