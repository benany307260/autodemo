package com.bentest.autodemo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_info")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private Long uid;
    @Column(unique =true)
    private String username;//帐号
    @Column(name="user_type")
    private String userType;//用户类型，'ADM',系统管理员；'EMP'：员工；'D00'：:业务员；'C00'：业务员子用户；'SUP'：外包；'APP'：应用系统
    @Column(name="user_real_name")
    private String userRealName;//用户姓名
    @Column(name="ORG_CODE")
    private String orgCode;//所属组织编码。目前用该字段区分用户类型：ODC为外包人员，其他为无限极人员
   
    
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
 }