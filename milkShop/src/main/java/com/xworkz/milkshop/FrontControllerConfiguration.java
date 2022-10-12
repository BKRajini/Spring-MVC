package com.xworkz.milkshop;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer
{
	private Class[] servletConfigClasses= {SpringConfiguration.class};
	private String[] servletmappings= {"/"};
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Servlet Config classes are created");
		return servletConfigClasses;
				}

	@Override
	protected String[] getServletMappings() {
		System.out.println("ServletMapping is created");
		return servletmappings ;
	}
		
		public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
			configurer.enable();
	}
  
}
