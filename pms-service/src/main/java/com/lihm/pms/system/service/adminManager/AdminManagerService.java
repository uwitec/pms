package com.lihm.pms.system.service.adminManager;

import com.lihm.pms.system.domain.user.AdminInfo;
import com.lihm.pms.system.vo.user.AdminVo;

/**
 * @Author lihuimeng
 * @Discription
 * @Date 2017/8/1015:55
 */
public interface AdminManagerService {

    public AdminVo getAdminInfoByCode(String userCode);
}
