/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName: LocalThreadPool
 * Package: com.it.config
 * Description:
 *
 * @create: 2022-07-07 16:54
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */


@Component
public class LocalThreadPool {
    private ExecutorService executorService;
    private static final int PROCESSOR_NUMBER = Runtime.getRuntime().availableProcessors();


    public LocalThreadPool() {
        executorService = Executors.newFixedThreadPool(PROCESSOR_NUMBER);
    }

    @Scope(value = "singleton")
    @Bean(name = "executorService")
    @Lazy
    public ExecutorService getExecutorService() {
        return executorService;
    }
}
