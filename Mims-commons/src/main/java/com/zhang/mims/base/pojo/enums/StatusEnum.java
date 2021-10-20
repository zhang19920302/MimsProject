package com.zhang.mims.base.pojo.enums;

/**
 * <b>系统基础信息类-系统状态枚举信息</b>
 * <P>
 *       本类只为系统响应枚举类型准备
 * </P>
 * @Since: 1.0.0
 * @Author: Arthur
 * @Version: 1.0.0
 */
public enum StatusEnum {
	STATUS_ENABLE(BaseEnumConstants.ENUM_STATUS_ENABLE,"启用"),
	STATUS_ENDISABLE(BaseEnumConstants.ENUM_STATUS_DISABLE,"禁用")
			;
	private String name;                   //编码
	private String remark;                 //说明

	private StatusEnum(String name, String remark) {
		this.name = name;
		this.remark = remark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
