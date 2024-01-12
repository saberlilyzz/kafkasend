package com.TimedSend.service.impl;

import com.TimedSend.model.TbsiInstRealtime;
import com.TimedSend.mapper.TbsiInstRealtimeMapper;
import com.TimedSend.service.ITbsiInstRealtimeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 实时估值结果表 服务实现类
 * </p>
 *
 * @author gaocheng
 * @since 2023-09-13
 */
@Service
public class TbsiInstRealtimeServiceImpl extends ServiceImpl<TbsiInstRealtimeMapper, TbsiInstRealtime> implements ITbsiInstRealtimeService {

}
