package com.discipline.better.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzp
 * @since 2022-09-09 04:53:12
 */
@Getter
@Setter
@TableName("password")
public class Password {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("application_name")
    private String applicationName;

    @TableField("password")
    private String password;

    @TableField("user_name")
    private String userName;


}
