package com.zhang.mims.base.configuration;

import org.apache.http.impl.cookie.BasicPathHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 系统基础信息类-Swagger接口文档生成框架配置类>
 * <p>接口文档地址：http://localhost:8080/swagger-ui/index.html</p>
 *
 * @Since: 1.0.0
 * @Author: Arthur
 * @Version: 1.0.0
 */
@Configuration
public class SwaggerConfiguration {
	@Bean
	public Docket createAPI() {
		return new Docket(DocumentationType.SWAGGER_2)
				//生成文档相关文件信息
				.apiInfo(apiInfo())
				//设置swagger注解扫描位置
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.zhang.mims"))
				.paths(PathSelectors.any())
				.build();

	}

	/**
	 * 设定生成文档信息
	 *
	 * @return
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				//生成接口文档标题
				.title("智慧医疗信息平台-交互接口文档")
				//设置项目描述信息
				.description("前后交互接口文档")
				.version("1.0.0")
				//设置项目联系人信息
				.contact(new Contact("Arthur", "www.zhang.com", "zhang199203021817@163.com"))
				.build();
	}
}
