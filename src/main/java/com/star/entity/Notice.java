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
 * 公告信息表
 * </p>
 *
 * @author 聂建强
 * @since 2022-01-14
 */
@Getter
@Setter
@TableName("notice")
public class Notice {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * ����
     */
    @TableField("content")
    private String content;

    /**
     * ����ʱ��
     */
    @TableField("create_date")
    private LocalDate createDate;

    /**
     * ������
     */
    @TableField("author")
    private Integer author;


}
