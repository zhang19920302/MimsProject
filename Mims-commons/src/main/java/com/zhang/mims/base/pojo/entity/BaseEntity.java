package com.zhang.mims.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统基础信息类-基础信息实体
 * <P>基础实体信息包含以下属性：
 * 1:系统状态：status<br/>
 * 2:创建人：creatUser<br/>
 * 3:创建时间：createTime<br/>
 * 4:修改人：updateUser<br/>
 * 5:修改时间：updateTime
 * 所有功能的实体信息都必须继承于本基础信息实体信息<br/>
 * </P>
 * @author Arthur
 * @version 1.0.0
 * @since  1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = -7756915474572728704L;
	private String status;                  //系统状态：0-禁用，1-启用
	private String createUser;              //创建人
	private Date createTime;                //创建时间
	private String updateUser;              //修改人
	private Date updateTime;                //修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
