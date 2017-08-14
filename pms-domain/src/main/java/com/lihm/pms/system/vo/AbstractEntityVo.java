package com.lihm.pms.system.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author lihuimeng
 * @Discription
 * @Date 2017/8/1011:59
 */
public abstract class AbstractEntityVo implements Serializable {

    private static final long serialVersionUID = 4833684695363912915L;
    protected Long id;                    // 主键id
    protected String createdBy;           // 创建人
    protected Date createdDate;           // 创建时间
    protected String lastModifiedBy;      // 修改人
    protected Date lastModifiedDate;      // 修改时间
    protected Integer version;		    // 版本号

}