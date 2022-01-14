package com.star.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 读者借阅卡表
 * </p>
 *
 * @author 聂建强
 * @since 2022-01-14
 */
@Getter
@Setter
@TableName("reader_card")
public class ReaderCard {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * ��¼����
     */
    @TableField("username")
    private String username;

    /**
     * ����
     */
    @TableField("password")
    private String password;

    /**
     * 借书数量
     */
    @TableField("number")
    private Integer number;

    /**
     * ��������
     */
    @TableField("name")
    private String name;

    /**
     * �Ա�
     */
    @TableField("sex")
    private String sex;

    /**
     * ��������
     */
    @TableField("birthday")
    private LocalDate birthday;

    /**
     * ��ַ
     */
    @TableField("address")
    private String address;

    /**
     * �绰
     */
    @TableField("tel")
    private String tel;

    /**
     * ����
     */
    @TableField("email")
    private String email;

    @TableField("creat_date")
    private LocalDateTime creatDate;

    @TableField("cjr")
    private Integer cjr;

    @TableField("cardnumber")
    private String cardnumber;


}
