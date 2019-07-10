//package com.cn.lc.springboot;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Arrays;
//
///**
// * 请求参数
// */
//@Aspect
//@Component
//public class WebLogAspect {
//
//    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    @Pointcut("execution(public * com.cn.lc.springboot..*.*(..))")
//    public void webLog(){}
//
//    @Before("webLog()")
//    public void doBefore(JoinPoint joinPoint) throws Throwable {
//        // 接收到请求，记录请求内容
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//
//        // 记录下请求内容
//        logger.info("收到请求接口 : " + request.getRequestURL().toString());
//        logger.info("***************************");
//        logger.info("请求方式 : " + request.getMethod());
//        logger.info("***************************");
//        logger.info("IP : " + request.getRemoteAddr());
//        logger.info("***************************");
//        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//        logger.info("***************************");
//        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
//
//    }
//
//    @AfterReturning(returning = "ret", pointcut = "webLog()")
//    public void doAfterReturning(Object ret) throws Throwable {
//        // 处理完请求，返回内容
//        logger.info("*************请求返回数据sendData**************");
//        logger.info("RESPONSE : " + ret);
//    }
//
//}