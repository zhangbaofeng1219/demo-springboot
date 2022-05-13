package com.zbf.demo.demothreadpool.demo;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author baofeng.zhang
 * @date 2022-05-13 14:46
 */
@RestController
public class Demo {

    @Resource
    private ThreadPoolTaskExecutor syncExecutorPool;

    public void demo() {
        syncExecutorPool.execute(() ->
                System.out.println(123)
        );
    }
}