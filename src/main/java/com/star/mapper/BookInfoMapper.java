package com.star.mapper;

import com.star.entity.BookInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 图书信息表 Mapper 接口
 * </p>
 *
 * @author 聂建强
 * @since 2022-01-14
 */
@Mapper
public interface BookInfoMapper extends BaseMapper<BookInfo> {

}
