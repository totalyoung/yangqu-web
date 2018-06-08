package com.yangqu.aspect;

import com.yangqu.datasource.DatabaseType;
import com.yangqu.datasource.DatabaseTypeHolder;
import org.apache.ibatis.binding.MapperProxy;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by yangst on 2018/6/7.
 */
@Aspect
@Component
public class DatabaseTypeAspect {


    @Pointcut("execution(* com.yangqu.mvc..dao.*.*(..))")
    public void aspectPoint(){

    }


    @Before("aspectPoint()")
    public void before(JoinPoint point)
    {

        Object target = point.getTarget();
        String method = point.getSignature().getName();
        Class<?>[] classz = target.getClass().getInterfaces();
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();
        try {
            DatabaseType data ;
            Method m = classz[0].getMethod(method, parameterTypes);
            if (m != null && m.isAnnotationPresent(DatabaseType.class)) {
                 data = m.getAnnotation(DatabaseType.class);
                DatabaseTypeHolder.putDatabaseType(data.value());
                System.out.println(data.value());
                return;
            }
            if(classz[0].isAnnotationPresent(DatabaseType.class)){
                data = classz[0].getAnnotation(DatabaseType.class);
                DatabaseTypeHolder.putDatabaseType(data.value());
                System.out.println(data.value());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
