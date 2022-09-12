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
 * @since 2022-09-12 11:03:35
 */
@Getter
@Setter
@TableName("food")
public class Food {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 食物热量
     */
    @TableField("calorie")
    private Integer calorie;

    /**
     * 食物名称
     */
    @TableField("name")
    private String name;

    /**
     * 食物蛋白质
     */
    @TableField("protein")
    private Float protein;

    /**
     * 食物脂肪
     */
    @TableField("fat")
    private Float fat;

    /**
     * 食物碳水
     */
    @TableField("carbohydrate")
    private Float carbohydrate;


}
