package com.douyuehan.doubao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.douyuehan.doubao.mapper.BmsBillboardMapper;
import com.douyuehan.doubao.mapper.BmsTipMapper;
import com.douyuehan.doubao.model.entity.BmsBillboard;
import com.douyuehan.doubao.model.entity.BmsTip;
import com.douyuehan.doubao.service.IBmsBillboardService;
import com.douyuehan.doubao.service.IBmsTipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class IBmsTipServiceImpl extends ServiceImpl<BmsTipMapper
        , BmsTip> implements IBmsTipService {

    @Override
    public BmsTip getRandomTip() {
        BmsTip todayTip = null;
        try {
            todayTip = this.baseMapper.getRandomTip();
        } catch (Exception e) {
            log.info("tip转化失败");
        }
        return todayTip;
    }
}
