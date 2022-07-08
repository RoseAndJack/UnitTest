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
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.*;

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
public class OrderServiceApplication implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    private Logger log = LogManager.getLogger(OrderServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(com.it.OrderServiceApplication.class, args);
        ApplicationContext applicationContext = OrderServiceApplication.applicationContext;
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                Logger log = LogManager.getLogger(OrderServiceApplication.class);
                log.info("thread : " + Thread.currentThread().getName() + " start to stop thread pool.");
                ExecutorService executorService = (ExecutorService) applicationContext.getBean("executorService");
                Callable task =new Callable() {
                    @Override
                    public Object call() throws Exception {
                        TimeUnit.SECONDS.sleep(3);
                        return "ajax of our lines.";
                    }
                };
                Future<?> submit = executorService.submit(task);
                try {
                    System.out.println(submit.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                if (null != executorService) {
                    if (!executorService.isTerminated() || !executorService.isShutdown()) {
                        executorService.shutdown();
                    }

                    log.info(executorService.isTerminated());
                    log.info("executorService has been shutdown.");
                }
            }
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
