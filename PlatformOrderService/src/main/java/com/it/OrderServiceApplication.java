/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.concurrent.ExecutorService;

/**
 * ClassName: OrderApplication
 * Package: com.xxx
 * Description:order服务启动类
 *
 * @create: 2022-03-21 16:47
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.it.*"})
@MapperScan("com.it.mapper.*")
@EnableTransactionManagement
@EnableCaching
public class OrderServiceApplication implements ApplicationContextAware {

    private static ApplicationContext applicationContext;
    private final static Logger log = LogManager.getLogger(OrderServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
        ApplicationContext applicationContext = OrderServiceApplication.applicationContext;
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                ExecutorService executorService = (ExecutorService) applicationContext.getBean("executorService");
                if (null != executorService) {
                    if (!executorService.isTerminated() || !executorService.isShutdown()) {
                        executorService.shutdown();

                    }
                }
            }
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
