package io.github.liuhanzhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuhanzhi
 */
@Controller
@RequestMapping(value = "/limit")
public class TestLimitController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String testLimit(Integer limit) {
        return "ok!";
    }

}
