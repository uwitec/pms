package com.lihm.pms.system.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author lihuimeng
 * @Discription 基类
 * @Date 2017/8/911:20
 */
public abstract class AbstractEntity implements Serializable{
    private Long id;// 主键id

    private Date createdDate = new Date();// 创建时间

    private Date lastModifiedDate = new Date();// 修改时间

    private String createdBy = "anonymous";// 创建人

    private String lastModifiedBy = "anonymous";// 修改人

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
}
