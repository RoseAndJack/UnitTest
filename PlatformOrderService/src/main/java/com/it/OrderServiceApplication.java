/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

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
@ComponentScan(basePackages ={"com.it.*"})
@MapperScan("com.it.mapper.*")
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.it.OrderServiceApplication.class,args);
    }
}
