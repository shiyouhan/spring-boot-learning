package top.syhan.boot.fliter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @description: WebFilter注解配置过滤器
 * @author: syhan
 * @create: 2022-07-29
 **/
//@WebFilter(filterName = "customFilter", urlPatterns = {"/*"})
@Slf4j
public class CustomFilter implements Filter {
    //@Resource
    //private TestService testService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("customFilter 初始化");
        //log.info(testService.test());
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("customFilter 请求处理之前----doFilter方法之前过滤请求");
        //链路直接传给下一个过滤器
        chain.doFilter(request, response);
        log.info("customFilter 请求处理之后----doFilter方法之后处理响应");
    }

    @Override
    public void destroy() {
        log.info("customFilter 销毁");
    }
}
