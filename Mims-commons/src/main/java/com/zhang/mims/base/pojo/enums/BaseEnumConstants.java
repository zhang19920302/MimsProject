package com.zhang.mims.base.pojo.enums;

import com.zhang.mims.base.pojo.vo.BaseVo;

import java.util.Properties;

/**
 * <b>系统基础信息类-系统枚举信息基础常量类</b></b>
 * <P>
 *     本类只为系统响应枚举类型准备
 * </P>
 *@Since: 1.0.0
 *@Author: Arthur
 *@Version: 1.0.0
 */
public class BaseEnumConstants  {
	private static Properties props=new Properties();
	//使用静态代码块加载配置信息
	static  {
		try{
			props.load(BaseEnumConstants.class.getClassLoader()
			.getResourceAsStream("props/base/enum.properties"));
		}catch (Exception e){
				e.printStackTrace();
		}
	}
	//读取信息
	/**
	 * 系统状态：启用
	 */
	static final String ENUM_STATUS_ENABLE=props.getProperty("enum.status.enable");
	/**
	 * 系统状态：禁用
	 */
	static final String ENUM_STATUS_DISABLE=props.getProperty("enum.status.disable");
	/**
	 *系统响应编码 系统响应成功
	 */
	static final Integer ENUM_RESPONSE_CODE_SUCCESS=Integer.parseInt(props.getProperty("enum.responses.code.success"));
	/**
	 *系统响应编码 用户未认证
	 */
	static final Integer ENUM_RESPONSE_CODE_UNAUTH=Integer.parseInt(props.getProperty("enum.responses.code.unauth"));
	/**
	 *系统响应编码 系统业务处理错误
	 */
	static final Integer ENUM_RESPONSE_CODE_ERROR=Integer.parseInt(props.getProperty("enum.responses.code.error"));
	/**
	 *系统响应编码 系统响应异常
	 */
	static final Integer ENUM_RESPONSE_CODE_EXCEPTION=Integer.parseInt(props.getProperty("enum.responses.code.excption"));
}
