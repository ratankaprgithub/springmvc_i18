package com.cts;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class AppConfig implements WebMvcConfigurer{


	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	
	registry.addInterceptor(getLci());
	
	}
	
	
	
	@Bean
	public LocaleChangeInterceptor getLci() {
		
		LocaleChangeInterceptor lci=new LocaleChangeInterceptor();
		lci.setParamName("lang");
		
		return lci;	
	}
	
	@Bean("localeResolver")
	public LocaleResolver getLR() {
		
		SessionLocaleResolver slr=new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.US);
		
		return slr;
		
	}
	
	
	
	
	
	
	
	
	

	
	
	
}
