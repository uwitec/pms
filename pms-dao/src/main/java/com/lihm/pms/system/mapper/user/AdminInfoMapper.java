package com.lihm.pms.system.mapper.user;

import com.lihm.pms.system.domain.user.AdminInfo;
import com.lihm.pms.system.vo.user.AdminVo;

import java.util.List;

/**
 * @Author lihuimeng
 * @Discription
 * @Date 2017/8/1011:51
 */
public interface AdminInfoMapper {

    public AdminVo findOne(AdminInfo adminInfo);

    public int update(AdminInfo adminInfo);

    public int save(AdminInfo adminInfo);

    public List<AdminVo> findAll(AdminInfo adminInfo);
}
