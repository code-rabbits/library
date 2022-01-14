package com.star.service.impl;

import com.star.entity.BookInfo;
import com.star.mapper.BookInfoMapper;
import com.star.service.BookInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图书信息表 服务实现类
 * </p>
 *
 * @author 聂建强
 * @since 2022-01-14
 */
@Service
public class BookInfoServiceImpl extends ServiceImpl<BookInfoMapper, BookInfo> implements BookInfoService {

}
