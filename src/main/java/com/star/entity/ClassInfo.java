package com.star.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 图书分类表
 * </p>
 *
 * @author 聂建强
 * @since 2022-01-14
 */
@Getter
@Setter
@TableName("class_info")
public class ClassInfo {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("remarks")
    private String remarks;


}
