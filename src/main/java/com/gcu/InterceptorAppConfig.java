package com.gcu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class InterceptorAppConfig implements WebMvcConfigurer {
   
	@Autowired
	Tracer tracer;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(tracer);
	}
}