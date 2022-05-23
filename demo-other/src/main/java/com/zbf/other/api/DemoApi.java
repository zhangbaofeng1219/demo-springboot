package com.zbf.other.api;

import org.springframework.web.bind.annotation.*;

/**
 * @author baofeng.zhang
 * @date 2022-05-23 18:17
 */
@RestController
public class DemoApi {

    @GetMapping("/other/demo/get")
    public String get(String name) {
        System.out.println(name);
        return "SUC";
    }

    @PostMapping("/other/demo/post")
    public String post(@RequestBody Param param) {
        System.out.println(param.getName());
        return "SUC";
    }

    @PutMapping("/other/demo/put")
    public String put(@RequestBody Param param) {
        System.out.println(param.getName());
        return "SUC";
    }

    @DeleteMapping("/other/demo/delete")
    public String delete(String name) {
        System.out.println(name);
        return "SUC";
    }

    class Param {
        String id;
        String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}