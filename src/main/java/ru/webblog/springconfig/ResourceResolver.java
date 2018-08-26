package ru.webblog.springconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class ResourceResolver implements WebMvcConfigurer {
//	@Bean
//	public ViewResolver internalResourceViewResolver() {
//		InternalResourceViewResolver bean = new InternalResourceViewResolver();
////		bean.setViewClass(JstlView.class);
//		bean.setPrefix("/WEB-INF/view/");
//		bean.setSuffix(".jsp");
//		return bean;
//	}
//	@Bean
//	public ViewResolver resourceBundleViewResolver() {
//		ResourceBundleViewResolver bean = new ResourceBundleViewResolver();
//		bean.setBasename("views");
//		return bean;
//	}
//	@Override
//	public void configureViewResolvers(ViewResolverRegistry registry) {
//		registry.jsp("/WEB-INF/views/", ".jsp");
//	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
				.addResourceHandler("/resources/**")
				.addResourceLocations("classpath:/resources/");
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:static/js/");
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
	}

}
