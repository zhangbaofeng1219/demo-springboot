package com.zbf.demo.demomybatis.pojo.db;

import lombok.Data;

import java.util.Date;

/**
 * @author baofeng.zhang
 * @date 2022-05-13 14:15
 */
@Data
public class DemoTablePojo {
    private String id;
    private String arg01;
    private String arg02;
    private Date createTime;
}