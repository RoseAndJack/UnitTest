/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ClassName: GlobalAopHandler
 * Package: com.xxx.aop
 * Description:
 *
 * @create: 2022-03-22 14:29
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */

@Component
@Aspect
public class ServiceGlobalAopHandler {

    public static Logger log = LogManager.getLogger(ServiceGlobalAopHandler.class);

    @Pointcut("execution(* com.it.*.*(..))")
    public void pointCut(){}

    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void afterThrowing(Exception ex){
        log.info(ex.getMessage());
    }

}
