package com.cn.lc.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter
@Slf4j
public class Filter  extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        logger.debug("接收请求");
        /**
         * 因为请求体的流一般在进入aop时就被关闭了,这里这样写可以在aop里面拿到请求体,具体参考org.springframework.web.filter.AbstractRequestLoggingFilter.
         */
        if(logger.isDebugEnabled()){
            httpServletRequest = new ContentCachingRequestWrapper(httpServletRequest, 1024);
        }

        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
