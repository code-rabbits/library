package com.star.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author 聂建强
 * @since 2022-01-14
 */
@Getter
@Setter
@TableName("admin")
public class Admin {

    /**
     * ϵͳ���
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * �û���
     */
    @TableField("username")
    private String username;

    /**
     * ��¼����
     */
    @TableField("password")
    private String password;

    /**
     * ���ࣺ	            ��ͨ����Ա :0	            ϵͳ����Ա�� 1
     */
    @TableField("type")
    private Integer type;


}
