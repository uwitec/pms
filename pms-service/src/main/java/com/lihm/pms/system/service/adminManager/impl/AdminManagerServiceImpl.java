package com.lihm.pms.system.service.adminManager.impl;

import com.lihm.pms.system.domain.user.AdminInfo;
import com.lihm.pms.system.mapper.user.AdminInfoMapper;
import com.lihm.pms.system.service.adminManager.AdminManagerService;
import com.lihm.pms.system.vo.user.AdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author lihuimeng
 * @Discription
 * @Date 2017/8/1015:57
 */

@Service
public class AdminManagerServiceImpl implements AdminManagerService {

    @Autowired
    private AdminInfoMapper adminInfoMapper;

    public AdminVo getAdminInfoByCode(String userCode) {
        AdminInfo info = new AdminInfo();
        info.setUserCode(userCode);
        return adminInfoMapper.findOne(info);
    }
}
