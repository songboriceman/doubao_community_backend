package com.douyuehan.doubao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.douyuehan.doubao.model.dto.RegisterDTO;
import com.douyuehan.doubao.model.entity.UmsUser;


public interface IUmsUserService extends IService<UmsUser> {

    /**
     * 注册功能
     *
     * @param dto
     * @return 注册对象
     */
    UmsUser executeRegister(RegisterDTO dto);


}
