package com.star.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 图书信息表
 * </p>
 *
 * @author 聂建强
 * @since 2022-01-14
 */
@Getter
@Setter
@TableName("book_info")
public class BookInfo {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("author")
    private String author;

    @TableField("publish")
    private String publish;

    /**
     * ��׼���
     */
    @TableField("ISBN")
    private String isbn;

    /**
     * ��Ľ���
     */
    @TableField("introduction")
    private String introduction;

    /**
     * ����
     */
    @TableField("language")
    private String language;

    /**
     * �۸���Ϣ
     */
    @TableField("price")
    private Double price;

    /**
     * ����ʱ��
     */
    @TableField("pub_date")
    private LocalDate pubDate;

    /**
     * 类型id
     */
    @TableField("type_id")
    private Integer typeId;

    /**
     * 0 未借出	1 已经借出
     */
    @TableField("status")
    private Integer status;


}
