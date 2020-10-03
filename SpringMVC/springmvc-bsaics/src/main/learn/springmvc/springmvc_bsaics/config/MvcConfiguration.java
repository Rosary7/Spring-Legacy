package learn.springmvc.springmvc_bsaics.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.theme.ThemeChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="learn.springmvc.springmvc_bsaics")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	/*
	<bean class = "org.springframework.web.servlet.view.InternalResourceViewResolver">
	   <property name = "prefix" value = "/WEB-INF/jsp/"/>
	   <property name = "suffix" value = ".jsp"/>
	</bean>
	*/
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	//Register the MessageSource by declaring a @Bean method with messageSource name
	@Bean("messageSource")
	public MessageSource messageSource() {
		System.out.println("Inside MessageSource messageSource()...");
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:locale/messages");
		//messageSource.setCacheSeconds(2000); // Set the number of seconds to cache loaded properties files
		messageSource.setDefaultEncoding("UTF-8"); // default english
		messageSource.setUseCodeAsDefaultMessage(true);
		return messageSource;
	}

	/**
	 In Spring MVC, DispatcherServlet enables you to automatically resolve messages 
	 using the client’s locale. This is done with LocaleResolver objects
	 
	 Register the LocaleResolver to resolve the client locale.
	 */
	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver localeResolver = new CookieLocaleResolver();
		return localeResolver;
	}

	// register the LocaleChangeInterceptor in overridden method addInterceptors() of WebMvcConfigurer to set the request parameter for changing the current locale.
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		/*
		 * ThemeChangeInterceptor themeChangeInterceptor = new ThemeChangeInterceptor();
		 * themeChangeInterceptor.setParamName("theme");
		 * registry.addInterceptor(themeChangeInterceptor);
		 */

		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("lang");
		registry.addInterceptor(localeChangeInterceptor);
	}

}
