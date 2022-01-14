package com.star.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 借阅信息表
 * </p>
 *
 * @author 聂建强
 * @since 2022-01-14
 */
@Getter
@Setter
@TableName("lend_list")
public class LendList {

    /**
     * ϵͳ���
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * ��ı��
     */
    @TableField("book_id")
    private Integer bookId;

    /**
     * ����id
     */
    @TableField("reader_id")
    private Integer readerId;

    /**
     * ���ʱ��
     */
    @TableField("lend_date")
    private LocalDateTime lendDate;

    /**
     * �黹ʱ��
     */
    @TableField("back_date")
    private LocalDateTime backDate;

    /**
     * �黹ͼ�����ͣ�	              0�������黹	              1�����ڹ黹	              2������黹	              3����ʧ����	              4������
     */
    @TableField("type")
    private Integer type;

    /**
     * ��ע
     */
    @TableField("remarks")
    private String remarks;


}
