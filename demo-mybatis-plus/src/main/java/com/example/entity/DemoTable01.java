package com.example.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 柯南
 * @since 2023-02-07 03:46:37
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("demo_table_01")
@ApiModel(value = "DemoTable01对象", description = "")
public class DemoTable01 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty("字段01")
    @TableField("arg01")
    private String arg01;

    @ApiModelProperty("字段02")
    @TableField("arg02")
    private String arg02;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty("更新时间")
    @TableField("update_time")
    private Date updateTime;


}
