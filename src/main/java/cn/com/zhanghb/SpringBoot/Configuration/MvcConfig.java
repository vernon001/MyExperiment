/**                       MvcConfig.java
 *作者：张鸿波
 *创建日期：2017年11月16日
 *修改订者：
 *修订日期：
 *文件描述：提供WebMVC的配置，用于将html文件映射到网站访问目录。
 *修改订内容：             
 */
package cn.com.zhanghb.SpringBoot.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter
{

	@Override
	public void addViewControllers(ViewControllerRegistry registry)
	{
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/ContentFrame").setViewName("ContentFrame");
	}

}
