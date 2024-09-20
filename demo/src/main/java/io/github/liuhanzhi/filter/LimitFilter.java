package io.github.liuhanzhi.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LimitFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = ((HttpServletRequest) servletRequest);
        System.out.println("进入限流过滤器：" + request.getRequestURI());
        if(request.getParameter("limit") != null) {
            int limit = Integer.parseInt(request.getParameter("limit"));
            if(limit >= 10) {
                System.out.println("触发限流：limit：" + limit);
                servletResponse.getWriter().write("触发限流：limit：" + limit);
                return;
            }

        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
