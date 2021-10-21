package com.zhang.mims.base.pojo.vo;

import com.zhang.mims.base.pojo.enums.ResponseCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * 系统基础信息类-系统响应视图信息实体
 * <P>系统响应视图信息包含以下属性：
 * 1:响应编码：code<br/>
 * 2:响应数据：data<br/>
 * 所有返回前端数据都必须以本系统响应视图信息返回
 * </P>
 * @author Arthur
 * @version 1.0.0
 * @since  1.0.0
 */
@ApiModel("系统基础信息类-系统响应视图信息实")
public class ResponseVo<E> implements Serializable {
	private static final long serialVersionUID = 4417008093141332202L;
	@ApiModelProperty(name="系统响应编码",example = "2000")
	private Integer code;               //系统响应编码
	@ApiModelProperty(name="系统响应数据")
	private E data;                     //系统响应数据

	private ResponseVo(Integer code, E data) {
		this.code = code;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	/**
	 * 获得系统响应成功视图信息
	 * @return
	 */
	public static ResponseVo getSucessResponseVo(){
		return new ResponseVo(ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getCode(),
				ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getRemark());

	}
	/**
	 * 获得系统响应成功视图信息
	 * @return
	 */
	public static ResponseVo getSucessResponseVo(Object data){
		return new ResponseVo(ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getCode(), data);
	}
	/**
	 * 获得用户未认证响应视图信息
	 */
	public  static ResponseVo getUnAuthResponseVo(){
		return  new ResponseVo(ResponseCodeEnum.RESPONSE_CODE_UNAUTH.getCode(),
				ResponseCodeEnum.RESPONSE_CODE_UNAUTH.getCode());
	}
	/**
	 * 获得用户业务处理错误视图信息
	 */
	public  static ResponseVo getErrorResponseVo(Object data ){
		return new ResponseVo(ResponseCodeEnum.RESPONSE_CODE_ERROR.getCode(), data);
	}
	/**
	 * 获得用户响应异常视图信息
	 */
	public static ResponseVo getExceptionResponseVo(Exception exception){
		return new ResponseVo(ResponseCodeEnum.RESPONSE_CODE_EXCEPTION.getCode()
				,exception.getMessage());
	}
}
