/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * ClassName: TaskExecutorConfig
 * Package: com.it.config
 * Description:
 *
 * @create: 2022-07-09 08:47
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Configuration
@EnableAsync
@ComponentScan("com.it.config")
public class TaskExecutorConfig  implements AsyncConfigurer {

    @Value(value = "${sys.dir}")
    private String sys_dir;


    @Bean(name = "getAsyncExecutor")
    @Override
    public Executor getAsyncExecutor() {

        ThreadPoolTaskExecutor executor =new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(25);
        executor.setThreadFactory(new NamedThreadFactory("async-thread-pool"));
        executor.initialize();

        return executor;
    }


}
