package com.zbf.demolayuimini.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author baofeng.zhang
 * @date 2022-05-16 1:36
 */
@Controller
public class WebApi {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}