package com.zhang.mims.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>系统基础信息类-控制层基础类</b>>
 * <P>
 *     控制层基础类依赖注入了如下信息：<br/>
 *     1:HttpServerletRequest<br/>
 *     2:HttpServerletResponse<br/>
 *     3:HttpSession<br/>
 *     其余所有功能控制层类都必须继承于本控制层基础类
 * </P>
 * @Since: 1.0.0
 * @Author: Arthur
 * @Version: 1.0.0
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}
