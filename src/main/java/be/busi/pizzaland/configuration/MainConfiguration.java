package be.busi.pizzaland.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MainConfiguration extends WebMvcConfigurerAdapter {

    /*@Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }*/

    /*@Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver resolver = new CookieLocaleResolver();
        resolver.setDefaultLocale(new Locale("fr"));
        resolver.setCookieName("myLocaleCookie");
        resolver.setCookieMaxAge(-1);
        return resolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("locale");
        registry.addInterceptor(interceptor);
    }*/

}

