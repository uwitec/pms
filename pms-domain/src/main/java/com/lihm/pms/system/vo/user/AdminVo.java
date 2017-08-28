package com.lihm.pms.system.vo.user;

import com.lihm.pms.system.vo.AbstractEntityVo;

/**
 * @Author lihuimeng
 * @Discription
 * @Date 2017/8/1012:01
 */
public class AdminVo extends AbstractEntityVo {

    //姓名
    private String userName;
    //工号
    private String userCode;
    //密码
    private String password;
    //状态（0：有效，1：无效）
    private String status;
    //邮件
    private String email;
    //管理员类型（0：超级管理员，1：普通管理员）
    private String type;
    //电话
    private String telphone;

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
