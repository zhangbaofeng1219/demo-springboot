package com.zbf.demo.demomybatis.demo;

import com.zbf.demo.demomybatis.mapper.DemoTableMapper;
import com.zbf.demo.demomybatis.pojo.db.DemoTablePojo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author baofeng.zhang
 * @date 2022-05-13 14:20
 */
@RestController
public class Demo {

    @Resource
    private DemoTableMapper demoTableMapper;

    @GetMapping("/test")
    public String test() {
        List<DemoTablePojo> demoTablePojos = demoTableMapper.getById("1");
        System.out.println(demoTablePojos.toString());
        return "SUC";
    }
}