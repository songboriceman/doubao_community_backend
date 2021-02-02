package com.douyuehan.doubao.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.douyuehan.doubao.common.api.ApiResult;
import com.douyuehan.doubao.model.entity.BmsBillboard;
import com.douyuehan.doubao.model.entity.BmsTip;
import com.douyuehan.doubao.service.IBmsBillboardService;
import com.douyuehan.doubao.service.IBmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tip")
public class BmsTipController extends BaseController {
    @Resource
    private IBmsTipService bmsTipService;

    @GetMapping("/today")
    public ApiResult<BmsTip> getRandomTip() {
        BmsTip tip = bmsTipService.getRandomTip();
        return ApiResult.success(tip);
    }
}
