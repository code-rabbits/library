package com.star.service.impl;

import com.star.entity.Notice;
import com.star.mapper.NoticeMapper;
import com.star.service.NoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公告信息表 服务实现类
 * </p>
 *
 * @author 聂建强
 * @since 2022-01-14
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticeService {

}
