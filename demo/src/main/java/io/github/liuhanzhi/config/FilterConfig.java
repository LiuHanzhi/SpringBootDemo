package io.github.liuhanzhi.config;

import io.github.liuhanzhi.filter.LimitFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<LimitFilter> limitFilter() {
        FilterRegistrationBean<LimitFilter> registrationBean = new FilterRegistrationBean<>();
        LimitFilter filter = new LimitFilter();
        registrationBean.setFilter(filter);
        registrationBean.addUrlPatterns("/limit/*");
        return registrationBean;
    }

}
