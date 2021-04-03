package com.gcu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class Tracer implements HandlerInterceptor {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyPortfolioBackendApplication.class);
	
    @Override
    public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	
		String controllerName = "";
		String methodName = "";

		if(handler instanceof HandlerMethod) {
			HandlerMethod handlerMethod = (HandlerMethod) handler;
			controllerName = handlerMethod.getBean().getClass().getSimpleName();
			methodName = handlerMethod.getMethod().getName();
		}

        LOGGER.info("\n-------- LoggingInterceptor.preHandle() -------- ");
        LOGGER.info("----> " + request.getMethod() + " request being called at " + request.getRequestURL());
        LOGGER.info("----> Entering " + controllerName + "." + methodName + "()");
        
        request.setAttribute("controller", controllerName);
        request.setAttribute("method", methodName);
 
        return true;
    }
 
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
 
        String controllerName = (String) request.getAttribute("controller");
        String methodName = (String) request.getAttribute("method");
    	
        LOGGER.info("\n-------- LoggingInterceptor.postHandle() -------- ");
        LOGGER.info("----> Leaving " + controllerName + "." + methodName + "()");
    	LOGGER.info("----> Response Status: {}", response.getStatus());
    }
 
    

	
}
