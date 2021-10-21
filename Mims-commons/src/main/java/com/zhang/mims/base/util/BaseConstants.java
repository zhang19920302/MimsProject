package com.zhang.mims.base.util;

import com.zhang.mims.base.pojo.enums.BaseEnumConstants;

import java.io.Serializable;
import java.util.Properties;

/**
 * <b>系统基础信息类-系统常量类</b>
 * @author Arthur
 * @version 1.0.0
 * @since  1.0.0
 */
public class BaseConstants {
	private static Properties props = new Properties();

	//使用静态代码块加载配置信息
	static {
		try {
			props.load(BaseConstants.class.getClassLoader()
					.getResourceAsStream("props/base/base.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 默认当前页码
	 */
	public static final  Integer PAGE_NUM=Integer.parseInt(props.getProperty("base.page.num"));
	/**
	 * 默认每页当前显示数量
	 */
	public static final  Integer PAGE_SIZE=Integer.parseInt(props.getProperty("base.page.size"));
	/**
	 *<b>加密密钥信息</b>
	 */
	public static final String SECRET_KEY=props.getProperty("base.secret.key");
	/**
	 * <b>默认用户有效时间</b>
	 */
	public static final Long EXPIRE_AUTH_SECOND=Long .parseLong(props.getProperty("base.expire.auth.second")) ;

}
